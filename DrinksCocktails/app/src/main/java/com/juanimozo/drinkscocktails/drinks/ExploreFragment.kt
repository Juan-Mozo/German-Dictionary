package com.juanimozo.drinkscocktails.drinks

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast
import androidx.core.view.ViewCompat
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.juanimozo.drinkscocktails.DrinkRecipeItemModel
import com.juanimozo.drinkscocktails.MainActivity
import com.juanimozo.drinkscocktails.R
import com.juanimozo.drinkscocktails.databinding.FragmentExploreBinding
import com.juanimozo.drinkscocktails.drinksRepository
import com.juanimozo.drinkscocktails.settings.language.Language
import com.juanimozo.drinkscocktails.settings.language.LanguagePreferences
import com.juanimozo.drinkscocktails.settings.units.UnitsPreferences

class ExploreFragment : Fragment() {

    // Binding
    private var _binding: FragmentExploreBinding? = null
    private val binding get() = _binding!!

    lateinit var sortedSpinner: Any

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentExploreBinding.inflate(inflater, container, false)
        val view = binding.root

        // Load the repository by language
        val drinkList = setDrinkList(LanguagePreferences(requireContext()), SortTypePreferences(requireContext()))
        val recipeCount = drinkList.count()

        // Spinner
        val spinner: Spinner = binding.orderBySpinner
        val sortedArray = R.array.order_by_array
            // Create ArrayAdapter using string array
        ArrayAdapter.createFromResource(
            requireContext(),
            sortedArray,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            // Specify layout to use
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            // Apply adapter
            spinner.adapter = adapter
        }

        // Spinner clickListener
        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                // Change sortBy type when loading the repository
                sortedSpinner = parent!!.getItemAtPosition(position)
                when(sortedSpinner) {
                    0 -> SortTypePreferences(requireContext()).updateSortTypePrefs(SortType.Name)
                    1 -> SortTypePreferences(requireContext()).updateSortTypePrefs(SortType.MostPopular)
                    2 -> SortTypePreferences(requireContext()).updateSortTypePrefs(SortType.Category)
                }
            }
            override fun onNothingSelected(parent: AdapterView<*>?) {
                sortedSpinner = SortTypePreferences(requireContext()).getSortTypePrefs()
            }

        }

        // RecyclerView
        val recipeListRV: RecyclerView = binding.recipeListRecyclerView
        recipeListRV.layoutManager = LinearLayoutManager(requireContext())

        // RecyclerView Adapter
        val recipeListAdapter = ExploreRecyclerViewAdapter(drinkList) { item ->
            showRecipeDetails(item)
        }
        recipeListRV.adapter = recipeListAdapter
            // Fix issue of RV inside NestedScrollView
        ViewCompat.setNestedScrollingEnabled(recipeListRV, false)

        // Display count of recipes
        val countMsg = getString(R.string.recipe_count)
        binding.recipeCountText.text = "$recipeCount $countMsg"

        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    private fun showRecipeDetails(recipeModel: DrinkRecipeItemModel) {
        val name = recipeModel.name
        val image = recipeModel.image
        val description = recipeModel.description
        val ingredient = recipeModel.ingredients
        val instruction = recipeModel.instruction
        val action = ExploreFragmentDirections.actionDrinksFragmentToRecipeDetailsFragment(name, image, description, ingredient, instruction)
        findNavController().navigate(action)
    }


    private fun setDrinkList(
        langPref: LanguagePreferences,
        sortPref: SortTypePreferences
    ): List<DrinkRecipeItemModel> {
        var drinkList: List<DrinkRecipeItemModel>
        val language = langPref.getLanguagePrefs()
        val sortType = sortPref.getSortTypePrefs()
        val recipeUnit = UnitsPreferences(requireContext()).getUnitsPrefs()

        when (language) {
            Language.en -> drinkList = drinksRepository(recipeUnit)
            Language.es -> drinkList = drinksRepositorySpanish()
        }

        when (sortType) {
            SortType.MostPopular -> drinkList.sortedBy { it.popularity }
            SortType.Category -> drinkList.sortedBy { it.category }
        }

        return drinkList
    }

    private fun restartFragment() {
    }
}
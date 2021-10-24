package com.juanimozo.drinkscocktails.drinks.presentation.explore

import android.app.Application
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RadioButton
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.juanimozo.drinkscocktails.R
import com.juanimozo.drinkscocktails.databinding.FragmentExploreBinding
import com.juanimozo.drinkscocktails.drinks.domain.model.DrinkRecipe
import com.juanimozo.drinkscocktails.drinks.domain.util.DrinksOrder
import com.juanimozo.drinkscocktails.drinks.domain.util.OrderType
import dagger.hilt.android.AndroidEntryPoint

class ExploreFragment: Fragment() {

    private var _binding: FragmentExploreBinding? = null
    private val binding get()= _binding!!

    private val viewModel: ExploreViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentExploreBinding.inflate(inflater, container, false)

        val list = viewModel.list.value!!.drinks


        val recipeListRV: RecyclerView = binding.drinkListRV
        recipeListRV.layoutManager = LinearLayoutManager(requireContext())

        val recipeListAdapter = ExploreAdapter(list) { item ->
            showRecipeDetails(item)
        }
        recipeListRV.adapter = recipeListAdapter


        val drinksCount = list.count()
        binding.listCountText.text = "$drinksCount ${R.string.recipe_count}"


        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    private fun showRecipeDetails(drink: DrinkRecipe) {
        val name = drink.name
        val image = drink.image
        val description = drink.description
        val ingredients = drink.ingredient
        val instruction = drink.instruction

        val action = ExploreFragmentDirections.actionDrinksFragmentToRecipeDetailsFragment(name, image, description, ingredients, instruction)
        findNavController().navigate(action)
    }

    private fun onRadioButtonClicked (view: View) {
        if (view is RadioButton) {
            val checked = view.isChecked

            when (view.id) {
                R.id.radio_name ->
                    if (checked) {
                        viewModel.onEvent(ExploreEvents.Order(DrinksOrder.Name(OrderType.Descending)), Application())
                    }
                R.id.radio_category ->
                    if (checked) {
                        viewModel.onEvent(ExploreEvents.Order(DrinksOrder.Category(OrderType.Descending)), Application())
                    }
                R.id.radio_popularity ->
                    if (checked) {
                        viewModel.onEvent(ExploreEvents.Order(DrinksOrder.Popularity(OrderType.Descending)), Application())
                    }
            }

        }
    }

}
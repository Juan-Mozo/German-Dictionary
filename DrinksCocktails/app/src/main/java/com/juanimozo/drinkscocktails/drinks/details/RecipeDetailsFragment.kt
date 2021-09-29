package com.juanimozo.drinkscocktails.drinks.details

import android.app.Application
import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.navArgs
import com.juanimozo.drinkscocktails.databinding.FragmentRecipeBinding
import com.juanimozo.drinkscocktails.drinks.DrinksViewModel
import com.juanimozo.drinkscocktails.drinks.DrinksViewModelFactory

class RecipeDetailsFragment : Fragment() {

    // Binding
    private var _binding: FragmentRecipeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentRecipeBinding.inflate(inflater, container, false)
        val view = binding.root

        val args: RecipeDetailsFragmentArgs by navArgs()
        val application = requireNotNull(this.activity).application
        val viewModelFactory = DrinksViewModelFactory(args, application)
        val drinksViewModel = ViewModelProvider(this, viewModelFactory).get(DrinksViewModel::class.java)

        // LiveData
        val viewStateObserver = Observer<RecipeDetailsViewState> { viewState ->
            binding.drinkName.text = viewState.name
            binding.imageView.setImageResource(viewState.image)
            binding.descriptionText.text = viewState.description
            binding.ingredientsText.text = viewState.ingredients
            binding.recipeText.text = viewState.instruction
        }
        drinksViewModel.viewState.observe(viewLifecycleOwner, viewStateObserver)

        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
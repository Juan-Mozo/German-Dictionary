package com.juanimozo.drinkscocktails.drinks

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.juanimozo.drinkscocktails.R

class DrinksFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_drinks, container, false)

        val drinkList = drinksRepository()

        // RecyclerView
        val recipeList: RecyclerView = view.findViewById(R.id.recipeListRecyclerView)
        recipeList.layoutManager = LinearLayoutManager(requireContext())
        val recipeListAdapter = DrinksAdapter(drinkList) { item ->
            showRecipeDetails(item)
        }
        recipeList.adapter = recipeListAdapter

        return view
    }

    private fun showRecipeDetails(recipe: DrinkRecipeItem) {
        val name = recipe.name
        val image = recipe.image
        val description = recipe.description
        val ingredient = recipe.ingredients
        val instruction = recipe.instruction
        val action = DrinksFragmentDirections.actionDrinksFragmentToRecipeDetailsFragment(name, image, description, ingredient, instruction)
        findNavController().navigate(action)
    }
}
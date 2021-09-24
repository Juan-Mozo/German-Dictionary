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

        // ToDo: Si funciona va al ViewModel
        val drinkList = drinksRepository()

        // RecyclerView
        val recipeList: RecyclerView = view.findViewById(R.id.recipeListRecyclerView)
        recipeList.layoutManager = LinearLayoutManager(requireContext())
        val recipeListAdapter = DrinksAdapter(drinkList)
        recipeList.adapter = recipeListAdapter

//        recipeListAdapter.submitList(drinkList)

        return view
    }

    private fun showRecipeDetails(recipe: RecipeList) {
        val name = recipe.recipe[0].name
        val image = recipe.recipe[0].image
        val description = recipe.recipe[0].description
        val ingredient = recipe.recipe[0].ingredients
        val recipe = recipe.recipe[0].recipeDetails
        val action = DrinksFragmentDirections.actionDrinksFragmentToRecipeDetailsFragment(name, image, description, ingredient, recipe)
        findNavController().navigate(action)
    }
}
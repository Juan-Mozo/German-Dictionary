package com.juanimozo.drinkscocktails.drinks.domain.repository

import com.juanimozo.drinkscocktails.drinks.domain.model.DrinkRecipe
import com.juanimozo.drinkscocktails.settings.language.Language
import com.juanimozo.drinkscocktails.settings.units.RecipeUnit

interface DrinksRepository {

    fun getDrinks(unit: RecipeUnit, language: Language): List<DrinkRecipe>

}
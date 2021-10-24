package com.juanimozo.drinkscocktails.drinks.data.repository

import com.juanimozo.drinkscocktails.drinks.data.data_source.Drinks
import com.juanimozo.drinkscocktails.drinks.domain.model.DrinkRecipe
import com.juanimozo.drinkscocktails.drinks.domain.repository.DrinksRepository
import com.juanimozo.drinkscocktails.settings.language.Language
import com.juanimozo.drinkscocktails.settings.units.RecipeUnit

class DrinksRepositoryImpl(
    private val drinks: Drinks
) : DrinksRepository {

    override fun getDrinks(unit: RecipeUnit, language: Language): List<DrinkRecipe> {
        return drinks.getDrinkList(unit, language)
    }

}
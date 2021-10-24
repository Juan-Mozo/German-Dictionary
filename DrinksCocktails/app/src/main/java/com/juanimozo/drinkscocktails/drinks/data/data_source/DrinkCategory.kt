package com.juanimozo.drinkscocktails.drinks.data.data_source

import com.juanimozo.drinkscocktails.R
import com.juanimozo.drinkscocktails.drinks.domain.model.Category
import com.juanimozo.drinkscocktails.drinks.domain.util.DrinksOrder

fun drinkCategory(): Map<String, Category> {
    return mapOf(
        "bloody mary" to Category.Tropical,
        "cosmopolitan" to Category.Old,
        "daiquiri" to Category.Tropical
    )
}
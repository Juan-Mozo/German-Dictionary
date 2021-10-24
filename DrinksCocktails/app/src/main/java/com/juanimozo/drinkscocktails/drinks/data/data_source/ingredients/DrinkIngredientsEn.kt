package com.juanimozo.drinkscocktails.drinks.data.data_source.ingredients

import com.juanimozo.drinkscocktails.settings.units.RecipeUnit

fun drinkIngredients(unit: RecipeUnit): Map<String, String> {

    fun unitConverter(num: Double): String {
        return when(unit) {
            RecipeUnit.oz -> {
                "$num oz"
            }
            RecipeUnit.ml -> {
                num * 35
                num.toInt()
                "$num ml"
            }
        }
    }

    return mapOf(
        "bloody mary" to "${unitConverter(2.0)}Ingredients prueba",
        "cosmopolitan" to "${unitConverter(5.5)}Ingredients prueba",
        "daiquiri" to "${unitConverter(1.25)}Ingredients prueba"
    )
}
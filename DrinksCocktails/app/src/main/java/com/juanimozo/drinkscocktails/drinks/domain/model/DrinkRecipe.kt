package com.juanimozo.drinkscocktails.drinks.domain.model

data class DrinkRecipe(
    val name: String,
    val image: Int,
    val description: String,
    val ingredient: String,
    val instruction: String,
    val category: Category,
    val popularity: Int
)

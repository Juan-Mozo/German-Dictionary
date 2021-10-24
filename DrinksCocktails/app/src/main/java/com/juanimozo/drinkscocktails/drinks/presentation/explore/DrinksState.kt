package com.juanimozo.drinkscocktails.drinks.presentation.explore

import com.juanimozo.drinkscocktails.drinks.domain.model.DrinkRecipe
import com.juanimozo.drinkscocktails.drinks.domain.util.DrinksOrder
import com.juanimozo.drinkscocktails.drinks.domain.util.OrderType

data class DrinksState(
    val drinks: List<DrinkRecipe> = emptyList(),
    val drinksOrder: DrinksOrder = DrinksOrder.Name(OrderType.Descending)
)

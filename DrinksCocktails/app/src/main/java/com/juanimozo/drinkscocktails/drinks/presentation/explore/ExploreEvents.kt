package com.juanimozo.drinkscocktails.drinks.presentation.explore

import com.juanimozo.drinkscocktails.drinks.domain.util.DrinksOrder

sealed class ExploreEvents {
    data class Order(val drinksOrder: DrinksOrder): ExploreEvents()
}

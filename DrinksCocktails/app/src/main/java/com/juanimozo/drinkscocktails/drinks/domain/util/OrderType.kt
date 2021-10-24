package com.juanimozo.drinkscocktails.drinks.domain.util

sealed class OrderType {
    object Ascending: OrderType()
    object Descending: OrderType()
}

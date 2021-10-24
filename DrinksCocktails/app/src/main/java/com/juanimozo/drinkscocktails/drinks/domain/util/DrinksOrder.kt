package com.juanimozo.drinkscocktails.drinks.domain.util

sealed class DrinksOrder(val orderType: OrderType) {
    class Name(orderType: OrderType): DrinksOrder(orderType)
    class Category(orderType: OrderType): DrinksOrder(orderType)
    class Popularity(orderType: OrderType): DrinksOrder(orderType)

    fun copy(orderType: OrderType): DrinksOrder {
        return when(this) {
            is Name -> Name(orderType)
            is Category -> Name(orderType)
            is Popularity -> Name(orderType)
        }
    }
}

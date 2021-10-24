package com.juanimozo.drinkscocktails.drinks.domain.use_case

import android.content.Context
import com.juanimozo.drinkscocktails.drinks.domain.model.DrinkRecipe
import com.juanimozo.drinkscocktails.drinks.domain.repository.DrinksRepository
import com.juanimozo.drinkscocktails.drinks.domain.util.DrinksOrder
import com.juanimozo.drinkscocktails.drinks.domain.util.OrderType
import com.juanimozo.drinkscocktails.settings.language.Language
import com.juanimozo.drinkscocktails.settings.language.LanguagePreferences
import com.juanimozo.drinkscocktails.settings.units.UnitsPreferences

class GetDrinks(
    private val repository: DrinksRepository
) {
    operator fun invoke(
        drinksOrder: DrinksOrder,
        context: Context
    ): List<DrinkRecipe> {

        val language = LanguagePreferences(context).getLanguagePrefs()
        val unit = UnitsPreferences(context).getUnitsPrefs()

        val drinkList = repository.getDrinks(unit, language)

        return when (drinksOrder.orderType) {
            is OrderType.Ascending -> {
                when (drinksOrder) {
                    is DrinksOrder.Name -> drinkList.sortedBy { it.name }
                    is DrinksOrder.Category -> drinkList.sortedBy { it.category }
                    is DrinksOrder.Popularity -> drinkList.sortedBy { it.popularity }
                }
            }
            is OrderType.Descending -> {
                when (drinksOrder) {
                    is DrinksOrder.Name -> drinkList.sortedByDescending { it.name }
                    is DrinksOrder.Category -> drinkList.sortedByDescending { it.category }
                    is DrinksOrder.Popularity -> drinkList.sortedByDescending { it.popularity }
                }
            }
        }
    }
}
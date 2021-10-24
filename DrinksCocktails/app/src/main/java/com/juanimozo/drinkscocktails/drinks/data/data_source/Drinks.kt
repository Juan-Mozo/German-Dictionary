package com.juanimozo.drinkscocktails.drinks.data.data_source

import com.juanimozo.drinkscocktails.drinks.data.data_source.descriptions.drinkDescriptions
import com.juanimozo.drinkscocktails.drinks.data.data_source.descriptions.drinkDescriptionsSp
import com.juanimozo.drinkscocktails.drinks.data.data_source.ingredients.drinkIngredients
import com.juanimozo.drinkscocktails.drinks.data.data_source.ingredients.drinkIngredientsSp
import com.juanimozo.drinkscocktails.drinks.data.data_source.instructions.drinkInstruction
import com.juanimozo.drinkscocktails.drinks.data.data_source.instructions.drinkInstructionSp
import com.juanimozo.drinkscocktails.drinks.data.data_source.instructions.drinkPopularity
import com.juanimozo.drinkscocktails.drinks.domain.model.Category
import com.juanimozo.drinkscocktails.drinks.domain.model.DrinkRecipe
import com.juanimozo.drinkscocktails.settings.language.Language
import com.juanimozo.drinkscocktails.settings.units.RecipeUnit

class Drinks {

    val drinkKeyList = listOf(
        "bloody mary",
        "cosmopolitan",
        "daiquiri"
    )

    fun getDrinkList(unit: RecipeUnit, language: Language): List<DrinkRecipe> {

        val list: List<DrinkRecipe> = when (language) {
            Language.en -> {
                drinkKeyList.map { key ->
                    return listOf(DrinkRecipe(key, drinkImages()[key]!!, drinkDescriptions()[key]!!, drinkIngredients(unit)[key]!!, drinkInstruction()[key]!!, drinkCategory()[key]!!, drinkPopularity()[key]!!))
                }
            }
            Language.es -> {
                drinkKeyList.map { key ->
                    return listOf(DrinkRecipe(key, drinkImages()[key]!!, drinkDescriptionsSp()[key]!!, drinkIngredientsSp(unit)[key]!!, drinkInstructionSp()[key]!!, drinkCategory()[key]!!, drinkPopularity()[key]!!))
                }
            }
        }

        return list
    }
}




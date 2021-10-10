package com.juanimozo.drinkscocktails.settings.units

import android.content.Context
import android.content.SharedPreferences

enum class RecipeUnit {
    oz, ml
}

class UnitsPreferences(context: Context) {

    private val unitPrefs: SharedPreferences = context.getSharedPreferences("unit", Context.MODE_PRIVATE)

    fun updateUnitsPrefs(unit: RecipeUnit) {
        unitPrefs.edit().putString("key_unit_display", unit.name).apply()
    }

    fun getUnitsPrefs() : RecipeUnit {
        val setUnitsValue = unitPrefs.getString("key_unit_display", RecipeUnit.ml.name) ?: RecipeUnit.ml.name
        return RecipeUnit.valueOf(setUnitsValue)
    }
}
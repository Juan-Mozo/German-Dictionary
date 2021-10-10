package com.juanimozo.drinkscocktails.drinks

import android.content.Context
import android.content.SharedPreferences

enum class SortType {
    Name, MostPopular, Category
}

class SortTypePreferences(context: Context) {

    private val sortTypePrefs: SharedPreferences = context.getSharedPreferences("sortType", Context.MODE_PRIVATE)

    fun updateSortTypePrefs(sortType: SortType) {
        sortTypePrefs.edit().putString("key_language_display", sortType.name).apply()
    }

    fun getSortTypePrefs() : SortType {
        val setSortTypeValue = sortTypePrefs.getString("key_sortType_display", SortType.Name.name) ?: SortType.Name.name
        return SortType.valueOf(setSortTypeValue)
    }
}
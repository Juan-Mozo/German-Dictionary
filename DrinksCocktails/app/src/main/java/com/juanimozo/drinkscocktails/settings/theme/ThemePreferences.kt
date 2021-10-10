package com.juanimozo.drinkscocktails.settings.theme

import android.content.Context
import android.content.SharedPreferences

enum class Theme {
    Light, Dark, Neon
}

class ThemePreferences(context: Context) {

    private val themePrefs: SharedPreferences = context.getSharedPreferences("theme", Context.MODE_PRIVATE)

    fun updateThemePrefs(theme: Theme) {
        themePrefs.edit().putString("key_theme_display", theme.name).apply()
    }

    fun getThemePrefs() : Theme {
        val setThemeValue = themePrefs.getString("key_theme_display", Theme.Light.name) ?: Theme.Light.name
        return Theme.valueOf(setThemeValue)
    }
}
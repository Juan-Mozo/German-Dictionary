package com.juanimozo.drinkscocktails.settings.language

import android.content.Context
import android.content.SharedPreferences

enum class Language {
    en, es
}

class LanguagePreferences(context: Context) {

    private val languagePrefs: SharedPreferences = context.getSharedPreferences("language", Context.MODE_PRIVATE)

    fun updateLanguagePrefs(language: Language) {
        languagePrefs.edit().putString("key_language_display", language.name).apply()
    }

    fun getLanguagePrefs() : Language {
        val setLanguageValue = languagePrefs.getString("key_language_display", Language.en.name) ?: Language.en.name
        return Language.valueOf(setLanguageValue)
    }
}

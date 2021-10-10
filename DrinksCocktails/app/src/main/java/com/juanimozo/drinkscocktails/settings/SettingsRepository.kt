package com.juanimozo.drinkscocktails.settings

import com.juanimozo.drinkscocktails.R

data class SettingsItemModel(
    var icon: Int,
    var title: String,
    var description: String,
    var position: Int
)

fun settingsRepository() : List<SettingsItemModel> {
    return listOf(
        SettingsItemModel(R.drawable.ic_language,"Language", "Manage which language is displayed", 0),
        SettingsItemModel(R.drawable.ic_units,"Units","Select which type of unit show", 1),
        SettingsItemModel(R.drawable.ic_theme, "Theme", "Select color and theme",2)
    )
}

fun settingsRepositorySpanish() : List<SettingsItemModel> {
    return listOf(
        SettingsItemModel(R.drawable.ic_language,"Lenguaje", "Elegir lenguaje", 0),
        SettingsItemModel(R.drawable.ic_units,"Unidades","Seleccionar el tipo de unidades a mostrar", 1),
        SettingsItemModel(R.drawable.ic_theme, "Tema", "Elegir color y tema",2)
    )
}
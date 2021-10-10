package com.juanimozo.drinkscocktails.settings.theme

import android.app.Application
import androidx.lifecycle.*

class ThemeSettingsViewModel(
    application: Application
) : AndroidViewModel(application) {

    // Receive instances of Shared Preferences
    private val _viewState: MutableLiveData<Theme> = MutableLiveData()
    // Send the new instances to LanguageSettingsFragment
    val viewState: LiveData<Theme> = _viewState

    init {
        _viewState.value = ThemePreferences(application).getThemePrefs()
    }

}

// Factory for RecipeDetailsFragment
class ThemeSettingsViewModelFactory(
    private val application: Application
) : ViewModelProvider.Factory {
    @Suppress("unchecked_cast")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(ThemeSettingsViewModel::class.java)) {
            return ThemeSettingsViewModel(application) as T
        }
        throw IllegalArgumentException("Unknown ViewModelClass")
    }
}
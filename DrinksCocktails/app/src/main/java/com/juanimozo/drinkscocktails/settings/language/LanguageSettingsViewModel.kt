package com.juanimozo.drinkscocktails.settings.language

import android.app.Application
import androidx.lifecycle.*

class LanguageSettingsViewModel(
    application: Application
) : AndroidViewModel(application) {

    // Receive instances of Shared Preferences
    private val _viewState: MutableLiveData<Language> = MutableLiveData()
    // Send the new instances to LanguageSettingsFragment
    val viewState: LiveData<Language> = _viewState

    init {
        _viewState.value = LanguagePreferences(application).getLanguagePrefs()
    }

}

// Factory for RecipeDetailsFragment
class LanguageSettingsViewModelFactory(
    private val application: Application
) : ViewModelProvider.Factory {
    @Suppress("unchecked_cast")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(LanguageSettingsViewModel::class.java)) {
            return LanguageSettingsViewModel(application) as T
        }
        throw IllegalArgumentException("Unknown ViewModelClass")
    }
}
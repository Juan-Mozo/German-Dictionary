package com.juanimozo.drinkscocktails.settings.units

import android.app.Application
import androidx.lifecycle.*

class UnitsSettingsViewModel(
    application: Application
) : AndroidViewModel(application) {

    // Receive instances of Shared Preferences
    private val _viewState: MutableLiveData<RecipeUnit> = MutableLiveData()
    // Send the new instances to UnitsSettingsFragment
    val viewState: LiveData<RecipeUnit> = _viewState

    init {
        _viewState.value = UnitsPreferences(application).getUnitsPrefs()
    }

}

// Factory for RecipeDetailsFragment
class UnitsSettingsViewModelFactory(
    private val application: Application
) : ViewModelProvider.Factory {
    @Suppress("unchecked_cast")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(UnitsSettingsViewModel::class.java)) {
            return UnitsSettingsViewModel(application) as T
        }
        throw IllegalArgumentException("Unknown ViewModelClass")
    }
}
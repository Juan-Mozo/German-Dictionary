package com.juanimozo.drinkscocktails.drinks

import android.app.Application
import androidx.lifecycle.*
import com.juanimozo.drinkscocktails.drinks.details.RecipeDetailsFragmentArgs
import com.juanimozo.drinkscocktails.drinks.details.RecipeDetailsViewState

class DrinksViewModel(
    args: RecipeDetailsFragmentArgs,
    application: Application
) : AndroidViewModel(application) {

    // Receive instances of ViewState
    private val _viewState: MutableLiveData<RecipeDetailsViewState> = MutableLiveData()
    // Send the new instances to RecipeDetailsFragment
    val viewState: LiveData<RecipeDetailsViewState> = _viewState

    init {
        _viewState.value = RecipeDetailsViewState(
            name = args.name,
            image = args.image,
            description = args.description,
            ingredients = args.ingredient,
            instruction = args.instruction
        )
    }
}

// Factory for RecipeDetailsFragment
class DrinksViewModelFactory(
    private val args: RecipeDetailsFragmentArgs,
    private val application: Application
) : ViewModelProvider.Factory {
    @Suppress("unchecked_cast")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(DrinksViewModel::class.java)) {
            return DrinksViewModel(args, application) as T
        }
        throw IllegalArgumentException("Unknown ViewModelClass")
    }
}

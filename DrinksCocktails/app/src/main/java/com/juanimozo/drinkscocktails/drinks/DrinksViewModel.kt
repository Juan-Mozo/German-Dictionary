package com.juanimozo.drinkscocktails.drinks

import android.app.Application
import androidx.lifecycle.AndroidViewModel

class DrinksViewModel(
    application: Application
) : AndroidViewModel(application) {

}

class DrinksViewModelFactory(
    dataSource: DrinkRecipe
)
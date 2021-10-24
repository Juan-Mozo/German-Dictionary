package com.juanimozo.drinkscocktails.drinks.presentation.explore

import android.app.Application
import android.content.Context
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.juanimozo.drinkscocktails.drinks.domain.use_case.DrinkUseCases
import com.juanimozo.drinkscocktails.drinks.domain.util.DrinksOrder
import com.juanimozo.drinkscocktails.drinks.domain.util.OrderType
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Job
import javax.inject.Inject

@HiltViewModel
class ExploreViewModel @Inject constructor(
    private val drinkUseCases: DrinkUseCases,
    application: Application
) : AndroidViewModel(application) {

    private val _list = MutableLiveData(DrinksState())
    val list: LiveData<DrinksState> = _list

    init {
        drinkUseCases.getDrinks(DrinksOrder.Name(OrderType.Descending), application)
    }

    fun onEvent(event: ExploreEvents, application: Application) {
        when (event) {
            is ExploreEvents.Order -> {
                if (list.value!!.drinksOrder::class == event.drinksOrder::class &&
                        list.value!!.drinksOrder.orderType == event.drinksOrder.orderType
                ) {
                    return
                }
                drinkUseCases.getDrinks(event.drinksOrder, application)
            }
        }
    }
}
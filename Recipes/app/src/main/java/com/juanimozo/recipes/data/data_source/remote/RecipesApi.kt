package com.juanimozo.recipes.data.data_source.remote

import retrofit2.http.GET
import retrofit2.http.Path

interface SpoonacularApi {

    @GET("/recipes/random")
    suspend fun getRandomRecipes(

    )

}
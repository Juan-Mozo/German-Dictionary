package com.juanimozo.drinkscocktails.drinks

import com.juanimozo.drinkscocktails.R

data class DrinkRecipe(
    val name: String,
    val image: Int,
    val description: String,
    val ingredients: String,
    val recipeDetails: String,
    val category: Int,
    val language: String
)

data class RecipeList(
    val recipe: List<DrinkRecipe>
)

fun drinksRepository(): List<DrinkRecipe> {


    // Descriptions

    // Ingredients

    // RecipeDetails

    // Category

    // Languages

    return listOf(
        DrinkRecipe("Bloody Mary", bloodyMaryImage,"Bebida de qsy","2 vasos", "batir energicamente",2,"ESP"),
        DrinkRecipe("Cosmopolitan", cosmopolitanImage,"Bebida de qsy","2 vasos", "batir energicamente",2,"ESP"),
        DrinkRecipe("Daiquiri", daiquiriImage,"Bebida de qsy","2 vasos", "batir energicamente",2,"ESP"),
        DrinkRecipe("Gin Tonic", ginTonicImage,"Bebida de qsy","2 vasos", "batir energicamente",2,"ESP"),
        DrinkRecipe("Manhattan", manhattanImage,"Bebida de qsy","2 vasos", "batir energicamente",2,"ESP"),
        DrinkRecipe("Margarita", margaritaImage,"Bebida de qsy","2 vasos", "batir energicamente",2,"ESP"),
        DrinkRecipe("Martini", martiniImage,"Bebida de qsy","2 vasos", "batir energicamente",2,"ESP"),
        DrinkRecipe("Mojito", mojitoImage,"Bebida de qsy","2 vasos", "batir energicamente",2,"ESP"),
        DrinkRecipe("Monkey Gland", monkeyGlandImage,"Bebida de qsy","2 vasos", "batir energicamente",2,"ESP"),
        DrinkRecipe("Negroni", negroniImage,"Bebida de qsy","2 vasos", "batir energicamente",2,"ESP"),
        DrinkRecipe("Old Fashioned", oldFashionedImage,"Bebida de qsy","2 vasos", "batir energicamente",2,"ESP"),
        DrinkRecipe("Paradise", paradiseImage,"Bebida de qsy","2 vasos", "batir energicamente",2,"ESP"),
        DrinkRecipe("Porn Star Martini", pornStarMartiniImage,"Bebida de qsy","2 vasos", "batir energicamente",2,"ESP"),
        DrinkRecipe("Spritz Veneziano", spritzVenezianoImage,"Bebida de qsy","2 vasos", "batir energicamente",2,"ESP"),
        DrinkRecipe("Strawberry Mojito", strawberryMojitoImage,"Bebida de qsy","2 vasos", "batir energicamente",2,"ESP"),
    )

}

// Images
    val bloodyMaryImage = R.drawable.bloody_mary
    val cosmopolitanImage = R.drawable.cosmopolitan
    val daiquiriImage = R.drawable.daiquiri
    val ginTonicImage = R.drawable.gin_tonic
    val manhattanImage = R.drawable.manhattan
    val margaritaImage = R.drawable.margarita
    val martiniImage = R.drawable.martini
    val mojitoImage = R.drawable.mojito
    val monkeyGlandImage = R.drawable.monkey_gland
    val negroniImage = R.drawable.negroni
    val oldFashionedImage = R.drawable.old_fashioned
    val paradiseImage = R.drawable.paradise
    val pornStarMartiniImage = R.drawable.porn_star_martini
    val spritzVenezianoImage = R.drawable.spritz_veneziano
    val strawberryMojitoImage = R.drawable.strawberry_mojito

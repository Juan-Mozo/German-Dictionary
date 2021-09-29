package com.juanimozo.drinkscocktails.drinks

import com.juanimozo.drinkscocktails.R

data class DrinkRecipeItem(
    val name: String,
    val image: Int,
    val description: String,
    val ingredients: String,
    val instruction: String,
    val category: Int,
    val language: String
)

fun drinksRepository(): List<DrinkRecipeItem> {

    return listOf(
        DrinkRecipeItem("Bloody Mary", bloodyMaryImage, bloodyMaryDescription, bloodyMaryIngredients, bloodyMaryIntructions,2,"ESP"),
        DrinkRecipeItem("Cosmopolitan", cosmopolitanImage, cosmopolitanDescription, cosmopolitanIngredients, cosmopolitanInstructions,2,"ESP"),
        DrinkRecipeItem("Daiquiri", daiquiriImage, daiquiriDescription, daiquiriIngredients, daiquiriInstructions,2,"ESP"),
        DrinkRecipeItem("Gin & Tonic", ginTonicImage, ginTonicDescription, ginTonicIngredients, ginTonicInstructions,2,"ESP"),
        DrinkRecipeItem("Manhattan", manhattanImage, manhattanDescription, manhattanIngredients, manhattanInstructions,2,"ESP"),
        DrinkRecipeItem("Margarita", margaritaImage,"Bebida de qsy","2 vasos", "batir energicamente",2,"ESP"),
        DrinkRecipeItem("Dry Martini", martiniImage,"Bebida de qsy","2 vasos", "batir energicamente",2,"ESP"),
        DrinkRecipeItem("Mojito", mojitoImage,"Bebida de qsy","2 vasos", "batir energicamente",2,"ESP"),
        DrinkRecipeItem("Monkey Gland", monkeyGlandImage,"Bebida de qsy","2 vasos", "batir energicamente",2,"ESP"),
        DrinkRecipeItem("Negroni", negroniImage,"Bebida de qsy","2 vasos", "batir energicamente",2,"ESP"),
        DrinkRecipeItem("Brandy Old Fashioned", oldFashionedImage,"Bebida de qsy","2 vasos", "batir energicamente",2,"ESP"),
        DrinkRecipeItem("Paradise", paradiseImage,"Bebida de qsy","2 vasos", "batir energicamente",2,"ESP"),
        DrinkRecipeItem("Porn Star Martini", pornStarMartiniImage,"Bebida de qsy","2 vasos", "batir energicamente",2,"ESP"),
        DrinkRecipeItem("Spritz Veneziano", spritzVenezianoImage,"Bebida de qsy","2 vasos", "batir energicamente",2,"ESP"),
        DrinkRecipeItem("Strawberry Mojito", strawberryMojitoImage,"Bebida de qsy","2 vasos", "batir energicamente",2,"ESP"),
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

// Descriptions

val bloodyMaryDescription = "The Bloody Mary is one of the world’s best known cocktails, prized for its ability to jumpstart even the groggiest of mornings. Its origins aren’t exactly clear, but the likely backstory points to the mid-1930s and Fernand “Pete” Petiot, a bartender at King Cole Bar at the St. Regis hotel in New York City.\n" +
        "\n" +
        "The original Bloody Mary is believed to have contained seven ingredients: vodka, tomato juice, Worcestershire sauce, black pepper, celery salt, Tabasco and lemon juice. But like many classic drinks, it has inspired several variations. Popular versions include the Bloody Maria (made with tequila), the Red Snapper (spiked with gin) and the Caesar, a Canadian creation that features Clamato juice. Throw in the recipes concocted by bars, bartenders and enthusiasts, and the tomato-based cocktail sports countless unique twists, from heavy on the hot sauce to a splash of Guinness on top.\n" +
        "\n" +
        "More recently, the Bloody Mary has inspired a garnish-based arms race, as restaurants and bars top their drinks with more insane garnishes, including bacon, shrimp skewers, lobster tails and mini cheeseburgers, turning the Bloody Mary into its own brunch. When in doubt, it’s best to start with the classic recipe and work toward the way you like it, whether that is pared down, topped with a pepperoni pizza or featuring your favorite bottled mix."
val cosmopolitanDescription = "The legendary Cosmopolitan is a simple cocktail with a big history. It reached its height of popularity in the 1990s, when the HBO show “Sex and the City” was at its peak. The pink-hued, Martini-style drink was a favorite of the characters on the show. It made its debut during the second season and became a series regular after that.\n" +
        "\n" +
        "For a good decade, the Cosmopolitan may have been the most popular cocktail in America, and bartenders couldn’t work a shift without making dozens of them for thirsty patrons. Naturally, its ubiquity spurred countless riffs, from the White Cosmo (St-Germain in place of Cointreau) to versions featuring gin. While the drink isn’t as popular today as it was in its heyday, the classic recipe is still very much alive.\n" +
        "\n" +
        "According to bartending legend and author Gary Regan, the original Cosmopolitan was created in 1985 by Miami bartender Cheryl Cook while working at a South Beach bar called the Strand. Eager to invent a new cocktail for the Martini glass, Cook riffed on the classic Kamikaze by using a newly introduced citrus-flavored vodka, plus a splash of cranberry juice."
val daiquiriDescription = "The Daiquiri was supposedly invented in 1898 in the eponymous mining town of Daiquiri on the southeastern tip of Cuba by an American mining engineer named Jennings Cox. It was introduced in the United States a decade later, when a U.S. Navy medical officer brought the recipe from Cuba to Washington, D.C.\n" +
        "\n" +
        "This three-ingredient gift has pleased millions of palates over the ensuing years, including household names like Ernest Hemingway and President JFK. Yet no drink has suffered more abuse than the Daiquiri. In the century-plus since its inception, the granddaddy of rum cocktails has gone from the pride of Havana to an unloved extra on the back of a Señor Frog’s table tent. Even today, as the craft cocktail movement reaches full tilt, most people too often associate the Daiquiri with neon-colored adult slushies, the stuff of spring-break blackouts and mind-splitting hangovers.\n" +
        "\n" +
        "But in its purest form, the Daiquiri is simple and sublime, a delicate blend of rum’s sweetness with the raw freshness of sugar and lime juice. Whole lives have been dedicated to balancing those three elements. That each ingredient should be of the highest quality goes without saying, though even then the Daiquiri can throw you a curve. Choose an overly sweet rum or use too much sugar, and you’re left sipping liquid candy; overdo the citrus, and the cocktail drowns in a puckering pool of acidity."
val ginTonicDescription = "A Gin & Tonic made with a potent base—45% ABV and above, if you mean business—and configured with two parts tonic to one part gin is a highball of balance and beauty. Too much gin, and the botanical spirit will overshadow the unique qualities of the tonic. Too much tonic, and it will drown the gin.\n" +
        "\n" +
        "There is endless room for experimentation within those two ingredients. With hundreds of gins on the market and dozens of tonics, a good G&T is a mix-and-match exercise to find the combination that best suits your tastes. London dry gins are characterized by their juniper-forward flavor profile; modern-style gins often dial down the juniper and ramp up the citrus and florals. Some tonics are dry and straightforward, with prominent notes of bitter quinine. Others are sweet and syrupy. And in between, you’ll find tonics featuring everything from citrus and aromatics to herbs and spice. Then, of course, there’s the garnish. Many people swear by a lime. Others choose a lemon, and still others prefer a grapefruit slice or rosemary sprig.\n" +
        "\n" +
        "All those permutations results in a bevy of Gin & Tonics, so naturally, the drink lends itself to creativity. Muddled cucumbers or fruit provide an extra dose of refreshment, and a measure of dry vermouth softens the cocktail. Liqueurs, fresh herbs and even barrel-aged gin are all fair game when you’re making G&Ts. It’s an impressive résumé for a drink that traces its roots to quinine powder, which was used in the 1840s as an antimalarial for British soldiers and citizens in India."
val manhattanDescription = "The Manhattan was the most famous cocktail in the world shortly after it was invented in New York City’s Manhattan Club, some time around 1880 (as the story goes). Over the years, the whiskey classic has dipped in and out of fashion before finding its footing as one of the cornerstones of the craft cocktail renaissance.\n" +
        "\n" +
        "Amazingly, the drink that socialites tipped to their lips in the 19th century looks and tastes pretty much the same as the one served today at any decent cocktail bar. The Manhattan’s mix of American whiskey and Italian vermouth, enlivened with a few dashes of aromatic bitters, is timeless and tasty—the very definition of what a cocktail should be.\n" +
        "\n" +
        "Early versions call for rye, with its spicier, edgier profile. Purists claim that it’s not a Manhattan without it, but who has ever had fun drinking with a purist? We find that bourbon creates a beautiful, if mellower, drink. And while Angostura bitters are a must in any variation, a single dash of orange bitters helps brighten the cocktail’s edges, bringing the whiskey and vermouth together seamlessly, while the brandied cherry garnish lends a touch of sweetness."
// Ingredients

val bloodyMaryIngredients = "1 lemon wedge. \n 1 lime wedge. \n 2 ounces vodka"
val cosmopolitanIngredients = "1 1/2 ounces citrus vodka\n" +
        "1 ounce Cointreau\n" +
        "1/2 ounce lime juice, freshly squeezed\n" +
        "1/4 ounce cranberry juice\n" +
        "Garnish: lime wedge"
val daiquiriIngredients = "2 ounces light rum\n" +
        "1 ounce lime juice, freshly squeezed\n" +
        "3/4 ounce demerara sugar syrup\n" +
        "Garnish: lime twist"
val ginTonicIngredients = "2 ounces gin\n" +
        "4 ounces tonic water\n" +
        "Garnish: 2 lime wheels"
val manhattanIngredients = "2 ounces bourbon or rye\n" +
        "1 ounce sweet vermouth\n" +
        "2 dashes Angostura bitters\n" +
        "1 dash orange bitters\n" +
        "Garnish: brandied cherry"
// Instructions

val bloodyMaryIntructions = "Pour some celery salt onto a small plate. \n Rub the juicy side of the lemon or lime wedge along the lip of a pint glass. \n Roll the outer edge of the glass in celery salt ultil fully coated, then fill the glass with ice and set aside"
val cosmopolitanInstructions = "Add the vodka, Cointreau, lime juice and cranberry juice to a shaker with ice and shake until well-chilled.\n" +
        "Strain into a chilled cocktail glass.\n" +
        "Garnish with a lime wedge."
val daiquiriInstructions = "Add the rum, lime juice and demerara sugar syrup to a shaker with ice, and shake until well-chilled.\n" +
        "\n" +
        "Strain into a chilled coupe.\n" +
        "\n" +
        "Garnish with a lime twist."
val ginTonicInstructions = "Fill a highball glass with ice, then add the gin.\n" +
        "\n" +
        "Top with the tonic water and gently stir.\n" +
        "\n" +
        "Garnish with lime wheels."
val manhattanInstructions = "Add the bourbon (or rye), sweet vermouth and both bitters to a mixing glass with ice, and stir until well-chilled.\n" +
        "\n" +
        "Strain into a chilled coupe.\n" +
        "\n" +
        "Garnish with a brandied cherry"
// Category

// Languages

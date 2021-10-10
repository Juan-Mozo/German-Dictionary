package com.juanimozo.drinkscocktails.drinks

import com.juanimozo.drinkscocktails.*

fun drinksRepositorySpanish(): List<DrinkRecipeItemModel> {

    return listOf(
        DrinkRecipeItemModel("Bloody Mary", bloodyMaryImage, bloodyMaryDescriptionEsp, bloodyMaryIngredientsEsp, bloodyMaryIntructionsEsp,2, 3),
        DrinkRecipeItemModel("Cosmopolitan", cosmopolitanImage, cosmopolitanDescriptionEsp, cosmopolitanIngredientsEsp, cosmopolitanInstructionsEsp,2, 4),
        DrinkRecipeItemModel("Daiquiri", daiquiriImage, daiquiriDescriptionEsp, daiquiriIngredientsEsp, daiquiriInstructionsEsp,2, 1),
        DrinkRecipeItemModel("Gin & Tonic", ginTonicImage, ginTonicDescriptionEsp, ginTonicIngredientsEsp, ginTonicInstructionsEsp,2, 1),
        DrinkRecipeItemModel("Manhattan", manhattanImage, manhattanDescriptionEsp, manhattanIngredientsEsp, manhattanInstructionsEsp,2, 3),
        DrinkRecipeItemModel("Margarita", margaritaImage, margaritaDescriptionEsp, margaritaIngredientsEsp, margaritaIngredientsEsp,2, 1),
        DrinkRecipeItemModel("Dry Martini", martiniImage, dryMartiniDescriptionEsp, dryMartiniIngredientsEsp, dryMartiniInstructionsEsp,2, 5),
        DrinkRecipeItemModel("Mojito", mojitoImage, mojitoDescriptionEsp, mojitoIngredientsEsp, mojitoInstructionsEsp,2, 1),
        DrinkRecipeItemModel("Monkey Gland", monkeyGlandImage, monkeyGlandDescriptionEsp, monkeyGlandIngredientsEsp, monkeyGlandInstructionsEsp,2, 6),
        DrinkRecipeItemModel("Negroni", negroniImage, negroniDescriptionEsp, negroniIngredientsEsp, negroniInstructionsEsp,2, 2),
        DrinkRecipeItemModel("Brandy Old Fashioned", brandyOldFashionedImage,brandyOldFashionedDescriptionEsp, brandyOldFashionedIngredientsEsp, brandyOldFashionesInstructionsEsp, 2, 4),
        DrinkRecipeItemModel("Paradise", paradiseImage, paradiseDescriptionEsp, paradiseIngredientsEsp, paradiseInstructionsEsp,2, 5),
        DrinkRecipeItemModel("Porn Star Martini", pornStarMartiniImage, pornStarMartiniDescriptionEsp, pornStarMartiniIngredientsEsp, pornStarMartiniInstructionsEsp,2, 6),
        DrinkRecipeItemModel("Spritz Veneziano", spritzVenezianoImage, spritzVenezianoDescriptionEsp, spritzVenezianoIngredientsEsp, spritzVenezianoInstructionsEsp,2, 6),
        DrinkRecipeItemModel("Strawberry Mojito", strawberryMojitoImage, strawberryMojitoDescriptionEsp, strawberryMojitoIngredientsEsp, strawberryMojitoInstructionsEsp,2, 3),
    )

}

// Descriptions
val bloodyMaryDescriptionEsp = "El Bloody Mary es uno de los cócteles más reconocidos del mundo, distinguido por su capacidad de levantar el ánimo de cualquier mañana. Sus origen no es muy claro, pero posiblemente se remonte a mediados de 1930 y a Fernand “Pete” Petiot, un bartender del King Cole Bar en el hotel St. Regis de Nueva York.\n" +
        "\n" +
        "\tSe cree que el Bloody Mary original contenía 7 ingredientes: vodka, jugo de tomate, salsa Worcestershire, pimienta negra, sal de apio, Tabasco y jugo de limón. Pero como muchas otras bebidas clásicas, ha inspirado muchas variantes. Versiones populares como Bloody Maria (a base de tequila), Red Snapper (a base de gin) o Caesar, creación canadience que utiliza jugo Clamato.\n" +
        "\n" +
        "\tRecientemente, el Bloody Mary ha inspirado una competición entre bares para ver quien utiliza los acompañamientos mas extravagantes para decorar el cóctel, como bacon, camarones, brochetas, langosta e incluso mini hamburguesas, casi convirtiendo al Bloody Mary en un tipo de almuerzo. Ante la duda, es mejor empezar probando la receta clásica e ir buscando las variantes que más nos atraigan, ya sea una versión más simplificada o con una pizza encima.\n"
val cosmopolitanDescriptionEsp = "The legendary Cosmopolitan is a simple cocktail with a big history. It reached its height of popularity in the 1990s, when the HBO show “Sex and the City” was at its peak. The pink-hued, Martini-style drink was a favorite of the characters on the show. It made its debut during the second season and became a series regular after that.\n" +
        "\n" +
        "For a good decade, the Cosmopolitan may have been the most popular cocktail in America, and bartenders couldn’t work a shift without making dozens of them for thirsty patrons. Naturally, its ubiquity spurred countless riffs, from the White Cosmo (St-Germain in place of Cointreau) to versions featuring gin. While the drink isn’t as popular today as it was in its heyday, the classic recipe is still very much alive.\n" +
        "\n" +
        "According to bartending legend and author Gary Regan, the original Cosmopolitan was created in 1985 by Miami bartender Cheryl Cook while working at a South Beach bar called the Strand. Eager to invent a new cocktail for the Martini glass, Cook riffed on the classic Kamikaze by using a newly introduced citrus-flavored vodka, plus a splash of cranberry juice."
val daiquiriDescriptionEsp = "The Daiquiri was supposedly invented in 1898 in the eponymous mining town of Daiquiri on the southeastern tip of Cuba by an American mining engineer named Jennings Cox. It was introduced in the United States a decade later, when a U.S. Navy medical officer brought the recipe from Cuba to Washington, D.C.\n" +
        "\n" +
        "This three-ingredient gift has pleased millions of palates over the ensuing years, including household names like Ernest Hemingway and President JFK. Yet no drink has suffered more abuse than the Daiquiri. In the century-plus since its inception, the granddaddy of rum cocktails has gone from the pride of Havana to an unloved extra on the back of a Señor Frog’s table tent. Even today, as the craft cocktail movement reaches full tilt, most people too often associate the Daiquiri with neon-colored adult slushies, the stuff of spring-break blackouts and mind-splitting hangovers.\n" +
        "\n" +
        "But in its purest form, the Daiquiri is simple and sublime, a delicate blend of rum’s sweetness with the raw freshness of sugar and lime juice. Whole lives have been dedicated to balancing those three elements. That each ingredient should be of the highest quality goes without saying, though even then the Daiquiri can throw you a curve. Choose an overly sweet rum or use too much sugar, and you’re left sipping liquid candy; overdo the citrus, and the cocktail drowns in a puckering pool of acidity."
val ginTonicDescriptionEsp = "A Gin & Tonic made with a potent base—45% ABV and above, if you mean business—and configured with two parts tonic to one part gin is a highball of balance and beauty. Too much gin, and the botanical spirit will overshadow the unique qualities of the tonic. Too much tonic, and it will drown the gin.\n" +
        "\n" +
        "There is endless room for experimentation within those two ingredients. With hundreds of gins on the market and dozens of tonics, a good G&T is a mix-and-match exercise to find the combination that best suits your tastes. London dry gins are characterized by their juniper-forward flavor profile; modern-style gins often dial down the juniper and ramp up the citrus and florals. Some tonics are dry and straightforward, with prominent notes of bitter quinine. Others are sweet and syrupy. And in between, you’ll find tonics featuring everything from citrus and aromatics to herbs and spice. Then, of course, there’s the garnish. Many people swear by a lime. Others choose a lemon, and still others prefer a grapefruit slice or rosemary sprig.\n" +
        "\n" +
        "All those permutations results in a bevy of Gin & Tonics, so naturally, the drink lends itself to creativity. Muddled cucumbers or fruit provide an extra dose of refreshment, and a measure of dry vermouth softens the cocktail. Liqueurs, fresh herbs and even barrel-aged gin are all fair game when you’re making G&Ts. It’s an impressive résumé for a drink that traces its roots to quinine powder, which was used in the 1840s as an antimalarial for British soldiers and citizens in India."
val manhattanDescriptionEsp = "The Manhattan was the most famous cocktail in the world shortly after it was invented in New York City’s Manhattan Club, some time around 1880 (as the story goes). Over the years, the whiskey classic has dipped in and out of fashion before finding its footing as one of the cornerstones of the craft cocktail renaissance.\n" +
        "\n" +
        "Amazingly, the drink that socialites tipped to their lips in the 19th century looks and tastes pretty much the same as the one served today at any decent cocktail bar. The Manhattan’s mix of American whiskey and Italian vermouth, enlivened with a few dashes of aromatic bitters, is timeless and tasty—the very definition of what a cocktail should be.\n" +
        "\n" +
        "Early versions call for rye, with its spicier, edgier profile. Purists claim that it’s not a Manhattan without it, but who has ever had fun drinking with a purist? We find that bourbon creates a beautiful, if mellower, drink. And while Angostura bitters are a must in any variation, a single dash of orange bitters helps brighten the cocktail’s edges, bringing the whiskey and vermouth together seamlessly, while the brandied cherry garnish lends a touch of sweetness."
val margaritaDescriptionEsp = "The Margarita is one of the most popular cocktails in North America—for good reason. Combining the tang of lime and the sweetness of orange liqueur with the distinctive strength of tequila, the classic Margarita strikes all of the right keys. What’s less certain, however, is the drink’s origin.\n" +
        "\n" +
        "Some say the cocktail was invented in 1948 in Acapulco, Mexico, when a Dallas socialite combined blanco tequila with Cointreau and lime juice for her guests. Others say that the Margarita, which translates to daisy flower in Spanish, was an inevitable twist on the Daisy, a cocktail template involving spirit, citrus, orange liqueur and soda. Make one with tequila, leave out the soda, and you get a Margarita. But regardless of how or when it was invented, the Margarita has earned its way into drinkers’ hearts.\n" +
        "\n" +
        "When choosing your tequila, quality is key. Opt for a blanco made from 100% blue agave. If it doesn’t say this on the label, it’s mixto—a tequila composed of up to 49% mystery sugars. And although many people reach for premade sour mix, using fresh lime juice will result in a vastly superior drink. Then there’s the orange liqueur. What is a mandatory ingredient for some is rendered optional by others, who replace the sweetener with agave syrup. Go that route, and you get the Tommy’s Margarita, which was created in the early ’90s at Tommy’s Mexican Restaurant in San Francisco."
val dryMartiniDescriptionEsp = "Who mixed the world’s first Martini? It’s a good question, but you could stumble down a very deep, dark rabbit hole trying to find out. Was it a California prospector during the 1849 Gold Rush or the barman at a flossy New York City hotel 50 years later? Most likely, the Martini is a cocktail that came onto the scene in multiple places at once, as bartenders began to experiment with gin and dry vermouth. Regardless, no origin story will leave you feeling as blissful and content as you will feel after drinking a classic, well-made Dry Martini.\n" +
        "\n" +
        "One fact we do know: The drink’s original form, according to early recipes, was sweet. Nineteenth-century cocktail books regularly called for Italian (sweet) vermouth. The Dry Martini took its current form around 1905, when the new order of the day was dry gin, dry vermouth and perhaps a dash of orange bitters for good measure.\n" +
        "\n" +
        "When making the drink for yourself, it’s imperative that you start with good ingredients—after all, there’s no place to hide in such a straightforward cocktail. Begin with a London-style gin. From there, add a little dry vermouth. The ratio is negotiable, but common formulas typically fall in the range of four-to-eight parts gin to one part vermouth. A dash of orange bitters ties the room together.\n" +
        "\n" +
        "Despite the exacting demands of a certain fictional British spy, the Martini is meant to be stirred, not shaken. The cocktail should be clear, sans ice shards. But do stir it for a good 20 to 30 seconds to yield the proper dilution necessary to bring the ingredients into balance. Then, strain it into the glass named after the cocktail itself. Twist a lemon peel over the top, and there you have it: a Dry Martini. It’s a drink worth getting to the bottom of. Maybe more than once."
val mojitoDescriptionEsp = "The Mojito is one of the most popular rum cocktails served today, with a recipe known around the world. The origins of this classic drink can be traced to Cuba and the 16th-century cocktail El Draque. Named for Sir Francis Drake, the English sea captain and explorer who visited Havana in 1586, El Draque was composed of aguardiente (a cane-spirit precursor to rum), lime, mint and sugar. It was supposedly consumed for medicinal purposes, but it’s easy to believe that drinkers enjoyed its flavor and effects.\n" +
        "\n" +
        "Eventually, rum replaced aguardiente and the name was changed to the Mojito. It’s unclear exactly when this transpired, but the Mojito first appeared in cocktail literature in the 1932 edition of “Sloppy Joe’s Bar Cocktail Manual, a book from the famed Havana institution.\n" +
        "\n" +
        "Appropriately, almost all of the ingredients in the Mojito are indigenous to Cuba. Rum, lime, mint and sugar (the island nation grows sugar cane) are joined together and then lengthened with thirst-quenching club soda to create a delicious, lighthearted cocktail. The drink is traditionally made with unaged white rum, which yields a light, crisp flavor. Using Cuban rum will score you points for authenticity, although many modern Cuban rums are lighter in style than their predecessors, so you might try experimenting with white rums until you find one that you like best.\n" +
        "\n" +
        "The Mojito is slightly more labor-intensive than other cocktails because it involves muddling the mint, but the end result is worth the effort. The mint combines with the other ingredients for an extra dose of refreshment that, while often associated with summer, can be enjoyed any time of the year."
val monkeyGlandDescriptionEsp = ""
val negroniDescriptionEsp = "Easy to make and refreshingly bitter, the Negroni is said to have been invented in Florence by the dauntless Italian Count Camillo Negroni in the early 20th century. While at Bar Casoni in Florence, he demanded that the bartender strengthen his favorite cocktail, the Americano, by replacing the usual soda water with gin. To further differentiate the drink, the bartender also employed an orange peel rather than the typical lemon peel.\n" +
        "\n" +
        "It’s a widely accepted tale, and one that is documented in “Sulle Tracce del Conte: La Vera Storia del Cocktail Negroni,” which was written by Lucca Picchi, the head bartender at Caffe Rivoire in Florence, Italy, and translates to “In the Footsteps of the Count: The True Story of the Negroni Cocktail.” The count’s fateful substitution resulted in one of the most popular stirred drinks in history, as the Negroni sits next to the Martini and Manhattan in the pantheon of classics. It also launched a thousand riffs, and today the Negroni can be found in myriad iterations at restaurants and cocktail bars around the world.\n" +
        "\n" +
        "Few cocktails have encouraged more frenzied experimentation than the beloved Negroni during the course of its 100-year history. Its one-to-one-to-one recipe of gin, Campari and sweet vermouth has become the platform on which generations of drink mixers have left their thumbprint. Sub bourbon for gin, and you’ve got the Boulevardier, a great cocktail in its own right. Try rum or mezcal in the same equal parts configuration with Campari and sweet vermouth, and you get far different yet equally balanced and impressive drinks."
val brandyOldFashionedDescriptionEsp = "A cocktail, by definition, includes a spirit, sugar, water and bitters—and those four ingredients are exactly what you’ll find in an Old Fashioned. It’s as classic as drinks get. Most Old Fashioneds are made with whiskey, but considering the Old Fashioned is more of a template than an exact recipe, today you will find the drink made with numerous spirits, from tequila to rum. But one variation is equally notable for its prescribed spirit and its geographical roots.\n" +
        "\n" +
        "The Brandy Old Fashioned, aka the Wisconsin Old Fashioned, is practically the state’s official drink. In addition to brandy, it calls for muddled fruit and a topper of lemon-lime soda. So, it’s not your great-great-grandfather’s Old Fashioned. Well, unless he’s from Wisconsin.\n" +
        "\n" +
        "Doctoring drinks with muddled fruit was a popular ploy during Prohibition that was used to mask the taste of subpar spirits. Add enough fruit and sugar to a cocktail, and anything is bound to become palatable. In the case of the Old Fashioned, the trick stuck around and remained popular in Wisconsin, even in the 21st century as modern bartenders reclaimed the classic no-fruit recipe. As for the brandy, it’s a product of the many Wisconsinites who emigrated from Europe over the centuries, bringing a taste for brandy with them."
val paradiseDescriptionEsp = ""
val pornStarMartiniDescriptionEsp = "Let’s forget about the second half of this drink’s name for a moment: It doesn’t remotely resemble a classic Martini. As for the first part, it's said by some that its creator, bartender Douglas Ankrah, thought it was what a porn star would order; other stories hold that he was inspired by the smell of a stripper's perfume. In any case, this crowd-pleasing combination of vanilla and passion fruit accompanied by a shot of sparkling wine, which has spread far from its origins at London’s Townhouse bar in the early 2000s to be adopted by bars the world over, certainly is a star."
val spritzVenezianoDescriptionEsp = ""
val strawberryMojitoDescriptionEsp = "Fizzy, minty, slightly sweet and packed with strawberries and lime, a Strawberry Mojito Cocktail is refreshing and easy to make. Whip up this light rum adult beverage as a cocktail or make it mocktail! Make a single or scale it up for a pitcher."

// Ingredients
val bloodyMaryIngredientsEsp = "Sal.\n" +
        "1 Rodaja de limón.\n" +
        "1 Rodaja de lima.\n" +
        "2 onzas de vodka.\n" +
        "4 onzas de jugo de tomate.\n" +
        "2 gotas de Tabasco.\n" +
        "1 pizca de pimienta negra.\n" +
        "1 pizca de paprika ahumada.\n" +
        "Decoración: hojas de perejil.\n" +
        "Decoración: aceitunas verdes.\n" +
        "Decoración: una rodaja de limón.\n" +
        "Decoración: un tallo de apio.\n"
val cosmopolitanIngredientsEsp = "1 1/2 ounces citrus vodka\n" +
        "1 ounce Cointreau\n" +
        "1/2 ounce lime juice, freshly squeezed\n" +
        "1/4 ounce cranberry juice\n" +
        "Garnish: lime wedge"
val daiquiriIngredientsEsp = "2 ounces light rum\n" +
        "1 ounce lime juice, freshly squeezed\n" +
        "3/4 ounce demerara sugar syrup\n" +
        "Garnish: lime twist"
val ginTonicIngredientsEsp = "2 ounces gin\n" +
        "4 ounces tonic water\n" +
        "Garnish: 2 lime wheels"
val manhattanIngredientsEsp = "2 ounces bourbon or rye\n" +
        "1 ounce sweet vermouth\n" +
        "2 dashes Angostura bitters\n" +
        "1 dash orange bitters\n" +
        "Garnish: brandied cherry"
val margaritaIngredientsEsp = "2 ounces blanco tequila\n" +
        "1/2 ounce orange liqueur\n" +
        "1 ounce lime juice, freshly squeezed\n" +
        "1/2 ounce agave syrup\n" +
        "Garnish: lime wheel\n" +
        "Garnish: kosher salt (optional)"
val dryMartiniIngredientsEsp = "2 1/2 ounces gin\n" +
        "1/2 ounce dry vermouth\n" +
        "1 dash orange bitters\n" +
        "Garnish: lemon twist"
val mojitoIngredientsEsp = "3 mint leaves\n" +
        "1/2 ounce simple syrup\n" +
        "2 ounces white rum\n" +
        "3/4 ounce lime juice, freshly squeezed\n" +
        "Club soda, to top\n" +
        "Garnish: mint sprig\n" +
        "Garnish: lime whee"
val monkeyGlandIngredientsEsp = ""
val negroniIngredientsEsp = "1 ounce gin\n" +
        "1 ounce Campari\n" +
        "1 ounce sweet vermouth\n" +
        "Garnish: orange peel"
val brandyOldFashionedIngredientsEsp = "3 dashes Angostura bitters\n" +
        "2 orange slices\n" +
        "2 brandied or maraschino cherries\n" +
        "1 sugar cube\n" +
        "2 ounces brandy\n" +
        "7UP, Sprite or club soda, chilled, to top\n" +
        "Garnish: brandied or maraschino cherry\n" +
        "Garnish: orange slice"
val paradiseIngredientsEsp = ""
val pornStarMartiniIngredientsEsp = "1 1/2 ounces vanilla-flavored vodka \n" +
        "1/2 ounce passion fruit liqueur (such as Passoã or De Kuyper)\n" +
        "1 ounce passion fruit puree \n" +
        "1/2 ounce lime juice, freshly squeezed\n" +
        "1/2 ounce vanilla simple syrup\n" +
        "2 ounces sparkling wine, chilled\n" +
        "Garnish: 1/2 passion fruit"
val spritzVenezianoIngredientsEsp = ""
val strawberryMojitoIngredientsEsp =
        "9-10 strawberries\n" +
        "2 limes , chopped\n" +
        "2 tbsp granulated sugar\n" +
        "2 mint sprigs , leaves picked\n" +
        "ice\n" +
        "350ml white rum\n" +
        "600ml sparkling water"


// Instructions
val bloodyMaryIntructionsEsp = "Poner sal en un plato.\n" +
        "Frotar la rodaja de limón por el borde de una pinta.\n" +
        "Pasar el borde del vaso por la sal hasta que esté totalmente cubierto, luego llenarlo de hielo y dejar a un lado.\n" +
        "Exprimir el limón y la lima en una coctelera.\n" +
        "Añadir el vodka,  jugo de tomate, tabasco, la pimienta, paprika y un poco de sal, luego batir cuidadosamente.\n" +
        "Servir en el vaso preparado.\n" +
        "Decorar con las hojas de perejil, 2 aceitunas verdes, una rodaja de limón y un tallo de apio (opcional).\n"
val cosmopolitanInstructionsEsp = "Add the vodka, Cointreau, lime juice and cranberry juice to a shaker with ice and shake until well-chilled.\n" +
        "\n" +
        "Strain into a chilled cocktail glass.\n" +
        "\n" +
        "Garnish with a lime wedge."
val daiquiriInstructionsEsp = "Add the rum, lime juice and demerara sugar syrup to a shaker with ice, and shake until well-chilled.\n" +
        "\n" +
        "Strain into a chilled coupe.\n" +
        "\n" +
        "Garnish with a lime twist."
val ginTonicInstructionsEsp = "Fill a highball glass with ice, then add the gin.\n" +
        "\n" +
        "Top with the tonic water and gently stir.\n" +
        "\n" +
        "Garnish with lime wheels."
val manhattanInstructionsEsp = "Add the bourbon (or rye), sweet vermouth and both bitters to a mixing glass with ice, and stir until well-chilled.\n" +
        "\n" +
        "Strain into a chilled coupe.\n" +
        "\n" +
        "Garnish with a brandied cherry"
val MargaritaInstructionsEsp = "Add tequila, orange liqueur, lime juice and agave syrup to a cocktail shaker filled with ice, and shake until well-chilled.\n" +
        "\n" +
        "Strain into a rocks glass over fresh ice.\n" +
        "\n" +
        "Garnish with a lime wheel and kosher salt rim (optional)"
val dryMartiniInstructionsEsp = "Add the gin, dry vermouth and orange bitters into a mixing glass with ice and stir until very cold.\n" +
        "\n" +
        "Strain into a chilled cocktail glass.\n" +
        "\n" +
        "Garnish with a lemon twist."
val mojitoInstructionsEsp = "Lightly muddle the mint with the simple syrup in a shaker.\n" +
        "\n" +
        "Add the rum, lime juice and ice, and give it a brief shake.\n" +
        "\n" +
        "Strain into a highball glass over fresh ice.\n" +
        "\n" +
        "Top with the club soda.\n" +
        "\n" +
        "Garnish with a mint sprig and lime wheel"
val monkeyGlandInstructionsEsp = ""
val negroniInstructionsEsp = "Add the gin, Campari and sweet vermouth to a mixing glass filled with ice, and stir until well-chilled.\n" +
        "\n" +
        "Strain into a rocks glass filled with large ice cubes.\n" +
        "\n" +
        "Garnish with an orange peel."
val brandyOldFashionesInstructionsEsp = "Add the bitters, orange slices, cherries and sugar cube to an Old Fashioned glass and muddle to combine.\n" +
        "\n" +
        "Add ice to fill the glass, then add the brandy.\n" +
        "\n" +
        "Top with the 7UP, Sprite or club soda, and stir to chill.\n" +
        "\n" +
        "Garnish with a skewered cherry and an orange slice"
val paradiseInstructionsEsp = ""
val pornStarMartiniInstructionsEsp = "Add all ingredients except sparkling wine into a shaker with ice and shake vigorously until well-chilled.\n" +
        "\n" +
        "Strain into a chilled coupe glass.\n" +
        "\n" +
        "Garnish with a passion fruit half.\n" +
        "\n" +
        "Serve with a sparkling wine sidecar (on the side)."
val spritzVenezianoInstructionsEsp = ""
val strawberryMojitoInstructionsEsp = "Muddle the strawberries, limes and sugar in a large jug.\n" +
        "\n" +
        "Bruise the mint leaves and add to the jug with a pinch of black pepper.\n" +
        "\n" +
        "Add lots of ice and stir in the rum and sparkling water."


// Category

// Languages

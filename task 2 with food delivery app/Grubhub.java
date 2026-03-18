class Grubhub {
    static double price;

    public static double search(String foodName) {

        if(foodName == "VegSandwich"){ 
		price=80; 
		return price; 
		}
		
        if(foodName == "ChickenSandwich"){ 
		price=120; 
		return price; 
		}
		
        if(foodName == "FishBurger"){ 
		price=150; 
		return price;
		}
		
        if(foodName == "CheesePasta"){ 
		price=140; 
		return price; 
		}
		
        if(foodName == "WhiteSaucePasta"){ 
		price=160; 
		return price; 
		}
		
        if (foodName == "RedSaucePasta") { 
        price = 150; 
        return price; 
		}

		if (foodName == "VegManchowSoup") { 
			price = 90; 
			return price; 
		}

		if (foodName == "ChickenManchowSoup") { 
			price = 110; 
			return price; 
		}

		if (foodName == "VegSpringRoll") { 
			price = 100; 
			return price; 
		}

		if (foodName == "ChickenSpringRoll") { 
			price = 130; 
			return price; 
		}

		if (foodName == "PaneerRoll") { 
			price = 110; 
			return price; 
		}

		if (foodName == "EggRoll") { 
			price = 90; 
			return price; 
		}

		if (foodName == "ChickenShawarma") { 
			price = 150; 
			return price; 
		}

		if (foodName == "VegShawarma") { 
			price = 120; 
			return price; 
		}

		if (foodName == "FaloodaSpecial") { 
			price = 100; 
			return price; 
		}

		if (foodName == "ChocolateMilkshake") { 
			price = 120; 
			return price; 
		}

		if (foodName == "StrawberryMilkshake") { 
			price = 110; 
			return price; 
		}

		if (foodName == "BananaShake") { 
			price = 90; 
			return price; 
		}

		if (foodName == "ColdCoffeeSpecial") { 
			price = 100; 
			return price; 
		}

		if (foodName == "CaramelCoffee") { 
			price = 110; 
			return price; 
		}

		if (foodName == "VegPlatter") { 
			price = 180; 
			return price; 
		}

		if (foodName == "NonVegPlatter") { 
			price = 250; 
			return price; 
		}

		if (foodName == "FrenchToastSpecial") { 
			price = 130; 
			return price; 
		}

		if (foodName == "ChocoLavaCake") { 
			price = 90; 
			return price; 
		}

		if (foodName == "BlueberryCake") { 
			price = 140; 
			return price; 
		}

		if (foodName == "FruitCustard") { 
			price = 80; 
			return price; 
		}

		if (foodName == "VegNuggets") { 
			price = 90; 
			return price; 
		}

		if (foodName == "ChickenNuggets") { 
			price = 120; 
			return price; 
		}

		if (foodName == "CheeseBalls") { 
			price = 100; 
			return price; 
		}

		if (foodName == "GarlicBread") { 
			price = 110; 
			return price; 
		}

        return price;
    }

    public static double search(String foodName, int quantity) {
		
		if (foodName == "VegSandwich") {
			price = 80 * quantity;
			return price;
		}

		if (foodName == "ChickenSandwich") {
			price = 120 * quantity;
			return price;
		}

		if (foodName == "FishBurger") {
			price = 150 * quantity;
			return price;
		}

		if (foodName == "CheesePasta") {
			price = 140 * quantity;
			return price;
		}

		if (foodName == "WhiteSaucePasta") {
			price = 160 * quantity;
			return price;
		}

		if (foodName == "RedSaucePasta") {
			price = 150 * quantity;
			return price;
		}

		if (foodName == "VegManchowSoup") {
			price = 90 * quantity;
			return price;
		}

		if (foodName == "ChickenManchowSoup") {
			price = 110 * quantity;
			return price;
		}

		if (foodName == "VegSpringRoll") {
			price = 100 * quantity;
			return price;
		}

		if (foodName == "ChickenSpringRoll") {
			price = 130 * quantity;
			return price;
		}

		if (foodName == "PaneerRoll") {
			price = 110 * quantity;
			return price;
		}

		if (foodName == "EggRoll") {
			price = 90 * quantity;
			return price;
		}

		if (foodName == "ChickenShawarma") {
			price = 150 * quantity;
			return price;
		}

		if (foodName == "VegShawarma") {
			price = 120 * quantity;
			return price;
		}

		if (foodName == "FaloodaSpecial") {
			price = 100 * quantity;
			return price;
		}

		if (foodName == "ChocolateMilkshake") {
			price = 120 * quantity;
			return price;
		}

		if (foodName == "StrawberryMilkshake") {
			price = 110 * quantity;
			return price;
		}

		if (foodName == "BananaShake") {
			price = 90 * quantity;
			return price;
		}

		if (foodName == "ColdCoffeeSpecial") {
			price = 100 * quantity;
			return price;
		}

		if (foodName == "CaramelCoffee") {
			price = 110 * quantity;
			return price;
		}

        return price;
    }
}
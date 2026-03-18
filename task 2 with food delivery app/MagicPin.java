class MagicPin {
    static double price;

    public static double search(String foodName) {

        if (foodName == "CheeseMaggi") {
    price = 70;
    return price;
		}

		if (foodName == "VegMaggi") {
			price = 50;
			return price;
		}

		if (foodName == "EggMaggi") {
			price = 60;
			return price;
		}

		if (foodName == "ChickenMaggi") {
			price = 90;
			return price;
		}

		if (foodName == "VegSandwichGrill") {
			price = 100;
			return price;
		}

		if (foodName == "ChickenSandwichGrill") {
			price = 130;
			return price;
		}

		if (foodName == "PaneerBurger") {
			price = 110;
			return price;
		}

		if (foodName == "ChickenCheeseBurger") {
			price = 160;
			return price;
		}

		if (foodName == "LoadedFries") {
			price = 120;
			return price;
		}

		if (foodName == "PeriPeriChickenWings") {
			price = 200;
			return price;
		}

		if (foodName == "VegManchurianDry") {
			price = 130;
			return price;
		}

		if (foodName == "ChickenManchurianDry") {
			price = 160;
			return price;
		}

		if (foodName == "VegHakkaNoodlesSpecial") {
			price = 140;
			return price;
		}

		if (foodName == "ChickenHakkaNoodlesSpecial") {
			price = 170;
			return price;
		}

		if (foodName == "PaneerChilli") {
			price = 150;
			return price;
		}

		if (foodName == "ChickenChilli") {
			price = 180;
			return price;
		}

		if (foodName == "VegComboMeal") {
			price = 180;
			return price;
		}

		if (foodName == "NonVegComboMeal") {
			price = 260;
			return price;
		}

		if (foodName == "ChocolateShakeLarge") {
			price = 140;
			return price;
		}

		if (foodName == "OreoShakeLarge") {
			price = 150;
			return price;
		}

		if (foodName == "StrawberryShakeLarge") {
			price = 140;
			return price;
		}

		if (foodName == "ColdCoffeeLarge") {
			price = 130;
			return price;
		}

		if (foodName == "KitkatDessertCup") {
			price = 120;
			return price;
		}

		if (foodName == "BrownieChocolate") {
			price = 110;
			return price;
		}

		if (foodName == "IceCreamFamilyPackSpecial") {
			price = 280;
			return price;
		}

		if (foodName == "KulfiMalai") {
			price = 60;
			return price;
		}

		if (foodName == "ChocoConeSpecial") {
			price = 80;
			return price;
		}

		if (foodName == "ButterscotchConeSpecial") {
			price = 85;
			return price;
		}

		if (foodName == "FruitSaladCream") {
			price = 100;
			return price;
		}

		if (foodName == "SweetLassi") {
			price = 70;
			return price;
		}

        return price;
    }

    public static double search(String foodName, int quantity) {

        if (foodName == "CheeseMaggi") {
    price = 70 * quantity;
    return price;
		}

		if (foodName == "VegMaggi") {
			price = 50 * quantity;
			return price;
		}

		if (foodName == "EggMaggi") {
			price = 60 * quantity;
			return price;
		}

		if (foodName == "ChickenMaggi") {
			price = 90 * quantity;
			return price;
		}

		if (foodName == "VegSandwichGrill") {
			price = 100 * quantity;
			return price;
		}

		if (foodName == "ChickenSandwichGrill") {
			price = 130 * quantity;
			return price;
		}

		if (foodName == "PaneerBurger") {
			price = 110 * quantity;
			return price;
		}

		if (foodName == "ChickenCheeseBurger") {
			price = 160 * quantity;
			return price;
		}

		if (foodName == "LoadedFries") {
			price = 120 * quantity;
			return price;
		}

		if (foodName == "PeriPeriChickenWings") {
			price = 200 * quantity;
			return price;
		}

		if (foodName == "VegManchurianDry") {
			price = 130 * quantity;
			return price;
		}

		if (foodName == "ChickenManchurianDry") {
			price = 160 * quantity;
			return price;
		}

		if (foodName == "VegHakkaNoodlesSpecial") {
			price = 140 * quantity;
			return price;
		}

		if (foodName == "ChickenHakkaNoodlesSpecial") {
			price = 170 * quantity;
			return price;
		}

		if (foodName == "PaneerChilli") {
			price = 150 * quantity;
			return price;
		}

		if (foodName == "ChickenChilli") {
			price = 180 * quantity;
			return price;
		}

		if (foodName == "VegComboMeal") {
			price = 180 * quantity;
			return price;
		}

		if (foodName == "NonVegComboMeal") {
			price = 260 * quantity;
			return price;
		}

		if (foodName == "ChocolateShakeLarge") {
			price = 140 * quantity;
			return price;
		}

		if (foodName == "OreoShakeLarge") {
			price = 150 * quantity;
			return price;
		}

        return price;
    }
}
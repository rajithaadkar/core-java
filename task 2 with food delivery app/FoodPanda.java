class FoodPanda {
    static double price;

    public static double search(String foodName) {

        if (foodName == "ChickenBurger") {
    price = 130;
    return price;
		}

		if (foodName == "VegBurger") {
			price = 90;
			return price;
		}

		if (foodName == "DoubleCheeseBurger") {
			price = 180;
			return price;
		}

		if (foodName == "ChickenPizzaSmall") {
			price = 220;
			return price;
		}

		if (foodName == "VegPizzaMedium") {
			price = 260;
			return price;
		}

		if (foodName == "CheesePizzaLarge") {
			price = 320;
			return price;
		}

		if (foodName == "ChickenBucket") {
			price = 350;
			return price;
		}

		if (foodName == "PopcornChicken") {
			price = 160;
			return price;
		}

		if (foodName == "ZingerBurger") {
			price = 190;
			return price;
		}

		if (foodName == "ChickenRollSpecial") {
			price = 140;
			return price;
		}

		if (foodName == "PaneerRollSpecial") {
			price = 120;
			return price;
		}

		if (foodName == "VegNoodles") {
			price = 110;
			return price;
		}

		if (foodName == "ChickenNoodles") {
			price = 140;
			return price;
		}

		if (foodName == "EggNoodles") {
			price = 120;
			return price;
		}

		if (foodName == "VegFriedRiceSpecial") {
			price = 130;
			return price;
		}

		if (foodName == "ChickenFriedRiceSpecial") {
			price = 160;
			return price;
		}

		if (foodName == "EggFriedRiceSpecial") {
			price = 140;
			return price;
		}

		if (foodName == "PaneerButterMasalaCombo") {
			price = 220;
			return price;
		}

		if (foodName == "ChickenButterMasalaCombo") {
			price = 260;
			return price;
		}

		if (foodName == "VegThaliSpecial") {
			price = 150;
			return price;
		}

		if (foodName == "NonVegThaliSpecial") {
			price = 240;
			return price;
		}

		if (foodName == "ColdDrinkLarge") {
			price = 60;
			return price;
		}

		if (foodName == "ChocolateShakeSpecial") {
			price = 130;
			return price;
		}

		if (foodName == "OreoMilkshakeSpecial") {
			price = 140;
			return price;
		}

		if (foodName == "StrawberryMilkshakeSpecial") {
			price = 135;
			return price;
		}

		if (foodName == "ChocoLavaCakeSpecial") {
			price = 100;
			return price;
		}

		if (foodName == "IceCreamTub") {
			price = 200;
			return price;
		}

		if (foodName == "BrownieWithIceCream") {
			price = 150;
			return price;
		}

		if (foodName == "GarlicBreadCheese") {
			price = 120;
			return price;
		}

		if (foodName == "CheesyNachos") {
			price = 110;
			return price;
		}



        return price;
    }

    public static double search(String foodName, int quantity) {

       if (foodName == "ChickenBurger") {
    price = 130 * quantity;
    return price;
		}

		if (foodName == "VegBurger") {
			price = 90 * quantity;
			return price;
		}

		if (foodName == "DoubleCheeseBurger") {
			price = 180 * quantity;
			return price;
		}

		if (foodName == "ChickenPizzaSmall") {
			price = 220 * quantity;
			return price;
		}

		if (foodName == "VegPizzaMedium") {
			price = 260 * quantity;
			return price;
		}

		if (foodName == "CheesePizzaLarge") {
			price = 320 * quantity;
			return price;
		}

		if (foodName == "ChickenBucket") {
			price = 350 * quantity;
			return price;
		}

		if (foodName == "PopcornChicken") {
			price = 160 * quantity;
			return price;
		}

		if (foodName == "ZingerBurger") {
			price = 190 * quantity;
			return price;
		}

		if (foodName == "ChickenRollSpecial") {
			price = 140 * quantity;
			return price;
		}

		if (foodName == "PaneerRollSpecial") {
			price = 120 * quantity;
			return price;
		}

		if (foodName == "VegNoodles") {
			price = 110 * quantity;
			return price;
		}

		if (foodName == "ChickenNoodles") {
			price = 140 * quantity;
			return price;
		}

		if (foodName == "EggNoodles") {
			price = 120 * quantity;
			return price;
		}

		if (foodName == "VegFriedRiceSpecial") {
			price = 130 * quantity;
			return price;
		}

		if (foodName == "ChickenFriedRiceSpecial") {
			price = 160 * quantity;
			return price;
		}

		if (foodName == "EggFriedRiceSpecial") {
			price = 140 * quantity;
			return price;
		}

		if (foodName == "PaneerButterMasalaCombo") {
			price = 220 * quantity;
			return price;
		}

		if (foodName == "ChickenButterMasalaCombo") {
			price = 260 * quantity;
			return price;
		}

		if (foodName == "VegThaliSpecial") {
			price = 150 * quantity;
			return price;
		}

        return price;
    }
}
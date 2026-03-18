class EatSure {
    static double price;

    public static double search(String foodName) {

        if (foodName == "PaneerPizza") {
            price = 210;
            return price;

        } else if (foodName == "CornPizza") {
            price = 190;
            return price;

        } else if (foodName == "ChickenTikkaPizza") {
            price = 260;
            return price;

        } else if (foodName == "VegClubSandwich") {
            price = 120;
            return price;

        } else if (foodName == "ChickenClubSandwich") {
            price = 150;
            return price;

        } else if (foodName == "CheeseLoadedFries") {
            price = 130;
            return price;

        } else if (foodName == "PeriPeriFries") {
            price = 110;
            return price;

        } else if (foodName == "VegHotDog") {
            price = 100;
            return price;

        } else if (foodName == "ChickenHotDog") {
            price = 140;
            return price;

        } else if (foodName == "PaneerWrap") {
            price = 130;
            return price;

        } else if (foodName == "ChickenWrapSpecial") {
            price = 170;
            return price;

        } else if (foodName == "VegHakkaNoodles") {
            price = 120;
            return price;

        } else if (foodName == "ChickenHakkaNoodles") {
            price = 150;
            return price;

        } else if (foodName == "SchezwanFriedRice") {
            price = 140;
            return price;

        } else if (foodName == "EggSchezwanFriedRice") {
            price = 150;
            return price;

        } else if (foodName == "ChickenSchezwanFriedRice") {
            price = 170;
            return price;

        } else if (foodName == "PaneerButterNaanCombo") {
            price = 220;
            return price;

        } else if (foodName == "ChickenCurryCombo") {
            price = 260;
            return price;

        } else if (foodName == "VegMealBox") {
            price = 150;
            return price;

        } else if (foodName == "NonVegMealBox") {
            price = 230;
            return price;

        } else if (foodName == "ColdCoffeeDelight") {
            price = 110;
            return price;

        } else if (foodName == "HazelnutShake") {
            price = 140;
            return price;

        } else if (foodName == "KitkatBrownie") {
            price = 120;
            return price;

        } else if (foodName == "ChocoChipPastry") {
            price = 90;
            return price;

        } else if (foodName == "RedVelvetPastry") {
            price = 110;
            return price;

        } else if (foodName == "IceCreamFamilyPack") {
            price = 250;
            return price;

        } else if (foodName == "KulfiStick") {
            price = 60;
            return price;

        } else if (foodName == "ChocolateCone") {
            price = 70;
            return price;

        } else if (foodName == "StrawberryCone") {
            price = 65;
            return price;

        } else if (foodName == "ButterscotchCone") {
            price = 75;
            return price;

        } else {
            return 0;
        }
    }
	
	public static double search(String foodName, int quantity) {

        if (foodName == "PaneerPizza") {
            price = 210 * quantity;
            return price;

        } else if (foodName == "CornPizza") {
            price = 190 * quantity;
            return price;

        } else if (foodName == "ChickenTikkaPizza") {
            price = 260 * quantity;
            return price;

        } else if (foodName == "VegClubSandwich") {
            price = 120 * quantity;
            return price;

        } else if (foodName == "ChickenClubSandwich") {
            price = 150 * quantity;
            return price;

        } else if (foodName == "CheeseLoadedFries") {
            price = 130 * quantity;
            return price;

        } else if (foodName == "PeriPeriFries") {
            price = 110 * quantity;
            return price;

        } else if (foodName == "VegHotDog") {
            price = 100 * quantity;
            return price;

        } else if (foodName == "ChickenHotDog") {
            price = 140 * quantity;
            return price;

        } else if (foodName == "PaneerWrap") {
            price = 130 * quantity;
            return price;

        } else if (foodName == "ChickenWrapSpecial") {
            price = 170 * quantity;
            return price;

        } else if (foodName == "VegHakkaNoodles") {
            price = 120 * quantity;
            return price;

        } else if (foodName == "ChickenHakkaNoodles") {
            price = 150 * quantity;
            return price;

        } else {
            return 0;
        }
    }
}

class Zomato {
    static double price;

    public static double search(String foodName) {

        if(foodName == "PaniPuri"){
			price=30;
			return price;
			}
        if(foodName == "MasalaDosa"){
			price=70;
			return price;
			}
        if(foodName == "RavaDosa"){
			price=80;
			return price;
			}
        if(foodName == "OnionUttapam"){
			price=90;
			return price;
			}
        if(foodName == "VegBiryani"){
			price=150;
			return price;
			}
        if(foodName == "Chicken65"){
			price=180;
			return price;
			}
        if(foodName == "GobiManchurian"){
			price=120;
			return price;
			}
        if(foodName == "ChilliChicken"){
			price=190;
			return price;
			}
        if(foodName == "VegFriedRice"){
			price=130;
			return price;
			}
        if(foodName == "EggFriedRice"){
			price=140;
			return price; 
			}
        if(foodName == "ChickenFriedRice"){
			price=160;
			return price;
			}
        if(foodName == "HakkaNoodles"){
			price=110;
			return price;
			}
        if(foodName == "SchezwanNoodles"){
			price=130;
			return price;
			}
        if(foodName == "PaneerTikka"){
			price=200;
			return price;
			}
        if(foodName == "ButterNaan"){
			price=40;
			return price;
			}
        if(foodName == "GarlicNaan"){
			price=50;
			return price;
			}
        if(foodName == "PalakPaneer"){
			price=180;
			return price;
			}
        if(foodName == "DalTadka"){
			price=120;
			return price;
			}
        if(foodName == "JeeraRice"){
			price=100;
			return price;
			}
        if(foodName == "CurdRice"){
			price=80;
			return price; 
			}
        if(foodName == "Lassi"){
			price=60;
			return price; 
			}
        if(foodName == "MangoShake"){
			price=90;
			return price;
			}
        if(foodName == "StrawberryShake"){
			price=100;
			return price;
			}
        if(foodName == "VanillaIcecream"){
			price=50;
			return price; 
			}
        if(foodName == "ButterscotchIcecream"){
			price=60;
			return price; 
			}
        if(foodName == "BlackForestCake"){
			price=120;
			return price; 
			}
        if(foodName == "WhiteForestCake"){
			price=130; 
			return price;
			}
        if(foodName == "VegBurger"){
			price=90;
			return price;
			}
        if(foodName == "ChickenBurger"){ 
		   price=120; 
		   return price; }
        if(foodName == "CheesePizza"){
			price=220;
			return price; }
        if(foodName == "VegPizza"){
			price=200;
			return price; 
			}
        if(foodName == "ChickenPizza"){
			price=250;
			return price;
			}
        if(foodName == "TandooriChicken"){
			price=300; 
			return price;
			}
        if(foodName == "GrilledChicken"){
			price=280;
			return price;
			}
        if(foodName == "FishCurry"){
			price=220;
			return price;
			}
        if(foodName == "CrabMasala"){
			price=260;
			return price;
			}
        if(foodName == "PrawnsFry"){
			price=270;
			return price; 
			}
        if(foodName == "VegThali"){
			price=140;
			return price;
			}
        if(foodName == "NonVegThali"){
			price=220;
			return price;
			}
        if(foodName == "SamosaChaat"){
			price=50;
			return price;
			}
        if(foodName == "DahiPuri"){
			price=60;
			return price; 
			}
        if(foodName == "SevPuri"){
			price=55;
			return price;
			}
        if(foodName == "BhelPuri"){
			price=50;
			return price;
			}
        if(foodName == "Kachori"){
			price=40;
			return price;
			}
        if(foodName == "Poha"){
			price=35;
			return price;
			}
        if(foodName == "Upma"){
			price=40;
			return price;
			}
        if(foodName == "BreadOmelette"){
			price=60;
			return price; 
			}
        if(foodName == "BoiledCorn"){
			price=30;
			return price;
			}
        if(foodName == "SweetCornSoup"){
			price=90;
			return price;
			}
        if(foodName == "TomatoSoup"){
			price=80;
			return price;
			}

        return price;
    }

    public static double search(String foodName, int quantity) {

       if (foodName == "PaniPuri") {
    price = 30 * quantity;
    return price;
		}

		if (foodName == "MasalaDosa") {
			price = 70 * quantity;
			return price;
		}

		if (foodName == "RavaDosa") {
			price = 80 * quantity;
			return price;
		}

		if (foodName == "OnionUttapam") {
			price = 90 * quantity;
			return price;
		}

		if (foodName == "VegBiryani") {
			price = 150 * quantity;
			return price;
		}

		if (foodName == "Chicken65") {
			price = 180 * quantity;
			return price;
		}

		if (foodName == "GobiManchurian") {
			price = 120 * quantity;
			return price;
		}

		if (foodName == "ChilliChicken") {
			price = 190 * quantity;
			return price;
		}

		if (foodName == "VegFriedRice") {
			price = 130 * quantity;
			return price;
		}

		if (foodName == "EggFriedRice") {
			price = 140 * quantity;
			return price;
		}

		if (foodName == "ChickenFriedRice") {
			price = 160 * quantity;
			return price;
		}

		if (foodName == "HakkaNoodles") {
			price = 110 * quantity;
			return price;
		}

		if (foodName == "SchezwanNoodles") {
			price = 130 * quantity;
			return price;
		}

		if (foodName == "PaneerTikka") {
			price = 200 * quantity;
			return price;
		}

		if (foodName == "ButterNaan") {
			price = 40 * quantity;
			return price;
		}

		if (foodName == "GarlicNaan") {
			price = 50 * quantity;
			return price;
		}

		if (foodName == "PalakPaneer") {
			price = 180 * quantity;
			return price;
		}

		if (foodName == "DalTadka") {
			price = 120 * quantity;
			return price;
		}

		if (foodName == "JeeraRice") {
			price = 100 * quantity;
			return price;
		}

		if (foodName == "CurdRice") {
			price = 80 * quantity;
			return price;
		}

        return price;
    }
}
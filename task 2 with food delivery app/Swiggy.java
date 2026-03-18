class Swiggy {
    static double price;

    public static double search(String foodName) {

        if(foodName == "MasalaPasta"){ 
		price=120;
		return price;
		}
        if(foodName == "WhiteSauceMaggi"){
		price=80;
		return price; 
		}
        if(foodName == "VegLoadedPizza"){
			price=230; 
			return price; 
			}
        if(foodName == "ChickenLoadedPizza"){ 
		price=270; 
		return price; 
		}
        if(foodName == "CheeseBurstBurger"){ 
		price=150; 
		return price; 
		}
        if(foodName == "VegRollSpecial"){ 
		price=90; 
		return price; 
		}
        if(foodName == "ChickenRollDeluxe"){ 
		price=140; 
		return price; 
		}
        if(foodName == "PaneerTikkaWrap"){ 
		price=130; 
		return price; 
		}
        if(foodName == "ChickenTikkaWrap"){ 
		price=170; 
		return price; 
		}
        if(foodName == "VegFriedRiceCombo"){ 
		price=150; 
		return price; 
		}
        if(foodName == "ChickenFriedRiceCombo"){ 
		price=180; 
		return price; 
		}
        if(foodName == "EggRiceCombo"){ 
		price=160; 
		return price; 
		}
        if(foodName == "PaneerChilliDry"){ 
		price=150; 
		return price; 
		}
        if(foodName == "ChickenChilliDry"){ 
		price=190; 
		return price; 
		}
        if(foodName == "VegManchurianGravy"){ 
		price=140; 
		return price; 
		}
        if(foodName == "ChickenManchurianGravy"){ 
		price=180; 
		return price; 
		}
        if(foodName == "CheeseGarlicBread"){ 
		price=120; 
		return price; 
		}
        if(foodName == "StuffedKulcha"){ 
		price=90; 
		return price; 
		}
        if(foodName == "AmritsariNaan"){ 
		price=100; 
		return price; 
		}
        if(foodName == "DalMakhani"){ 
		price=160; 
		return price; 
		}
        if(foodName == "PaneerLababdar"){ 
		price=200; 
		return price;
		}
        if(foodName == "ButterMilk"){ 
		price=40; 
		return price; 
		}
        if(foodName == "FreshLimeJuice"){ 
		price=60; 
		return price; 
		}
        if(foodName == "WatermelonJuice"){ 
		price=70; 
		return price; 
		}
        if(foodName == "ChocolatePastry"){ 
		price=90; 
		return price; 
		}
        if(foodName == "BlackForestPastry"){ 
		price=100; 
		return price; 
		}
        if(foodName == "ChocoChipIceCream"){ 
		price=80; 
		return price; 
		}
        if(foodName == "MangoIceCream"){ 
		price=70; 
		return price; 
		}
        if(foodName == "KulfiFalooda"){ 
		price=120; 
		return price;
		}
        if(foodName == "DryFruitShake"){ 
		price=150; 
		return price; 
		}

        return price;
    }

    public static double search(String foodName, int quantity) {

        if (foodName == "MasalaPasta") {
    price = 120 * quantity;
    return price;
		}

		if (foodName == "WhiteSauceMaggi") {
			price = 80 * quantity;
			return price;
		}

		if (foodName == "VegLoadedPizza") {
			price = 230 * quantity;
			return price;
		}

		if (foodName == "ChickenLoadedPizza") {
			price = 270 * quantity;
			return price;
		}

		if (foodName == "CheeseBurstBurger") {
			price = 150 * quantity;
			return price;
		}

		if (foodName == "VegRollSpecial") {
			price = 90 * quantity;
			return price;
		}

		if (foodName == "ChickenRollDeluxe") {
			price = 140 * quantity;
			return price;
		}

		if (foodName == "PaneerTikkaWrap") {
			price = 130 * quantity;
			return price;
		}

		if (foodName == "ChickenTikkaWrap") {
			price = 170 * quantity;
			return price;
		}

		if (foodName == "VegFriedRiceCombo") {
			price = 150 * quantity;
			return price;
		}

		if (foodName == "ChickenFriedRiceCombo") {
			price = 180 * quantity;
			return price;
		}

		if (foodName == "EggRiceCombo") {
			price = 160 * quantity;
			return price;
		}

		if (foodName == "PaneerChilliDry") {
			price = 150 * quantity;
			return price;
		}

		if (foodName == "ChickenChilliDry") {
			price = 190 * quantity;
			return price;
		}

		if (foodName == "VegManchurianGravy") {
			price = 140 * quantity;
			return price;
		}

		if (foodName == "ChickenManchurianGravy") {
			price = 180 * quantity;
			return price;
		}

		if (foodName == "CheeseGarlicBread") {
			price = 120 * quantity;
			return price;
		}

		if (foodName == "StuffedKulcha") {
			price = 90 * quantity;
			return price;
		}

		if (foodName == "AmritsariNaan") {
			price = 100 * quantity;
			return price;
		}

		if (foodName == "DalMakhani") {
			price = 160 * quantity;
			return price;
		}
        return price;
    }
} 
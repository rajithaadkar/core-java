class UberEats {
    static double price;

    public static double search(String foodName) {

        if(foodName == "Maggie"){ 
		price=40; 
		return price; 
		}
        if(foodName == "BreadButter"){ 
		price=30; 
		return price; 
		}
        if(foodName == "PeanutButterSandwich"){ 
		price=60; 
		return price; 
		}
        if(foodName == "VegRoll"){ 
		price=70; 
		return price; 
		}
        if(foodName == "ChickenPopcorn"){ 
		price=150; 
		return price; 
		}
        if(foodName == "CheeseSandwich"){ 
		price=90; 
		return price; 
		}
        if(foodName == "VegCutlet"){ 
		price=50;
		return price; 
		}
        if(foodName == "AlooParatha"){ 
		price=80; 
		return price; 
		}
        if(foodName == "PaneerParatha"){ 
		price=100; 
		return price; 
		}
        if(foodName == "CholeBhature"){
			price=120; 
			return price; 
			}
        if(foodName == "RajmaChawal"){ 
		price=110; 
		return price; 
		}
        if(foodName == "VegPulao"){ 
		price=130; 
		return price;
		}
        if(foodName == "ChickenPulao"){ 
		price=170; 
		return price; 
		}
        if(foodName == "MuttonBiryani"){
			price=280;
			return price; 
			}
        if(foodName == "EggBiryani"){ 
		price=150; 
		return price;
		}
        if(foodName == "TandooriRoti"){ 
		price=20; 
		return price; 
		}
        if(foodName == "ButterChicken"){ 
		price=250; 
		return price; 
		}
        if(foodName == "KadaiPaneer"){ 
		price=220; 
		return price; 
		}
		if(foodName == "ChickenKadai"){ 
		price=220; 
		return price; 
		}
        if(foodName == "VegKorma"){ 
		price=180; 
		return price;
		}
        if(foodName == "ChickenKorma"){
			price=260; 
			return price; }
        if(foodName == "ColdDrink"){ 
		price=40; 
		return price; 
		}
        if(foodName == "MineralWater"){
			price=20; 
			return price; 
			}
        if(foodName == "FreshLimeSoda"){ 
		price=60; 
		return price; 
		}
        if(foodName == "OrangeJuice"){ 
		price=70; 
		return price; 
		}
        if(foodName == "PineappleJuice"){ 
		price=80; 
		return price; 
		}
		if(foodName == "CocoCola"){ 
		price=40; 
		return price; 
		}
        if(foodName == "MineralWater"){ 
		price=20; 
		return price;
		}
        if(foodName == "LimeSoda"){ 
		price=20; 
		return price; 
		}
        if(foodName == "AppleJuice"){ 
		price=70; 
		return price; 
		}
        if(foodName == "GrapesJuice"){ 
		price=80; 
		return price; 
		}
        if(foodName == "ChocoShake"){ 
		price=120; 
		return price;
		}
        if(foodName == "KitkatShake"){ 
		price=140; 
		return price; 
		}
        if(foodName == "OreoShake"){ 
		price=130; 
		return price; 
		}
        if(foodName == "IceCreamSundae"){ 
		price=150; 
		return price; 
		}
        if(foodName == "Falafel"){ 
		price=160; 
		return price; 
		}
		if(foodName == "PannerNoodles"){
			price=110;
			return price;
			}
        if(foodName == "GobiNoodles"){
			price=130;
			return price;
			}
        if(foodName == "AlooTikka"){
			price=200;
			return price;
			}
        if(foodName == "Roti"){
			price=40;
			return price;
			}
        if(foodName == "CornCheeseMaggie"){
			price=50;
			return price;
			}
        if(foodName == "PaneerTikka"){
			price=180;
			return price;
			}

        return price;
    }

    public static double search(String foodName, int quantity) {

        
			if (foodName == "Maggie") {
    price = 40 * quantity;
    return price;
		}

		if (foodName == "BreadButter") {
			price = 30 * quantity;
			return price;
		}

		if (foodName == "PeanutButterSandwich") {
			price = 60 * quantity;
			return price;
		}

		if (foodName == "VegRoll") {
			price = 70 * quantity;
			return price;
		}

		if (foodName == "ChickenPopcorn") {
			price = 150 * quantity;
			return price;
		}

		if (foodName == "CheeseSandwich") {
			price = 90 * quantity;
			return price;
		}

		if (foodName == "VegCutlet") {
			price = 50 * quantity;
			return price;
		}

		if (foodName == "AlooParatha") {
			price = 80 * quantity;
			return price;
		}

		if (foodName == "PaneerParatha") {
			price = 100 * quantity;
			return price;
		}

		if (foodName == "CholeBhature") {
			price = 120 * quantity;
			return price;
		}

		if (foodName == "RajmaChawal") {
			price = 110 * quantity;
			return price;
		}

		if (foodName == "VegPulao") {
			price = 130 * quantity;
			return price;
		}

		if (foodName == "ChickenPulao") {
			price = 170 * quantity;
			return price;
		}

		if (foodName == "MuttonBiryani") {
			price = 280 * quantity;
			return price;
		}

		if (foodName == "EggBiryani") {
			price = 150 * quantity;
			return price;
		}

		if (foodName == "TandooriRoti") {
			price = 20 * quantity;
			return price;
		}

		if (foodName == "ButterChicken") {
			price = 250 * quantity;
			return price;
		}

		if (foodName == "KadaiPaneer") {
			price = 220 * quantity;
			return price;
		}

		if (foodName == "VegKorma") {
			price = 180 * quantity;
			return price;
		}

		if (foodName == "ChickenKorma") {
			price = 260 * quantity;
			return price;
		}

        return price;
    }
}
class Doordash {
    static double price;

    public static double search(String foodName) {

        if(foodName == "Tacos"){ 
		price=120; 
		return price; 
		}
       else if(foodName == "Burrito"){ 
		price=150; 
		return price; 
		}
       else if(foodName == "Quesadilla"){ 
		price=140; 
		return price; 
		}
       else if(foodName == "NachoFries"){ 
		price=100; 
		return price; 
		}
       else if(foodName == "ChickenWings"){ 
		price=180; 
		return price; 
		}
       else if(foodName == "BBQChicken"){ 
		price=250; 
	  	return price; 
		}
       else if(foodName == "Steak"){ 
		price=300; 
		return price; 
		}
       else if(foodName == "GrilledFish"){ 
		price=220; 
		return price; 
		}
       else if(foodName == "CaesarSalad"){ 
		price=130; 
		return price;
		}
       else if(foodName == "GreekSalad"){ 
		price=140; 
		return price;
		}
       else if(foodName == "VegWrap"){ 
		price=110; 
		return price; 
		}
       else if(foodName == "ChickenWrap"){ 
		price=140; 
		return price; 
		}
       else if(foodName == "ClubSandwich"){ 
		price=160; 
		return price; 
		}
       else if(foodName == "BLTSandwich"){ 
		price=150; 
		return price;
		}
       else if(foodName == "MacAndCheese"){ 
		price=120; 
		return price; 
		}
       else if(foodName == "Spaghetti"){ 
		price=180; 
		return price; 
		}
       else if(foodName == "Lasagna"){ 
		price=200; 
		return price; 
		}
       else if(foodName == "Ramen"){ 
		price=170; 
		return price; 
		}
       else if(foodName == "Sushi"){ 
		price=250; 
		return price; 
		}
       else if(foodName == "Tempura"){ 
		price=220; 
		return price; 
		}
       else if(foodName == "Dumplings"){ 
		price=130; 
		return price; 
		}
       else if(foodName == "HotChocolate"){ 
		price=90; 
		return price; 
		}
       else if(foodName == "IcedTea"){ 
		price=60; 
		return price;
		}
       else if(foodName == "Smoothie"){ 
		price=110; 
		return price; 
		}
      else if(foodName == "Cheesecake"){ 
		price=140; 
		return price; 
		}
       else if(foodName == "ApplePie"){ 
		price=120; 
		return price;
		}
       else if(foodName == "Pancakes"){ 
		price=100; 
		return price; 
		}
       else if(foodName == "Waffles"){ 
		price=110; 
		return price; 
		}
       else if(foodName == "FrenchToast"){ 
		price=120; 
		return price; 
		}
       else if(foodName == "Oatmeal"){ 
		price=80; 
		return price;
		}
		else if(foodName == "GreenTea"){ 
		price=15;
		return price; 
		}
       else if(foodName == "ColdCoffee"){ 
		price=20; 
		return price;
		}
       else if(foodName == "BadamMilkshake"){
			price=110; 
			return price;
			}
       else if(foodName == "Brownie"){
			price=60;
			return price;
			}
       else if(foodName == "cake"){ 
		price=50; 
		return price;
		}
	else if(foodName == "NeerDosa"){
			price=70;
			return price;
			}
      else  if(foodName == "SetDosa"){
			price=80;
			return price;
			}
       else if(foodName == "OnionDosa"){
			price=90;
			return price;
			}
       else if(foodName == "VegPalav"){
			price=150;
			return price;
			}
       else if(foodName == "ChickenKabab"){
			price=180;
			return price;
			}
        else {
			System.out.println("foodName not found");
		}
        return price;
    }

    public static double search(String foodName, int quantity) {

        if (foodName == "Tacos") {
    price = 120 * quantity;
    return price;
		}
		else if (foodName == "Burrito") {
			price = 150 * quantity;
			return price;
		}
		else if (foodName == "Quesadilla") {
			price = 140 * quantity;
			return price;
		}
		else if (foodName == "NachoFries") {
			price = 100 * quantity;
			return price;
		}
		else if (foodName == "ChickenWings") {
			price = 180 * quantity;
			return price;
		}
		else if (foodName == "BBQChicken") {
			price = 250 * quantity;
			return price;
		}
		else if (foodName == "Steak") {
			price = 300 * quantity;
			return price;
		}
		else if (foodName == "GrilledFish") {
			price = 220 * quantity;
			return price;
		}
		else if (foodName == "CaesarSalad") {
			price = 130 * quantity;
			return price;
		}
		else if (foodName == "GreekSalad") {
			price = 140 * quantity;
			return price;
		}
		else if (foodName == "VegWrap") {
			price = 110 * quantity;
			return price;
		}
		else if (foodName == "ChickenWrap") {
			price = 140 * quantity;
			return price;
		}
		else if (foodName == "ClubSandwich") {
			price = 160 * quantity;
			return price;
		}
		else if (foodName == "BLTSandwich") {
			price = 150 * quantity;
			return price;
		}
		else if (foodName == "MacAndCheese") {
			price = 120 * quantity;
			return price;
		}
		else if (foodName == "Spaghetti") {
			price = 180 * quantity;
			return price;
		}
		else if (foodName == "Lasagna") {
			price = 200 * quantity;
			return price;
		}
		else if (foodName == "Ramen") {
			price = 170 * quantity;
			return price;
		}
		else if (foodName == "Sushi") {
			price = 250 * quantity;
			return price;
		}
		else if (foodName == "Tempura") {
			price = 220 * quantity;
			return price;
		}
		else {
			System.out.println("Not Found");
		}

        return price;
    }
}
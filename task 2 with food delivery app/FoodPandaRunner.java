class FoodPandaRunner {

    public static void main(String[] args) {

        String itemName = "ChickenBurger";
        double price = FoodPanda.search(itemName);
        System.out.println("The Price of the " + itemName + " is " + price);
        price = FoodPanda.search("ChickenBurger", 2);
        System.out.println("The Price of the " + itemName + " for quantity is " + price);
		
	    itemName = "VegBurger";
        price = FoodPanda.search(itemName);
        System.out.println("The Price of the " + itemName + " is " + price);
        price = FoodPanda.search("VegBurger", 2);
        System.out.println("The Price of the " + itemName + " for quantity is " + price);
		
	    itemName = "DoubleCheeseBurger";
        price = FoodPanda.search(itemName);
        System.out.println("The Price of the " + itemName + " is " + price);
        price = FoodPanda.search("DoubleCheeseBurger", 2);
        System.out.println("The Price of the " + itemName + " for quantity is " + price);
		
		itemName = "ChickenPizzaSmall";
        price = FoodPanda.search(itemName);
        System.out.println("The Price of the " + itemName + " is " + price);
        price = FoodPanda.search("ChickenPizzaSmall", 2);
        System.out.println("The Price of the " + itemName + " for quantity is " + price);
		
	    itemName = "VegPizzaMedium";
        price = FoodPanda.search(itemName);
        System.out.println("The Price of the " + itemName + " is " + price);
        price = FoodPanda.search("VegPizzaMedium", 2);
        System.out.println("The Price of the " + itemName + " for quantity is " + price);

    }
}
class DoordashRunner {

    public static void main(String[] args) {

        String itemName = "Tacos";

        double price = Doordash.search(itemName);
        System.out.println("The Price of the " + itemName + " is " + price);
		price = Doordash.search("Tacos", 2);
        System.out.println("The Price of the " + itemName + " for quantity is " + price);
		
		itemName = "Burrito";
		price = Doordash.search(itemName);
        System.out.println("The Price of the " + itemName + " is " + price);
		price = Doordash.search("Burrito", 2);
        System.out.println("The Price of the " + itemName + " for quantity is " + price);
		
		itemName = "Quesadilla";
		 price = Doordash.search(itemName);
        System.out.println("The Price of the " + itemName + " is " + price);
		price = Doordash.search("Quesadilla", 2);
        System.out.println("The Price of the " + itemName + " for quantity is " + price);
		
		itemName = "NachoFries";
	    price = Doordash.search(itemName);
        System.out.println("The Price of the " + itemName + " is " + price);
		price = Doordash.search("NachoFries", 2);
        System.out.println("The Price of the " + itemName + " for quantity is " + price);
		
		itemName = "ChickenWings";
	   price = Doordash.search(itemName);
        System.out.println("The Price of the " + itemName + " is " + price);
		price = Doordash.search("ChickenWings", 2);
        System.out.println("The Price of the " + itemName + " for quantity is " + price);

    }
}
class ZomatoRunner {

    public static void main(String[] food) {

        String itemName = "PaniPuri";
        double price = Zomato.search(itemName);
        System.out.println("The Price of the " + itemName + " is " + price);
		price = Zomato.search("PaniPuri", 3);
        System.out.println("The Price of the " + itemName + " for quantity is " + price);
		
		itemName = "MasalaDosa";
        price = Zomato.search(itemName);
        System.out.println("The Price of the " + itemName + " is " + price);
		price = Zomato.search("MasalaDosa", 3);
        System.out.println("The Price of the " + itemName + " for quantity is " + price);
		
		itemName = "RavaDosa";
        price = Zomato.search(itemName);
        System.out.println("The Price of the " + itemName + " is " + price);
		price = Zomato.search("RavaDosa", 3);
        System.out.println("The Price of the " + itemName + " for quantity is " + price);
		
		itemName = "OnionUttapam";
        price = Zomato.search(itemName);
        System.out.println("The Price of the " + itemName + " is " + price);
		price = Zomato.search("OnionUttapam", 3);
        System.out.println("The Price of the " + itemName + " for quantity is " + price);
		
		itemName = "VegBiryani";
        price = Zomato.search(itemName);
        System.out.println("The Price of the " + itemName + " is " + price);
		price = Zomato.search("VegBiryani", 3);
        System.out.println("The Price of the " + itemName + " for quantity is " + price);
		
		itemName = "Chicken65";
        price = Zomato.search(itemName);
        System.out.println("The Price of the " + itemName + " is " + price);
		price = Zomato.search("Chicken65", 3);
        System.out.println("The Price of the " + itemName + " for quantity is " + price);
		
		itemName = "GobiManchurian";
        price = Zomato.search(itemName);
        System.out.println("The Price of the " + itemName + " is " + price);
		price = Zomato.search("GobiManchurian", 3);
        System.out.println("The Price of the " + itemName + " for quantity is " + price);
		
		itemName = "ChilliChicken";
        price = Zomato.search(itemName);
        System.out.println("The Price of the " + itemName + " is " + price);
		price = Zomato.search("ChilliChicken", 3);
        System.out.println("The Price of the " + itemName + " for quantity is " + price);
		
		itemName = "VegFriedRice";
        price = Zomato.search(itemName);
        System.out.println("The Price of the " + itemName + " is " + price);
		price = Zomato.search("VegFriedRice", 3);
        System.out.println("The Price of the " + itemName + " for quantity is " + price);
		
		itemName = "EggFriedRice";
        price = Zomato.search(itemName);
        System.out.println("The Price of the " + itemName + " is " + price);
		price = Zomato.search("EggFriedRice", 3);
        System.out.println("The Price of the " + itemName + " for quantity is " + price);

    }
}
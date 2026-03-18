class EatSureRunner {

    public static void main(String[] args) {

        String itemName = "PaneerPizza";
        double price = EatSure.search(itemName);
        System.out.println("The Price of the " + itemName + " is " + price);
        price = EatSure.search("PaneerPizza", 2);
        System.out.println("The Price of the " + itemName + " for quantity is " + price);
		
	    itemName = "CornPizza";
        price = EatSure.search(itemName);
        System.out.println("The Price of the " + itemName + " is " + price);
        price = EatSure.search("CornPizza", 2);
        System.out.println("The Price of the " + itemName + " for quantity is " + price);
		
		itemName = "ChickenTikkaPizza";
        price = EatSure.search(itemName);
        System.out.println("The Price of the " + itemName + " is " + price);
        price = EatSure.search("ChickenTikkaPizza", 2);
        System.out.println("The Price of the " + itemName + " for quantity is " + price);
		
		itemName = "VegClubSandwich";
        price = EatSure.search(itemName);
        System.out.println("The Price of the " + itemName + " is " + price);
        price = EatSure.search("VegClubSandwich", 2);
        System.out.println("The Price of the " + itemName + " for quantity is " + price);
		
		itemName = "ChickenClubSandwich";
        price = EatSure.search(itemName);
        System.out.println("The Price of the " + itemName + " is " + price);
        price = EatSure.search("ChickenClubSandwich", 2);
        System.out.println("The Price of the " + itemName + " for quantity is " + price);
		
		

    }
}
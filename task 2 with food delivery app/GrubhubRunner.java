class GrubhubRunner {

    public static void main(String[] args) {

        String itemName = "VegSandwich";
        double price = Grubhub.search(itemName);
        System.out.println("The Price of the " + itemName + " is " + price);
        price = Grubhub.search("VegSandwich", 2);
        System.out.println("The Price of the " + itemName + " for quantity is " + price);
		
		itemName = "ChickenSandwich";
        price = Grubhub.search(itemName);
        System.out.println("The Price of the " + itemName + " is " + price);
        price = Grubhub.search("ChickenSandwich", 2);
        System.out.println("The Price of the " + itemName + " for quantity is " + price);
		
		itemName = "FishBurger";
        price = Grubhub.search(itemName);
        System.out.println("The Price of the " + itemName + " is " + price);
        price = Grubhub.search("FishBurger", 2);
        System.out.println("The Price of the " + itemName + " for quantity is " + price);
		
		itemName = "CheesePasta";
        price = Grubhub.search(itemName);
        System.out.println("The Price of the " + itemName + " is " + price);
        price = Grubhub.search("CheesePasta", 2);
        System.out.println("The Price of the " + itemName + " for quantity is " + price);
		
		itemName = "WhiteSaucePasta";
        price = Grubhub.search(itemName);
        System.out.println("The Price of the " + itemName + " is " + price);
        price = Grubhub.search("WhiteSaucePasta", 2);
        System.out.println("The Price of the " + itemName + " for quantity is " + price);

    }
}
class UberEatsRunner {

    public static void main(String[] args) {

        String itemName = "Maggie";
        double price = UberEats.search(itemName);
        System.out.println("The Price of the " + itemName + " is " + price);
        price = UberEats.search("Maggie", 3);
        System.out.println("The Price of the " + itemName + " for quantity is " + price);
		
		itemName = "BreadButter";
        price = UberEats.search(itemName);
        System.out.println("The Price of the " + itemName + " is " + price);
        price = UberEats.search("BreadButter", 3);
        System.out.println("The Price of the " + itemName + " for quantity is " + price);
		
		itemName = "PeanutButterSandwich";
        price = UberEats.search(itemName);
        System.out.println("The Price of the " + itemName + " is " + price);
        price = UberEats.search("PeanutButterSandwich", 3);
        System.out.println("The Price of the " + itemName + " for quantity is " + price);
		
		itemName = "VegRoll";
        price = UberEats.search(itemName);
        System.out.println("The Price of the " + itemName + " is " + price);
        price = UberEats.search("VegRoll", 3);
        System.out.println("The Price of the " + itemName + " for quantity is " + price);
		
		itemName = "ChickenPopcorn";
        price = UberEats.search(itemName);
        System.out.println("The Price of the " + itemName + " is " + price);
        price = UberEats.search("ChickenPopcorn", 3);
        System.out.println("The Price of the " + itemName + " for quantity is " + price);

    }
}
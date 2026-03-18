class MagicPinRunner {

    public static void main(String[] args) {

        String itemName = "CheeseMaggi";
        double price = MagicPin.search(itemName);
        System.out.println("The Price of the " + itemName + " is " + price);
        price = MagicPin.search("CheeseMaggi", 2);
        System.out.println("The Price of the " + itemName + " for quantity is " + price);
		
		itemName = "VegMaggi";
        price = MagicPin.search(itemName);
        System.out.println("The Price of the " + itemName + " is " + price);
        price = MagicPin.search("VegMaggi", 2);
        System.out.println("The Price of the " + itemName + " for quantity is " + price);
		
		itemName = "EggMaggi";
        price = MagicPin.search(itemName);
        System.out.println("The Price of the " + itemName + " is " + price);
        price = MagicPin.search("EggMaggi", 2);
        System.out.println("The Price of the " + itemName + " for quantity is " + price);
		
		itemName = "ChickenMaggi";
        price = MagicPin.search(itemName);
        System.out.println("The Price of the " + itemName + " is " + price);
        price = MagicPin.search("ChickenMaggi", 2);
        System.out.println("The Price of the " + itemName + " for quantity is " + price);
		
		itemName = "VegSandwichGrill";
        price = MagicPin.search(itemName);
        System.out.println("The Price of the " + itemName + " is " + price);
        price = MagicPin.search("VegSandwichGrill", 2);
        System.out.println("The Price of the " + itemName + " for quantity is " + price);
		
		itemName = "ChickenSandwichGrill";
        price = MagicPin.search(itemName);
        System.out.println("The Price of the " + itemName + " is " + price);
        price = MagicPin.search("ChickenSandwichGrill", 2);
        System.out.println("The Price of the " + itemName + " for quantity is " + price);
		
		itemName = "PaneerBurger";
        price = MagicPin.search(itemName);
        System.out.println("The Price of the " + itemName + " is " + price);
        price = MagicPin.search("PaneerBurger", 2);
        System.out.println("The Price of the " + itemName + " for quantity is " + price);

    }
}
class OrderSystem {

    static void sendToKitchen() {
	
        System.out.println("Order is sent to the kitchen");
		Kitchen.receiveOrder();
    }
}
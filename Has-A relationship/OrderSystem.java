class OrderSystem {

    static void takeOrder() {
	
        System.out.println(" Taking customer order");
        InventoryCheck.validate();
    }
}
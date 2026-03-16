class CarrierService {

    static void pickUpPackage() {
	
        System.out.println("Picking up package");
		
        HubRouter.sortToZipCode();
    }
}

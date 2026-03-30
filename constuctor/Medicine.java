class Medicine {
	
    int medicineId;
    String name;
    String brandName;
    double price;
    int quantity;
    String expiryDate;
    String dosage;
    boolean isPrescriptionRequired;

    Medicine(int medicineId, String name, String brandName, double price, int quantity,
             String expiryDate, String dosage, boolean isPrescriptionRequired) {

        this.medicineId = medicineId;
        this.name = name;
        this.brandName = brandName;
        this.price = price;
        this.quantity = quantity;
        this.expiryDate = expiryDate;
        this.dosage = dosage;
        this.isPrescriptionRequired = isPrescriptionRequired;
    }

    void displayDetails() {
        System.out.println("Medicine Id: " + medicineId);
        System.out.println("Name: " + name);
        System.out.println("Brand: " + brandName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Expiry Date: " + expiryDate);
        System.out.println("Dosage: " + dosage);
        System.out.println("Prescription Required: " + isPrescriptionRequired);
        System.out.println("------------------------");
    }
}


class Lipstick {

    int lipstickId;
    String brandName;
    String shade;
    String color;
    double price;
    String finishType;
    boolean isWaterproof;
    int quantity;

    Lipstick(int lipstickId, String brandName, String shade, String color,
             double price, String finishType, boolean isWaterproof, int quantity) {

        this.lipstickId = lipstickId;
        this.brandName = brandName;
        this.shade = shade;
        this.color = color;
        this.price = price;
        this.finishType = finishType;
        this.isWaterproof = isWaterproof;
        this.quantity = quantity;
    }

    void displayDetails() {
        System.out.println("Lipstick Id: " + lipstickId);
        System.out.println("Brand Name: " + brandName);
        System.out.println("Shade: " + shade);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
        System.out.println("Finish Type: " + finishType);
        System.out.println("Is Waterproof: " + isWaterproof);
        System.out.println("Quantity: " + quantity);
        System.out.println("------------------------");
    }
}


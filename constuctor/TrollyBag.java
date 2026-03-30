class TrollyBag {

    int bagId;
    double price;
    String brandName;
    String color;
    String size;
    int wheels;
    String material;
    boolean isWaterproof;

    TrollyBag(int bagId, double price, String brandName, String color,
              String size, int wheels, String material, boolean isWaterproof) {

        this.bagId = bagId;
        this.price = price;
        this.brandName = brandName;
        this.color = color;
        this.size = size;
        this.wheels = wheels;
        this.material = material;
        this.isWaterproof = isWaterproof;
    }

    public void displayDetails() {
        System.out.println("Bag Id: " + bagId);
        System.out.println("Price: " + price);
        System.out.println("Brand: " + brandName);
        System.out.println("Color: " + color);
        System.out.println("Size: " + size);
        System.out.println("Wheels: " + wheels);
        System.out.println("Material: " + material);
        System.out.println("Waterproof: " + isWaterproof);
        System.out.println("------------------------");
    }
}


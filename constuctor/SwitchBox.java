class SwitchBox {

    int switchBoxId;
    String brandName;
    int numberOfSwitches;
    String material;
    String color;
    double price;
    boolean hasIndicator;
    String type;

    SwitchBox(int switchBoxId, String brandName, int numberOfSwitches,
              String material, String color, double price,
              boolean hasIndicator, String type) {

        this.switchBoxId = switchBoxId;
        this.brandName = brandName;
        this.numberOfSwitches = numberOfSwitches;
        this.material = material;
        this.color = color;
        this.price = price;
        this.hasIndicator = hasIndicator;
        this.type = type;
    }

  
    void display() {
        System.out.println("SwitchBox Id: " + switchBoxId);
        System.out.println("Brand: " + brandName);
        System.out.println("No of Switches: " + numberOfSwitches);
        System.out.println("Material: " + material);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
        System.out.println("Has Indicator: " + hasIndicator);
        System.out.println("Type: " + type);
        System.out.println("----------------------");
    }
}


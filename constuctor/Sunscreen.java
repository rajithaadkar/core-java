class Sunscreen {

    int productId;
    double price;
    String brandName;
    int spf;
    String skinType;
    String type; 
    boolean isWaterResistant;
    String weight; 

    Sunscreen(int productId, double price, String brandName, int spf,
              String skinType, String type, boolean isWaterResistant, String weight) {

        this.productId = productId;
        this.price = price;
        this.brandName = brandName;
        this.spf = spf;
        this.skinType = skinType;
        this.type = type;
        this.isWaterResistant = isWaterResistant;
        this.weight = weight;
    }

    void displayDetails() {
        System.out.println("Product Id: " + productId);
        System.out.println("Price: " + price);
        System.out.println("Brand: " + brandName);
        System.out.println("SPF: " + spf);
        System.out.println("Skin Type: " + skinType);
        System.out.println("Type: " + type);
        System.out.println("Water Resistant: " + isWaterResistant);
        System.out.println("Weight: " + weight);
        System.out.println("------------------------");
    }
}


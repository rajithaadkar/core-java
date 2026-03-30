class Kajal {
    int productId;
    double price;
    String brandName;
    String color;
    String type; 
    boolean isWaterproof;
    boolean isSmudgeProof;
    String weight; 

    Kajal(int productId, double price, String brandName, String color, String type,
          boolean isWaterproof, boolean isSmudgeProof, String weight) {

        this.productId = productId;
        this.price = price;
        this.brandName = brandName;
        this.color = color;
        this.type = type;
        this.isWaterproof = isWaterproof;
        this.isSmudgeProof = isSmudgeProof;
        this.weight = weight;
    }

    void displayDetails() {
        System.out.println("Product Id: " + productId);
        System.out.println("Price: " + price);
        System.out.println("Brand: " + brandName);
        System.out.println("Color: " + color);
        System.out.println("Type: " + type);
        System.out.println("Waterproof: " + isWaterproof);
        System.out.println("Smudge Proof: " + isSmudgeProof);
        System.out.println("Weight: " + weight);
        System.out.println("------------------------");
    }
}


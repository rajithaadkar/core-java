class Gold {

    int goldId;
    String type;
    double weight;
    double pricePerGram;
    double totalPrice;
    int purity;
    String color;
    boolean isHallmarked;

    Gold(int goldId, String type, double weight, double pricePerGram,
         int purity, String color, boolean isHallmarked) {

        this.goldId = goldId;
        this.type = type;
        this.weight = weight;
        this.pricePerGram = pricePerGram;
        this.totalPrice = weight * pricePerGram;
        this.purity = purity;
        this.color = color;
        this.isHallmarked = isHallmarked;
    }

    void displayDetails() {
        System.out.println("Gold Id: " + goldId);
        System.out.println("Type: " + type);
        System.out.println("Weight: " + weight);
        System.out.println("Price per gram: " + pricePerGram);
        System.out.println("Total Price: " + totalPrice);
        System.out.println("Purity: " + purity);
        System.out.println("Color: " + color);
        System.out.println("Is Hallmarked: " + isHallmarked);
        System.out.println("------------------------");
    }
}


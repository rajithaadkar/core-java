class Flower {

    int flowerId;
    String name;
    String color;
    double price;
    String fragrance;
    String season;
    boolean isFresh;
    int quantity;

    Flower(int flowerId, String name, String color, double price,
           String fragrance, String season, boolean isFresh, int quantity) {

        this.flowerId = flowerId;
        this.name = name;
        this.color = color;
        this.price = price;
        this.fragrance = fragrance;
        this.season = season;
        this.isFresh = isFresh;
        this.quantity = quantity;
    }

    void displayDetails() {
        System.out.println("Flower Id: " + flowerId);
        System.out.println("Name: " + name);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
        System.out.println("Fragrance: " + fragrance);
        System.out.println("Season: " + season);
        System.out.println("Is Fresh: " + isFresh);
        System.out.println("Quantity: " + quantity);
        System.out.println("------------------------");
    }
}


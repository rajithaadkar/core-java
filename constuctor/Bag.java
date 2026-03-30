class Bag {

    int bagId;
    double price;
    String brandName;
    String type;
    String color;
    String material;
    int capacity;
    String waterproof;

    Bag(int bagId, double price, String brandName, String type,
        String color, String material, int capacity, String waterproof) {

        this.bagId = bagId;
        this.price = price;
        this.brandName = brandName;
        this.type = type;
        this.color = color;
        this.material = material;
        this.capacity = capacity;
        this.waterproof = waterproof;
    }

    public void displayDetails() {
        System.out.println(bagId);
        System.out.println(price);
        System.out.println(brandName);
        System.out.println(type);
        System.out.println(color);
        System.out.println(material);
        System.out.println(capacity);
        System.out.println(waterproof);
        System.out.println("---------------------------");
    }
}


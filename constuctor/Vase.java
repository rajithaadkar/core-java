class Vase {

    int vaseId;
    double price;
    String material;
    String color;
    String shape;
    double height; 
    String brandName;
    boolean isHandmade;

    Vase(int vaseId, double price, String material, String color, String shape,
         double height, String brandName, boolean isHandmade) {

        this.vaseId = vaseId;
        this.price = price;
        this.material = material;
        this.color = color;
        this.shape = shape;
        this.height = height;
        this.brandName = brandName;
        this.isHandmade = isHandmade;
    }

    void displayDetails() {
        System.out.println("Vase Id: " + vaseId);
        System.out.println("Price: " + price);
        System.out.println("Material: " + material);
        System.out.println("Color: " + color);
        System.out.println("Shape: " + shape);
        System.out.println("Height: " + height + " cm");
        System.out.println("Brand: " + brandName);
        System.out.println("Handmade: " + isHandmade);
        System.out.println("------------------------");
    }
}


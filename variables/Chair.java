class Chair {
	String productName;
    String brand;
    int price;
    String color;
    String material ;
    String chairType;
    int weightCapacity ;
    double rating;
    String warranty;

    public static void main(String[] args) {

       productName = "Green Soul Jupiter Office Chair";
       brand = "Green Soul";
       price = 12999;
       color = "Black";
       material = "Leatherette";
       chairType = "High Back Office Chair";
       weightCapacity = 120;
       rating = 4.3;
       warranty = "3 Years";

        System.out.println("Product Name: " + productName);
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
        System.out.println("Color: " + color);
        System.out.println("Material: " + material);
        System.out.println("Chair Type: " + chairType);
        System.out.println("Weight Capacity: " + weightCapacity + " kg");
        System.out.println("Rating: " + rating);
        System.out.println("Warranty: " + warranty);
    }
}

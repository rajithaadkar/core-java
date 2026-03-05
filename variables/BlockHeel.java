class BlockHeel {
	
    static int price = 1299;
    static String brand = " TRYME";
    static String productName = " Fabulous Block Heel Sandal";
    static String color = " Black";
    static String material = " Synthetic";
    static String heelType = " Block Heel";
    static String heelHeight = " Medium";
    static String occasion = " Party & Casual";
    static String idealFor = " Women and Girls";

    public static void main(String[] args) {

        int price = 1599;
        String brand = " Metro";
        String color = " Beige";
        String heelHeight = " High";
        String occasion = " Party Wear";
		idealFor = " Women";

        System.out.println("Local price is " + price);
        System.out.println("Static price is " + BlockHeel.price);

        System.out.println("Local brand is " + brand);
        System.out.println("Static brand is " + BlockHeel.brand);

        System.out.println("Local color is " + color);
        System.out.println("Static color is " + BlockHeel.color);

        System.out.println("Local heelHeight is " + heelHeight);
        System.out.println("Static heelHeight is " + BlockHeel.heelHeight);

        System.out.println("Local occasion is " + occasion);
        System.out.println("Static occasion is " + BlockHeel.occasion);
         
		System.out.println("Local idealFor is " + idealFor);
        System.out.println("Static idealFor is " + BlockHeel.idealFor);
    }
}

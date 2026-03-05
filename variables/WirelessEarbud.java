class WirelessEarbud {

    
    static int price = 1199;
    static String brand = "Noise";
    static String color = "Black";
    static String playTime = "40 Hours";
	static String bluetoothRange = "10 Metres";
    static String formFactor = "True Wireless";
    static String noiseControl = "Quad Mic ENC";
    static String specialFeatures = "Sweatproof";
    static String material = "Polycarbonate (PC)";

    public static void main(String[] ref) {

       
        int price = 1499;
        String brand = "Boat";
        String color = "Blue";
        String playTime = "50 Hours";
        String bluetoothRange = "15 Metres";
        String formFactor = "In-Ear Wireless";
        String noiseControl = "Active Noise Cancellation (ANC)";
        String specialFeatures = "Fast Charging & Voice Assistant";
        String material = "ABS Plastic";

        System.out.println("Local price is " + price);
        System.out.println("Static price is " + WirelessEarbud.price);

        System.out.println("Local brand is " + brand);
        System.out.println("Static brand is " + WirelessEarbud.brand);

        System.out.println("Local color is " + color);
        System.out.println("Static color is " + WirelessEarbud.color);

        System.out.println("Local playTime is " + playTime);
        System.out.println("Static playTime is " + WirelessEarbud.playTime);
    }
}

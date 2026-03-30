class Mascara {

    int mascaraId;
    double price;
    String brandName;
    String type;
    String color;
    String waterproof;
    String volumeEffect;
    int expiryMonths;

    Mascara() {
        System.out.println("Mascara Constructor is invoked");
    }

    Mascara(int mascaraId, double price, String brandName, String type,
            String color, String waterproof, String volumeEffect, int expiryMonths) {

        this.mascaraId = mascaraId;
        this.price = price;
        this.brandName = brandName;
        this.type = type;
        this.color = color;
        this.waterproof = waterproof;
        this.volumeEffect = volumeEffect;
        this.expiryMonths = expiryMonths;
    }

    public void displayDetails() {
        System.out.println(mascaraId);
        System.out.println(price);
        System.out.println(brandName);
        System.out.println(type);
        System.out.println(color);
        System.out.println(waterproof);
        System.out.println(volumeEffect);
        System.out.println(expiryMonths);
        System.out.println("---------------------------");
    }
}



       
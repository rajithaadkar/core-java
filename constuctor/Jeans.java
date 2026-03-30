class Jeans {

    int jeansId;
    double price;
    String brandName;
    String fitType;
    String color;
    String material;
    int size;
    String gender;

    Jeans(int jeansId, double price, String brandName, String fitType,
          String color, String material, int size, String gender) {

        this.jeansId = jeansId;
        this.price = price;
        this.brandName = brandName;
        this.fitType = fitType;
        this.color = color;
        this.material = material;
        this.size = size;
        this.gender = gender;
    }

    public void displayDetails() {
        System.out.println("The jeansId is : " + jeansId);
        System.out.println("The price is : " + price);
        System.out.println("The brandName is : " + brandName);
        System.out.println("The fitType is : " + fitType);
        System.out.println("The color is : " + color);
        System.out.println("The material is : " + material);
        System.out.println("The size is : " + size);
        System.out.println("The gender is : " + gender);
        System.out.println("---------------------------");
    }
}


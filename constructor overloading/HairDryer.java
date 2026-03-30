class HairDryer {
    int id;
	String brand;
	double power;
	String color;
	boolean portable;

    HairDryer() {}
    HairDryer(int id) { this.id = id; }
    HairDryer(int id, String brand) { this.id = id; this.brand = brand; }
    HairDryer(int id, String brand, double power) { this.id = id; this.brand = brand; this.power = power; }
    HairDryer(int id, String brand, double power, String color) { this.id = id; this.brand = brand; this.power = power; this.color = color; }
    HairDryer(int id, String brand, double power, String color, boolean portable) {
        this.id = id;
		this.brand = brand;
		this.power = power;
		this.color = color;
		this.portable = portable;
    }

    void display() {
 System.out.println("id is"+ id);
		System.out.println("Brand is" + brand);
		System.out.println("power is" + power);
		System.out.println("Color is" + color);
		System.out.println("Is it is portable" + portable);		}
}



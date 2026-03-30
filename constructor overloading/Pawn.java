class Pawn {
    int id;
	String color;
	double weight;
	String material;
	boolean active;

    Pawn() {}
    Pawn(int id) { this.id = id; }
    Pawn(int id, String color) { this.id = id; this.color = color; }
    Pawn(int id, String color, double weight) { this.id = id; this.color = color; this.weight = weight; }
    Pawn(int id, String color, double weight, String material) { this.id = id; this.color = color; this.weight = weight; this.material = material; }
    Pawn(int id, String color, double weight, String material, boolean active) {
        this.id = id;
		this.color = color;
		this.weight = weight;
		this.material = material;
		this.active = active;
    }

    void display() { 
 System.out.println("id is"+ id);
 System.out.println("Color is" + color);
 System.out.println("weight is" + weight);
 System.out.println("material is" + material);
 System.out.println("Is it is active" + active);	}
}

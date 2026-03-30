class Clip {
    int id;
	String type;
	double size;
	String color;
	boolean strong;

    Clip() {}
    Clip(int id) { this.id = id; }
    Clip(int id, String type) { this.id = id; this.type = type; }
    Clip(int id, String type, double size) { this.id = id; this.type = type; this.size = size; }
    Clip(int id, String type, double size, String color) { this.id = id; this.type = type; this.size = size; this.color = color; }
    Clip(int id, String type, double size, String color, boolean strong) {
        this.id = id;
		this.type = type;
		this.size = size;
		this.color = color;
		this.strong = strong;
    }

    void display() { 
 System.out.println("id is"+ id);
		System.out.println("type is" + type);
		System.out.println("Size is" + size);
		System.out.println("Color is" + color);
		System.out.println("Is it is Strong " + strong);	}
}

class Carrom {
    int id;
	String boardType;
	double size;
	String color;
	boolean smooth;

    Carrom() {}
    Carrom(int id) { this.id = id; }
    Carrom(int id, String boardType) { this.id = id; this.boardType = boardType; }
    Carrom(int id, String boardType, double size) { this.id = id; this.boardType = boardType; this.size = size; }
    Carrom(int id, String boardType, double size, String color) { this.id = id; this.boardType = boardType; this.size = size; this.color = color; }
    Carrom(int id, String boardType, double size, String color, boolean smooth) {
        this.id = id;
		this.boardType = boardType;
		this.size = size;
		this.color = color;
		this.smooth = smooth;
    }

    void display() { 
	System.out.println("id is"+ id);
		System.out.println("type is" + boardTypetype);
		System.out.println("size is" + size);
		System.out.println("Color is" + color);
		System.out.println("Is it is smooth" + smooth); 
		}
}

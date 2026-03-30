class ChessBoard {
    int id;
	String material;
	double size;
	String color;
	boolean foldable;

    ChessBoard() {}
    ChessBoard(int id) { this.id = id; }
    ChessBoard(int id, String material) { this.id = id; this.material = material; }
    ChessBoard(int id, String material, double size) { this.id = id; this.material = material; this.size = size; }
    ChessBoard(int id, String material, double size, String color) { this.id = id; this.material = material; this.size = size; this.color = color; }
    ChessBoard(int id, String material, double size, String color, boolean foldable) {
        this.id = id;
		this.material = material;
		this.size = size;
		this.color = color;
		this.foldable = foldable;
    }

    void display() { 
	 System.out.println("id is"+ id);
		System.out.println("Material is" + material);
		System.out.println("Size is" + size);
		System.out.println("Color is" + color);
		System.out.println("Is it is foldable" + foldable);
	}
}

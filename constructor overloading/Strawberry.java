class Strawberry {
    int id;
	String taste;
	double weight;
	String color;
	boolean fresh;

    Strawberry() {}
    Strawberry(int id) { this.id = id; }
    Strawberry(int id, String taste) { this.id = id; this.taste = taste; }
    Strawberry(int id, String taste, double weight) { this.id = id; this.taste = taste; this.weight = weight; }
    Strawberry(int id, String taste, double weight, String color) { this.id = id; this.taste = taste; this.weight = weight; this.color = color; }
    Strawberry(int id, String taste, double weight, String color, boolean fresh) {
        this.id = id;
		this.taste = taste;
		this.weight = weight;
		this.color = color;
		this.fresh = fresh;
    }

    void display() { 
        System.out.println("id is"+ id);
		System.out.println("taste is" + taste);
		System.out.println("weight is" + weight);
		System.out.println("Color is" + color);
		System.out.println("Is it is fresh" + fresh); 	
		}
}

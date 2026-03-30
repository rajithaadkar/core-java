class Track {
    int id;
	String type;
	double length;
	String location;
	boolean indoor;

    Track() {}
    Track(int id) { this.id = id; }
    Track(int id, String type) { this.id = id; this.type = type; }
    Track(int id, String type, double length) { this.id = id; this.type = type; this.length = length; }
    Track(int id, String type, double length, String location) { this.id = id; this.type = type; this.length = length; this.location = location; }
    Track(int id, String type, double length, String location, boolean indoor) {
        this.id = id;
		this.type = type;
		this.length = length;
		this.location = location;
		this.indoor = indoor;
    }

    void display() {  System.out.println("id is"+ id);
		System.out.println("type is" + type);
		System.out.println("length is" + length);
		System.out.println("Color is" + color);
		System.out.println("Is it is indoor" + indoor); 
		}
}

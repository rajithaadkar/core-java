class Battery {
    int id;
	String type;
	double capacity;
	String brand;
	boolean rechargeable;

    Battery() {}
    Battery(int id) { this.id = id; }
    Battery(int id, String type) { this.id = id; this.type = type; }
    Battery(int id, String type, double capacity) { this.id = id; this.type = type; this.capacity = capacity; }
    Battery(int id, String type, double capacity, String brand) { this.id = id; this.type = type; this.capacity = capacity; this.brand = brand; }
    Battery(int id, String type, double capacity, String brand, boolean rechargeable) {
        this.id = id;
		this.type = type;
		this.capacity = capacity;
		this.brand = brand;
		this.rechargeable = rechargeable;
    }

    void display() { 
 System.out.println("id is"+ id);
		System.out.println("type is" + type);
		System.out.println("capacity is" + capacity);
		System.out.println("brand is" + brand);
		System.out.println("Is it is rechargeable" + rechargeable);	}
}

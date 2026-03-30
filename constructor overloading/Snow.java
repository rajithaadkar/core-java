class Snow {
    int id; String form; double temp; String color; boolean melting;

    Snow() {}
    Snow(int id) { this.id = id; }
    Snow(int id, String form) { this.id = id; this.form = form; }
    Snow(int id, String form, double temp) { this.id = id; this.form = form; this.temp = temp; }
    Snow(int id, String form, double temp, String color) { this.id = id; this.form = form; this.temp = temp; this.color = color; }
    Snow(int id, String form, double temp, String color, boolean melting) {
        this.id = id;
		this.form = form;
		this.temp = temp;
		this.color = color;
		this.melting = melting;
    }

    void display() { 
 System.out.println("id is"+ id);
		System.out.println("Form is" + form);
		System.out.println("Temparature is" + temp);
		System.out.println("Color is" + color);
		System.out.println("Is it is melting " + melting);
		}
}

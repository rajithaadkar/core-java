class Steel {
    int id;
	String type;
	double weight;
	String grade;
	boolean strong;

    Steel() {}
    Steel(int id) { this.id = id; }
    Steel(int id, String type) { this.id = id; this.type = type; }
    Steel(int id, String type, double weight) { this.id = id; this.type = type; this.weight = weight; }
    Steel(int id, String type, double weight, String grade) { this.id = id; this.type = type; this.weight = weight; this.grade = grade; }
    Steel(int id, String type, double weight, String grade, boolean strong) {
        this.id = id;
		this.type = type;
		this.weight = weight;
		this.grade = grade; 
		this.strong = strong;
    }

    void display() { 
System.out.println("id is"+ id);
		System.out.println("type is " + type);
		System.out.println("weight is " + weight);
		System.out.println("grade is " + grade);
		System.out.println("Is it is strong " + strong); 	}
}


class Droplet {
    int id;
	String shape;
	double size;
	String color;
	boolean pure;

    Droplet(){}
    Droplet(int id){this.id=id;}
    Droplet(int id,String shape){this.id=id;this.shape=shape;}
    Droplet(int id,String shape,double size){this.id=id;this.shape=shape;this.size=size;}
    Droplet(int id,String shape,double size,String color){this.id=id;this.shape=shape;this.size=size;this.color=color;}
    Droplet(int id,String shape,double size,String color,boolean pure)
	{
		this.id=id;
		this.shape=shape;
		this.size=size;
		this.color=color;
		this.pure=pure;
	}

    void displayDetails(){
        System.out.println("id is"+ id);
		System.out.println("Shape is" + shape);
		System.out.println("Size is" + size);
		System.out.println("Color is" + color);
		System.out.println("Is it is pure" + pure);
    }
}

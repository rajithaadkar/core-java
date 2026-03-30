class Umbrella {
int id;
String brand;
double price;
String color;
boolean foldable;
    
	Umbrella(){}
    Umbrella(int id){this.id=id;}
    Umbrella(int id,String brand){this.id=id;this.brand=brand;}
    Umbrella(int id,String brand,double price){this.id=id;this.brand=brand;this.price=price;}
    Umbrella(int id,String brand,double price,String color){this.id=id;this.brand=brand;this.price=price;this.color=color;}
    Umbrella(int id,String brand,double price,String color,boolean foldable){
	this.id=id;
	this.brand=brand;
	this.price=price;
	this.color=color;
	this.foldable=foldable;
	}
	
    void display(){
	System.out.println("id is " + id ); 
	System.out.println("Brand is " + brand);
	System.out.println("Price is " + price);
	System.out.println("Color is" + color);
	System.out.println("Foldable " + foldable);
}
}
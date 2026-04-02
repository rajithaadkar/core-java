class Mobile{

 int mobileId;
 String brand;
 double price;
 String color;
 Sim sim;
 
 public void getMobileDetails(){
	 System.out.println("Mobile Details are");
	 System.out.println("Id :" + mobileId);
	 System.out.println("Brand :" + brand);
	 System.out.println("Price :" + price);
	 System.out.println("Color :" + color);
	 System.out.println("-------------------");
	 
	 sim.getSimDetails();
 }
}
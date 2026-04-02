class Sim{

 int simId;
 String provider;
 String number;
 String type;
 boolean active;
 
 public void getSimDetails(){
	 System.out.println("Sim Details are");
	 System.out.println("Sim Id :" + simId);
	 System.out.println("Provider :" + provider);
	 System.out.println("Number :" + number);
	 System.out.println("Type :" + type);
	 System.out.println("Active :" + active);
	  System.out.println("====================");
 }
}
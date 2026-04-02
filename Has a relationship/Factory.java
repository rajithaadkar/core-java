class Factory{

 int factoryId;
 String name;
 String location;
 int workers;
 Machine machine;
 
 public void getFactoryDetails(){
	 System.out.println("Factory Details are");
	 System.out.println("Factory Id :" + factoryId);
	 System.out.println("Name :" + name);
	 System.out.println("Location :" + location);
	 System.out.println("Workers :" + workers);
	 
	 machine.getMachineDetails();
 }
}
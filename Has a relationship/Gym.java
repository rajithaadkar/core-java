class Gym{

 int gymId;
 String name;
 String location;
 String type;
 Trainer trainer;
 
 public void getGymDetails(){
	 System.out.println("Gym Details are");
	 System.out.println("Gym Id :" + gymId);
	 System.out.println("Name :" + name);
	 System.out.println("Location :" + location);
	 System.out.println("Type :" + type);
	 
	 trainer.getTrainerDetails();
 }
}
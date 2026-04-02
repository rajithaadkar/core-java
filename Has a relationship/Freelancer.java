class Freelancer{

 int freelancerId;
 String name;
 String skill;
 int experience;
 Client client;
 
 public void getFreelancerDetails(){
	 System.out.println("Freelancer Details are");
	 System.out.println("Freelancer Id :" + freelancerId);
	 System.out.println("Name :" + name);
	 System.out.println("Skill :" + skill);
	 System.out.println("Experience :" + experience);
	
	 
	 client.getClientDetails();
 }
}
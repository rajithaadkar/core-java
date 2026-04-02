class Client{

 int clientId;
 String name;
 String project;
 double budget;
 boolean isActive;
 
 public void getClientDetails(){
	 System.out.println("Client Details are");
	 System.out.println("Client Id :" + clientId);
	 System.out.println("Name :" + name);
	 System.out.println("Project :" + project);
	 System.out.println("Budget :" + budget);
	 System.out.println("Active :" + isActive);
	 System.out.println("End of Client Details");
	 System.out.println("-------------------");
 }
}
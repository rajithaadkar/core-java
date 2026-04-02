class Machine{

 int machineId;
 String name;
 String type;
 double power;
 boolean isWorking;
 
 public void getMachineDetails(){
	 System.out.println("Machine Details are");
	 System.out.println("Machine Id :" + machineId);
	 System.out.println("Name :" + name);
	 System.out.println("Type :" + type);
	 System.out.println("Power :" + power);
	 System.out.println("Working :" + isWorking);
	 System.out.println("End of Machine Details");
	 System.out.println("-------------------");
 }
}
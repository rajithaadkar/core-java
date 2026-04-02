class Bank{

 int bankId;
 String name;
 String branch;
 String location;
 AccountHolder accountHolder;
 
 public void getBankDetails(){
	 System.out.println("Bank Details are");
	 System.out.println("Bank Id :" + bankId);
	 System.out.println("Bank Name :" + name);
	 System.out.println("Branch :" + branch);
	 System.out.println("Location :" + location);
	 System.out.println("-------------------");
	 
	 accountHolder.getAccountHolderDetails();
 }
}
class Lock{

 int lockId;
 String type;
 String material;
 boolean isSecure;
 int keyCount;
 
 public void getLockDetails(){
	 System.out.println("Lock Details are");
	 System.out.println("Lock Id :" + lockId);
	 System.out.println("Type :" + type);
	 System.out.println("Material :" + material);
	 System.out.println("Secure :" + isSecure);
	 System.out.println("Key Count :" + keyCount);
	 System.out.println("End of Lock Details");
	 System.out.println("-------------------");
 }
}
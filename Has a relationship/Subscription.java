class Subscription{

 int subscriptionId;
 String type;
 double price;
 int validity;
 boolean isActive;
 
 public void getSubscriptionDetails(){
	 System.out.println("Subscription Details are");
	 System.out.println("Subscription Id :" + subscriptionId);
	 System.out.println("Type :" + type);
	 System.out.println("Price :" + price);
	 System.out.println("Validity (days) :" + validity);
	 System.out.println("Active :" + isActive);
	 System.out.println("End of Subscription Details");
	 System.out.println("-------------------");
	 
 }
}
class OTTPlatform{

 int ottId;
 String name;
 String language;
 String region;
 Subscription subscription;
 
 public void getOTTDetails(){
	 System.out.println("OTT Platform Details are");
	 System.out.println("OTT Id :" + ottId);
	 System.out.println("Name :" + name);
	 System.out.println("Language :" + language);
	 System.out.println("Region :" + region);
	 
	 subscription.getSubscriptionDetails();
 }
}
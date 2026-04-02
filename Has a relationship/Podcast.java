class Podcast{

 int podcastId;
 String title;
 String hostName;
 String platform;
 Guest guest;
 
 public void getPodcastDetails(){
	 System.out.println("Podcast Details are");
	 System.out.println("Podcast Id :" + podcastId);
	 System.out.println("Title :" + title);
	 System.out.println("Host Name :" + hostName);
	 System.out.println("Platform :" + platform);
	 
	 guest.getGuestDetails();
 }
}
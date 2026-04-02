class PodcastExecutor{

 public static void main(String[] args){

  Podcast p1 = new Podcast();
  p1.podcastId = 1;
  p1.title = "Tech Talks";
  p1.hostName = "Ravi";
  p1.platform = "Spotify";

  Guest g1 = new Guest();
  p1.guest = g1;
  g1.guestId = 101;
  g1.name = "Anil";
  g1.profession = "Engineer";
  g1.age = 30;
  g1.isFamous = true;

  p1.getPodcastDetails();
  
  Podcast p2 = new Podcast();
  p2.podcastId = 2;
  p2.title = "Startup Stories";
  p2.hostName = "Neha";
  p2.platform = "YouTube";

  Guest g2 = new Guest();
  p2.guest = g2;
  g2.guestId = 102;
  g2.name = "Kiran";
  g2.profession = "Entrepreneur";
  g2.age = 35;
  g2.isFamous = true;

  p2.getPodcastDetails();
  
  Podcast p3 = new Podcast();
  p3.podcastId = 3;
  p3.title = "Health Tips";
  p3.hostName = "Suma";
  p3.platform = "Gaana";

  Guest g3 = new Guest();
  p3.guest = g3;
  g3.guestId = 103;
  g3.name = "Dr.Raj";
  g3.profession = "Doctor";
  g3.age = 45;
  g3.isFamous = true;

  p3.getPodcastDetails();
 
  Podcast p4 = new Podcast();
  p4.podcastId = 4;
  p4.title = "Fitness Freak";
  p4.hostName = "Arjun";
  p4.platform = "Spotify";

  Guest g4 = new Guest();
  p4.guest = g4;
  g4.guestId = 104;
  g4.name = "Rohit";
  g4.profession = "Trainer";
  g4.age = 28;
  g4.isFamous = false;

  p4.getPodcastDetails();
 
  Podcast p5 = new Podcast();
  p5.podcastId = 5;
  p5.title = "Movie Mania";
  p5.hostName = "Priya";
  p5.platform = "YouTube";

  Guest g5 = new Guest();
  p5.guest = g5;
  g5.guestId = 105;
  g5.name = "Suresh";
  g5.profession = "Actor";
  g5.age = 40;
  g5.isFamous = true;

  p5.getPodcastDetails();
  
  Podcast p6 = new Podcast();
  p6.podcastId = 6;
  p6.title = "Music Beats";
  p6.hostName = "Kavya";
  p6.platform = "Spotify";

  Guest g6 = new Guest();
  p6.guest = g6;
  g6.guestId = 106;
  g6.name = "Rahul";
  g6.profession = "Singer";
  g6.age = 27;
  g6.isFamous = true;

  p6.getPodcastDetails();
 
  Podcast p7 = new Podcast();
  p7.podcastId = 7;
  p7.title = "Coding Hub";
  p7.hostName = "Manoj";
  p7.platform = "YouTube";

  Guest g7 = new Guest();
  p7.guest = g7;
  g7.guestId = 107;
  g7.name = "Deepak";
  g7.profession = "Developer";
  g7.age = 29;
  g7.isFamous = false;

  p7.getPodcastDetails();
  
  Podcast p8 = new Podcast();
  p8.podcastId = 8;
  p8.title = "Finance Talk";
  p8.hostName = "Ritu";
  p8.platform = "Spotify";

  Guest g8 = new Guest();
  p8.guest = g8;
  g8.guestId = 108;
  g8.name = "Amit";
  g8.profession = "CA";
  g8.age = 38;
  g8.isFamous = true;

  p8.getPodcastDetails();
  
  Podcast p9 = new Podcast();
  p9.podcastId = 9;
  p9.title = "Travel Diaries";
  p9.hostName = "Sneha";
  p9.platform = "YouTube";

  Guest g9 = new Guest();
  p9.guest = g9;
  g9.guestId = 109;
  g9.name = "Vikas";
  g9.profession = "Blogger";
  g9.age = 32;
  g9.isFamous = true;

  p9.getPodcastDetails();
  
  Podcast p10 = new Podcast();
  p10.podcastId = 10;
  p10.title = "Food Lovers";
  p10.hostName = "Anu";
  p10.platform = "Spotify";

  Guest g10 = new Guest();
  p10.guest = g10;
  g10.guestId = 110;
  g10.name = "Chef Kumar";
  g10.profession = "Chef";
  g10.age = 45;
  g10.isFamous = true;

  p10.getPodcastDetails();

  Podcast p11=new Podcast();
  Guest g11=new Guest();
  p11.podcastId=11;
  p11.title="AI Talks";
  p11.hostName="Nikhil";
  p11.platform="Spotify";
 
  p11.guest=g11;
  g11.guestId=111;
  g11.name="Arav";
  g11.profession="Scientist";
  g11.age=36;
  g11.isFamous=true;
  
  p11.getPodcastDetails();

  Podcast p12=new Podcast();
  Guest g12=new Guest();
  p12.podcastId=12;
  p12.title="Law & Order";
  p12.hostName="Meena";
  p12.platform="YouTube";
  
  p12.guest=g12;
  g12.guestId=112;
  g12.name="Adv.Ramesh";
  g12.profession="Lawyer";
  g12.age=50;
  g12.isFamous=true;
  
  p12.getPodcastDetails();

  Podcast p13=new Podcast();
  Guest g13=new Guest();
  p13.podcastId=13;
  p13.title="Startup India";
  p13.hostName="Rohini";
  p13.platform="Spotify";
  
  p13.guest=g13;
  g13.guestId=113;
  g13.name="Karthik";
  g13.profession="Founder";
  g13.age=34;
  g13.isFamous=true;
  
  p13.getPodcastDetails();

  Podcast p14=new Podcast();
  Guest g14=new Guest();
  p14.podcastId=14;
  p14.title="Gaming Zone";
  p14.hostName="Varun";
  p14.platform="YouTube";
  
  p14.guest=g14;
  g14.guestId=114;
  g14.name="GamerX";
  g14.profession="Gamer";
  g14.age=22;
  g14.isFamous=false;
  
  p14.getPodcastDetails();

  Podcast p15=new Podcast();
  Guest g15=new Guest();
  p15.podcastId=15;
  p15.title="Education Hub";
  p15.hostName="Latha";
  p15.platform="Spotify";
  
  p15.guest=g15;
  g15.guestId=115;
  g15.name="Prof.Sharma";
  g15.profession="Teacher";
  g15.age=55;
  g15.isFamous=true;
  
  p15.getPodcastDetails();

  Podcast p16=new Podcast();
  Guest g16=new Guest();
  p16.podcastId=16;
  p16.title="Motivation Talk";
  p16.hostName="Ajay";
  p16.platform="YouTube";
  
  p16.guest=g16;
  g16.guestId=116;
  g16.name="Sandeep";
  g16.profession="Speaker";
  g16.age=40;
  g16.isFamous=true;
  
  p16.getPodcastDetails();

  Podcast p17=new Podcast();
  Guest g17=new Guest();
  p17.podcastId=17;
  p17.title="Business Mind";
  p17.hostName="Ravi";
  p17.platform="Spotify";
  
  p17.guest=g17;
  g17.guestId=117;
  g17.name="Mahesh";
  g17.profession="Businessman";
  g17.age=48;
  g17.isFamous=true;
  
  p17.getPodcastDetails();

  Podcast p18=new Podcast();
  Guest g18=new Guest();
  p18.podcastId=18;
  p18.title="Art World";
  p18.hostName="Divya";
  p18.platform="YouTube";
  
  p18.guest=g18;
  g18.guestId=118;
  g18.name="Painter Ravi";
  g18.profession="Artist";
  g18.age=37;
  g18.isFamous=false;
  
  p18.getPodcastDetails();

  Podcast p19=new Podcast();
  Guest g19=new Guest();
  p19.podcastId=19;
  p19.title="Science Lab";
  p19.hostName="Kiran";
  p19.platform="Spotify";
  
  p19.guest=g19;
  g19.guestId=119;
  g19.name="Dr.Anita";
  g19.profession="Researcher";
  g19.age=42;
  g19.isFamous=true;
  
  p19.getPodcastDetails();

  Podcast p20=new Podcast();
  Guest g20=new Guest();
  p20.podcastId=20;
  p20.title="News Talk";
  p20.hostName="Ramesh";
  p20.platform="YouTube";
  
  p20.guest=g20;
  g20.guestId=120;
  g20.name="Reporter Vijay";
  g20.profession="Journalist";
  g20.age=39;
  g20.isFamous=true;
  
  p20.getPodcastDetails();

 }
}
class PlaystoreExecutor{

 public static void main(String[] args){

  
  Playstore play1 = new Playstore();
  play1.playstoreId = 1;

  Application a1 = new Application();
  play1.application = a1;

  a1.applicationId = 101;
  a1.version = 20.0;
  a1.updatedOn = "Jan 2024";
  a1.realeasedOn = "Dec 2023";
  a1.requiredOs = "Android 10";
  a1.rating = 4.5;
  a1.offeredBy = "Google";

  play1.getDetails();
  
  Playstore p2 = new Playstore();
  p2.playstoreId = 2;

  Application a2 = new Application();
  p2.application = a2;

  a2.applicationId = 102;
  a2.version = 423.0;
  a2.updatedOn = "Feb 2026";
  a2.realeasedOn = "Apr 2012";
  a2.requiredOs = "Android 8";
  a2.rating = 4.2;
  a2.offeredBy = "Instagram";

  p2.getDetails();
 }
}
  
  
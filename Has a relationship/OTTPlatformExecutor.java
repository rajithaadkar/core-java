class OTTPlatformExecutor{

 public static void main(String[] args){

  OTTPlatform o1 = new OTTPlatform();
  o1.ottId = 1;
  o1.name = "Netflix";
  o1.language = "English";
  o1.region = "Global";

  Subscription s1 = new Subscription();
  o1.subscription = s1;
  s1.subscriptionId = 101;
  s1.type = "Premium";
  s1.price = 799;
  s1.validity = 30;
  s1.isActive = true;

  o1.getOTTDetails();
 
  OTTPlatform o2 = new OTTPlatform();
  o2.ottId = 2;
  o2.name = "Amazon Prime";
  o2.language = "Multi";
  o2.region = "India";

  Subscription s2 = new Subscription();
  o2.subscription = s2;
  s2.subscriptionId = 102;
  s2.type = "Standard";
  s2.price = 499;
  s2.validity = 30;
  s2.isActive = true;

  o2.getOTTDetails();
  
  OTTPlatform o3 = new OTTPlatform();
  o3.ottId = 3;
  o3.name = "Hotstar";
  o3.language = "Hindi";
  o3.region = "India";

  Subscription s3 = new Subscription();
  o3.subscription = s3;
  s3.subscriptionId = 103;
  s3.type = "VIP";
  s3.price = 299;
  s3.validity = 30;
  s3.isActive = true;

  o3.getOTTDetails();
 
  OTTPlatform o4 = new OTTPlatform();
  o4.ottId = 4;
  o4.name = "Zee5";
  o4.language = "Telugu";
  o4.region = "India";

  Subscription s4 = new Subscription();
  o4.subscription = s4;
  s4.subscriptionId = 104;
  s4.type = "Basic";
  s4.price = 199;
  s4.validity = 30;
  s4.isActive = true;

  o4.getOTTDetails();
  
  OTTPlatform o5 = new OTTPlatform();
  o5.ottId = 5;
  o5.name = "SonyLiv";
  o5.language = "Hindi";
  o5.region = "India";

  Subscription s5 = new Subscription();
  o5.subscription = s5;
  s5.subscriptionId = 105;
  s5.type = "Premium";
  s5.price = 599;
  s5.validity = 30;
  s5.isActive = true;

  o5.getOTTDetails();
 
  OTTPlatform o6 = new OTTPlatform();
  o6.ottId = 6;
  o6.name = "Netflix";
  o6.language = "English";
  o6.region = "Global";

  Subscription s6 = new Subscription();
  o6.subscription = s6;
  s6.subscriptionId = 106;
  s6.type = "Standard";
  s6.price = 649;
  s6.validity = 30;
  s6.isActive = false;

  o6.getOTTDetails();
  
  OTTPlatform o7 = new OTTPlatform();
  o7.ottId = 7;
  o7.name = "Amazon Prime";
  o7.language = "Multi";
  o7.region = "India";
  Subscription s7 = new Subscription();
  o7.subscription = s7;

  s7.subscriptionId = 107;
  s7.type = "Premium";
  s7.price = 799;
  s7.validity = 30;
  s7.isActive = true;

  o7.getOTTDetails();
 
  OTTPlatform o8 = new OTTPlatform();
  o8.ottId = 8;
  o8.name = "Hotstar";
  o8.language = "Tamil";
  o8.region = "India";

  Subscription s8 = new Subscription();
  o8.subscription = s8;
  s8.subscriptionId = 108;
  s8.type = "VIP";
  s8.price = 299;
  s8.validity = 30;
  s8.isActive = true;

  o8.getOTTDetails();
  
  OTTPlatform o9 = new OTTPlatform();
  o9.ottId = 9;
  o9.name = "Zee5";
  o9.language = "Kannada";
  o9.region = "India";

  Subscription s9 = new Subscription();
  o9.subscription = s9;
  s9.subscriptionId = 109;
  s9.type = "Basic";
  s9.price = 199;
  s9.validity = 30;
  s9.isActive = false;

  o9.getOTTDetails();
 
  OTTPlatform o10 = new OTTPlatform();
  o10.ottId = 10;
  o10.name = "SonyLiv";
  o10.language = "Hindi";
  o10.region = "India";

  Subscription s10 = new Subscription();
  o10.subscription = s10;
  s10.subscriptionId = 110;
  s10.type = "Premium";
  s10.price = 599;
  s10.validity = 30;
  s10.isActive = true;

  o10.getOTTDetails();
  
  OTTPlatform o11=new OTTPlatform();
  Subscription s11=new Subscription();
  o11.ottId=11;
  o11.name="Netflix";
  o11.language="English";
  o11.region="Global";
  
  o11.subscription=s11;
  s11.subscriptionId=111;
  s11.type="Basic";
  s11.price=199;
  s11.validity=30;
  s11.isActive=true;
  
  o11.getOTTDetails();

  OTTPlatform o12=new OTTPlatform();
  Subscription s12=new Subscription();
  o12.ottId=12;
  o12.name="Amazon Prime";
  o12.language="Multi";
  o12.region="India";
  
  o12.subscription=s12;
  s12.subscriptionId=112;
  s12.type="Standard";
  s12.price=499;
  s12.validity=30;
  s12.isActive=true;
  
  o12.getOTTDetails();

  OTTPlatform o13=new OTTPlatform();
  Subscription s13=new Subscription();
  o13.ottId=13;
  o13.name="Hotstar";
  o13.language="Hindi";
  o13.region="India";
  
  o13.subscription=s13;
  s13.subscriptionId=113;
  s13.type="VIP";
  s13.price=299;
  s13.validity=30;
  s13.isActive=true;
  
  o13.getOTTDetails();

  OTTPlatform o14=new OTTPlatform();
  Subscription s14=new Subscription();
  o14.ottId=14;
  o14.name="Zee5";
  o14.language="Telugu";
  o14.region="India";
  
  o14.subscription=s14;
  s14.subscriptionId=114;
  s14.type="Basic";
  s14.price=199;
  s14.validity=30;
  s14.isActive=true;
  
  o14.getOTTDetails();

  OTTPlatform o15=new OTTPlatform();
  Subscription s15=new Subscription();
  o15.ottId=15;
  o15.name="SonyLiv";
  o15.language="Hindi";
  o15.region="India";
  
  o15.subscription=s15;
  s15.subscriptionId=115;
  s15.type="Premium";
  s15.price=599;
  s15.validity=30;
  s15.isActive=true;
  
  o15.getOTTDetails();

  OTTPlatform o16=new OTTPlatform();
  Subscription s16=new Subscription();
  o16.ottId=16; 
  o16.name="Netflix";
  o16.language="English";
  o16.region="Global";
 
  o16.subscription=s16;
  s16.subscriptionId=116;
  s16.type="Standard";
  s16.price=649;
  s16.validity=30;
  s16.isActive=false;
  
  o16.getOTTDetails();

  OTTPlatform o17=new OTTPlatform();
  Subscription s17=new Subscription();
  o17.ottId=17;
  o17.name="Amazon Prime";
  o17.language="Multi";
  o17.region="India";
  
  o17.subscription=s17;
  s17.subscriptionId=117;
  s17.type="Premium";
  s17.price=799;
  s17.validity=30;
  s17.isActive=true;
  
  o17.getOTTDetails();

  OTTPlatform o18=new OTTPlatform();
  Subscription s18=new Subscription();
  o18.ottId=18;
  o18.name="Hotstar";
  o18.language="Tamil";
  o18.region="India";
  
  o18.subscription=s18;
  s18.subscriptionId=118;
  s18.type="VIP";
  s18.price=299;
  s18.validity=30;
  s18.isActive=true;
  
  o18.getOTTDetails();

  OTTPlatform o19=new OTTPlatform();
  Subscription s19=new Subscription();
  o19.ottId=19;
  o19.name="Zee5";
  o19.language="Kannada";
  o19.region="India";
  
  o19.subscription=s19;
  s19.subscriptionId=119;
  s19.type="Basic";
  s19.price=199;
  s19.validity=30;
  s19.isActive=false;
  
  o19.getOTTDetails();

  OTTPlatform o20=new OTTPlatform();
  Subscription s20=new Subscription();
  o20.ottId=20;
  o20.name="SonyLiv";
  o20.language="Hindi";
  o20.region="India";
  
  o20.subscription=s20;
  s20.subscriptionId=120;
  s20.type="Premium";
  s20.price=599;
  s20.validity=30;
  s20.isActive=true;
  
  o20.getOTTDetails();

 }
}
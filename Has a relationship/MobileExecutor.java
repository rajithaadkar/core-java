class MobileExecutor{

 public static void main(String[] args){

  Mobile m1 = new Mobile();
  m1.mobileId = 1;
  m1.brand = "Samsung";
  m1.price = 20000;
  m1.color = "Black";

  Sim s1 = new Sim();
  m1.sim = s1;
  s1.simId = 101;
  s1.provider = "Jio";
  s1.number = "900001";
  s1.type = "4G";
  s1.active = true;

  m1.getMobileDetails();

  Mobile m2 = new Mobile();
  m2.mobileId = 2;
  m2.brand = "Vivo";
  m2.price = 18000;
  m2.color = "Blue";

  Sim s2 = new Sim();
  m2.sim = s2;
  s2.simId = 102;
  s2.provider = "Airtel";
  s2.number = "900002";
  s2.type = "5G";
  s2.active = true;

  m2.getMobileDetails();

  Mobile m3 = new Mobile();
  m3.mobileId = 3;
  m3.brand = "Oppo";
  m3.price = 15000;
  m3.color = "White";

  Sim s3 = new Sim();
  m3.sim = s3;
  s3.simId = 103;
  s3.provider = "VI";
  s3.number = "900003";
  s3.type = "4G";
  s3.active = false;

  m3.getMobileDetails();
  
  Mobile m4 = new Mobile();
  m4.mobileId = 4;
  m4.brand = "Realme";
  m4.price = 17000;
  m4.color = "Gray";

  Sim s4 = new Sim();
  m4.sim = s4;
  s4.simId = 104;
  s4.provider = "Jio";
  s4.number = "900004";
  s4.type = "5G";
  s4.active = true;

  m4.getMobileDetails();
  
  Mobile m5 = new Mobile();
  m5.mobileId = 5;
  m5.brand = "Redmi";
  m5.price = 14000;
  m5.color = "Black";

  Sim s5 = new Sim();
  m5.sim = s5;
  s5.simId = 105;
  s5.provider = "Airtel";
  s5.number = "900005";
  s5.type = "4G";
  s5.active = true;

  m5.getMobileDetails();

  Mobile m6 = new Mobile();
  m6.mobileId = 6;
  m6.brand = "OnePlus";
  m6.price = 30000;
  m6.color = "Red";

  Sim s6 = new Sim();
  m6.sim = s6;
  s6.simId = 106;
  s6.provider = "VI";
  s6.number = "900006";
  s6.type = "5G";
  s6.active = false;

  m6.getMobileDetails();
  
  Mobile m7 = new Mobile();
  m7.mobileId = 7;
  m7.brand = "Apple";
  m7.price = 80000;
  m7.color = "Silver";

  Sim s7 = new Sim();
  m7.sim = s7;
  s7.simId = 107;
  s7.provider = "Jio";
  s7.number = "900007";
  s7.type = "5G";
  s7.active = true;

  m7.getMobileDetails();
  
  Mobile m8 = new Mobile();
  m8.mobileId = 8;
  m8.brand = "Nokia";
  m8.price = 12000;
  m8.color = "Blue";

  Sim s8 = new Sim();
  m8.sim = s8;
  s8.simId = 108;
  s8.provider = "Airtel";
  s8.number = "900008";
  s8.type = "4G";
  s8.active = true;

  m8.getMobileDetails();
  
  Mobile m9 = new Mobile();
  m9.mobileId = 9;
  m9.brand = "Motorola";
  m9.price = 16000;
  m9.color = "Black";

  Sim s9 = new Sim();
  m9.sim = s9;
  s9.simId = 109;
  s9.provider = "VI";
  s9.number = "900009";
  s9.type = "4G";
  s9.active = false;

  m9.getMobileDetails();
 
  Mobile m10 = new Mobile();
  m10.mobileId = 10;
  m10.brand = "Infinix";
  m10.price = 13000;
  m10.color = "Green";

  Sim s10 = new Sim();
  m10.sim = s10;
  s10.simId = 110;
  s10.provider = "Jio";
  s10.number = "900010";
  s10.type = "5G";
  s10.active = true;

  m10.getMobileDetails();
  

  Mobile m11=new Mobile();
  Sim s11=new Sim();
  m11.mobileId=11;
  m11.brand="Samsung"; 
  m11.price=21000;
  m11.color="Black";
  
  m11.sim=s11;
  s11.simId=111; 
  s11.provider="Airtel";
  s11.number="900011"; 
  s11.type="4G"; s11.active=true;
  
  m11.getMobileDetails();

  Mobile m12=new Mobile();
  Sim s12=new Sim();
  m12.mobileId=12;
  m12.brand="Vivo";
  m12.price=19000;
  m12.color="Blue";
  
  m12.sim=s12;
  s12.simId=112;
  s12.provider="VI";
  s12.number="900012";
  s12.type="5G";
  s12.active=false;
  
  m12.getMobileDetails();

  Mobile m13=new Mobile();
  Sim s13=new Sim();
  m13.mobileId=13;
  m13.brand="Oppo";
  m13.price=15500;
  m13.color="White";
  
  m13.sim=s13;
  s13.simId=113;
  s13.provider="Jio";
  s13.number="900013";
  s13.type="4G";
  s13.active=true;
  
  m13.getMobileDetails();

  Mobile m14=new Mobile();
  Sim s14=new Sim();
  m14.mobileId=14;
  m14.brand="Realme";
  m14.price=17500;
  m14.color="Gray";
  
  m14.sim=s14;
  s14.simId=114;
  s14.provider="Airtel";
  s14.number="900014";
  s14.type="5G";
  s14.active=true;
  
  m14.getMobileDetails();

  Mobile m15=new Mobile(); Sim s15=new Sim();
  m15.mobileId=15;
  m15.brand="Redmi";
  m15.price=14500;
  m15.color="Black";
  
  m15.sim=s15;
  s15.simId=115;
  s15.provider="VI";
  s15.number="900015";
  s15.type="4G";
  s15.active=false;
  
  m15.getMobileDetails();

  Mobile m16=new Mobile();
  Sim s16=new Sim();
  m16.mobileId=16;
  m16.brand="OnePlus";
  m16.price=31000;
  m16.color="Red";
  
  m16.sim=s16;
  s16.simId=116;
  s16.provider="Jio";
  s16.number="900016";
  s16.type="5G";
  s16.active=true;
  
  m16.getMobileDetails();

  Mobile m17=new Mobile();
  Sim s17=new Sim();
  m17.mobileId=17;
  m17.brand="Apple";
  m17.price=82000;
  m17.color="Silver";
  
  m17.sim=s17;
  s17.simId=117;
  s17.provider="Airtel";
  s17.number="900017";
  s17.type="5G";
  s17.active=true;
  
  m17.getMobileDetails();

  Mobile m18=new Mobile();
  Sim s18=new Sim();
  m18.mobileId=18;
  m18.brand="Nokia";
  m18.price=12500;
  m18.color="Blue";
  
  m18.sim=s18;
  s18.simId=118;
  s18.provider="VI";
  s18.number="900018";
  s18.type="4G";
  s18.active=false;
  
  m18.getMobileDetails();

  Mobile m19=new Mobile();
  Sim s19=new Sim();
  m19.mobileId=19;
  m19.brand="Motorola";
  m19.price=16500;
  m19.color="Black";
  
  m19.sim=s19;
  s19.simId=119;
  s19.provider="Jio";
  s19.number="900019";
  s19.type="5G";
  s19.active=true;
  
  m19.getMobileDetails();

  Mobile m20=new Mobile();
  Sim s20=new Sim();
  m20.mobileId=20;
  m20.brand="Infinix";
  m20.price=13500;
  m20.color="Green";
  
  m20.sim=s20;
  s20.simId=120;
  s20.provider="Airtel";
  s20.number="900020";
  s20.type="4G";
  s20.active=true;
  
  m20.getMobileDetails();

 }
}
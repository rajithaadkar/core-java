class DoorExecutor{

 public static void main(String[] args){

  Door d1 = new Door();
  d1.doorId = 1;
  d1.material = "Wood";
  d1.color = "Brown";
  d1.height = 7.0;

  Lock l1 = new Lock();
  d1.lock = l1;

  l1.lockId = 101;
  l1.type = "Key Lock";
  l1.material = "Steel";
  l1.isSecure = true;
  l1.keyCount = 2;

  d1.getDoorDetails();
  
  Door d2 = new Door();
  d2.doorId = 2;
  d2.material = "Steel";
  d2.color = "Black";
  d2.height = 6.5;

  Lock l2 = new Lock();
  d2.lock = l2;

  l2.lockId = 102;
  l2.type = "Digital";
  l2.material = "Alloy";
  l2.isSecure = true;
  l2.keyCount = 0;

  d2.getDoorDetails();
 
  Door d3 = new Door();
  d3.doorId = 3;
  d3.material = "Glass";
  d3.color = "Transparent";
  d3.height = 7.5;

  Lock l3 = new Lock();
  d3.lock = l3;

  l3.lockId = 103;
  l3.type = "Fingerprint";
  l3.material = "Plastic";
  l3.isSecure = true;
  l3.keyCount = 0;

  d3.getDoorDetails();
 
  Door d4 = new Door();
  d4.doorId = 4;
  d4.material = "PVC";
  d4.color = "White";
  d4.height = 6.0;

  Lock l4 = new Lock();
  d4.lock = l4;

  l4.lockId = 104;
  l4.type = "Key Lock";
  l4.material = "Iron";
  l4.isSecure = false;
  l4.keyCount = 1;

  d4.getDoorDetails();
  
  Door d5 = new Door();
  d5.doorId = 5;
  d5.material = "Aluminum";
  d5.color = "Silver";
  d5.height = 6.8;

  Lock l5 = new Lock();
  d5.lock = l5;

  l5.lockId = 105;
  l5.type = "Password";
  l5.material = "Steel";
  l5.isSecure = true;
  l5.keyCount = 0;

  d5.getDoorDetails();
  
  Door d6 = new Door();
  d6.doorId = 6;
  d6.material = "Wood";
  d6.color = "Dark Brown";
  d6.height = 7.2;

  Lock l6 = new Lock();
  d6.lock = l6;

  l6.lockId = 106;
  l6.type = "Key Lock";
  l6.material = "Steel";
  l6.isSecure = true;
  l6.keyCount = 3;

  d6.getDoorDetails();
 
  Door d7 = new Door();
  d7.doorId = 7;
  d7.material = "Steel";
  d7.color = "Grey";
  d7.height = 6.7;

  Lock l7 = new Lock();
  d7.lock = l7;

  l7.lockId = 107;
  l7.type = "Smart Lock";
  l7.material = "Alloy";
  l7.isSecure = true;
  l7.keyCount = 0;

  d7.getDoorDetails();
  
  Door d8 = new Door();
  d8.doorId = 8;
  d8.material = "Glass";
  d8.color = "Blue";
  d8.height = 7.1;

  Lock l8 = new Lock();
  d8.lock = l8;

  l8.lockId = 108;
  l8.type = "Magnetic";
  l8.material = "Metal";
  l8.isSecure = false;
  l8.keyCount = 0;

  d8.getDoorDetails();
  
  Door d9 = new Door();
  d9.doorId = 9;
  d9.material = "PVC";
  d9.color = "Cream";
  d9.height = 6.3;

  Lock l9 = new Lock();
  d9.lock = l9;

  l9.lockId = 109;
  l9.type = "Key Lock";
  l9.material = "Iron";
  l9.isSecure = true;
  l9.keyCount = 2;

  d9.getDoorDetails();
  
  Door d10 = new Door();
  d10.doorId = 10;
  d10.material = "Wood";
  d10.color = "Teak";
  d10.height = 7.4;

  Lock l10 = new Lock();
  d10.lock = l10;

  l10.lockId = 110;
  l10.type = "Fingerprint";
  l10.material = "Steel";
  l10.isSecure = true;
  l10.keyCount = 0;

  d10.getDoorDetails();
  

  Door d11=new Door();
  Lock l11=new Lock();
  d11.doorId=11; 
  d11.material="Steel";
  d11.color="Black";
  d11.height=6.9;
  
  d11.lock=l11;
  l11.lockId=111;
  l11.type="Digital";
  l11.material="Alloy";
  l11.isSecure=true;
  l11.keyCount=0;
  
  d11.getDoorDetails();

  Door d12=new Door();
  Lock l12=new Lock();
  d12.doorId=12;
  d12.material="Wood";
  d12.color="Brown";
  d12.height=7.0;
  
  d12.lock=l12;
  l12.lockId=112;
  l12.type="Key Lock";
  l12.material="Steel";
  l12.isSecure=true;
  l12.keyCount=2;
  
  d12.getDoorDetails();

  Door d13=new Door();
  Lock l13=new Lock();
  d13.doorId=13;
  d13.material="Glass";
  d13.color="Transparent";
  d13.height=7.2;
  
  d13.lock=l13;
  l13.lockId=113;
  l13.type="Magnetic";
  l13.material="Metal";
  l13.isSecure=false;
  l13.keyCount=0;
  
  d13.getDoorDetails();

  Door d14=new Door();
  Lock l14=new Lock();
  d14.doorId=14;
  d14.material="PVC";
  d14.color="White";
  d14.height=6.1;
  
  d14.lock=l14;
  l14.lockId=114;
  l14.type="Key Lock";
  l14.material="Iron";
  l14.isSecure=false;
  l14.keyCount=1;
  
  d14.getDoorDetails();

  Door d15=new Door();
  Lock l15=new Lock();
  d15.doorId=15;
  d15.material="Aluminum";
  d15.color="Silver";
  d15.height=6.8;
  
  d15.lock=l15;
  l15.lockId=115;
  l15.type="Password";
  l15.material="Steel";
  l15.isSecure=true;
  l15.keyCount=0;
  
  d15.getDoorDetails();

  Door d16=new Door();
  Lock l16=new Lock();
  d16.doorId=16;
  d16.material="Wood";
  d16.color="Dark Brown";
  d16.height=7.3;
  
  d16.lock=l16;
  l16.lockId=116;
  l16.type="Fingerprint";
  l16.material="Steel";
  l16.isSecure=true;
  l16.keyCount=0;
  
  d16.getDoorDetails();

  Door d17=new Door();
  Lock l17=new Lock();
  d17.doorId=17;
  d17.material="Steel";
  d17.color="Grey";
  d17.height=6.6;
  
  d17.lock=l17;
  l17.lockId=117;
  l17.type="Smart Lock";
  l17.material="Alloy";
  l17.isSecure=true;
  l17.keyCount=0;
  
  d17.getDoorDetails();

  Door d18=new Door();
  Lock l18=new Lock();
  d18.doorId=18;
  d18.material="Glass";
  d18.color="Blue";
  d18.height=7.1;
  
  d18.lock=l18;
  l18.lockId=118;
  l18.type="Magnetic";
  l18.material="Metal";
  l18.isSecure=false;
  l18.keyCount=0;
  
  d18.getDoorDetails();

  Door d19=new Door();
  Lock l19=new Lock();
  d19.doorId=19;
  d19.material="PVC";
  d19.color="Cream";
  d19.height=6.4;
  
  d19.lock=l19;
  l19.lockId=119;
  l19.type="Key Lock";
  l19.material="Iron";
  l19.isSecure=true;
  l19.keyCount=2;
  
  d19.getDoorDetails();

  Door d20=new Door();
  Lock l20=new Lock();
  d20.doorId=20;
  d20.material="Wood";
  d20.color="Teak";
  d20.height=7.5;
  
  d20.lock=l20;
  l20.lockId=120;
  l20.type="Digital";
  l20.material="Alloy";
  l20.isSecure=true;
  l20.keyCount=0;
  
  d20.getDoorDetails();

 }
}
class FactoryExecutor{

 public static void main(String[] args){

  Factory f1 = new Factory();
  f1.factoryId = 1;
  f1.name = "Tata Steel";
  f1.location = "Jamshedpur";
  f1.workers = 500;

  Machine m1 = new Machine();
  f1.machine = m1;
  m1.machineId = 101;
  m1.name = "Lathe";
  m1.type = "Cutting";
  m1.power = 5.5;
  m1.isWorking = true;

  f1.getFactoryDetails();
  
  Factory f2 = new Factory();
  f2.factoryId = 2;
  f2.name = "Birla Cement";
  f2.location = "Rajasthan";
  f2.workers = 300;

  Machine m2 = new Machine();
  f2.machine = m2;
  m2.machineId = 102;
  m2.name = "Crusher";
  m2.type = "Grinding";
  m2.power = 7.0;
  m2.isWorking = true;

  f2.getFactoryDetails();
  
  Factory f3 = new Factory();
  f3.factoryId = 3;
  f3.name = "Mahindra Auto";
  f3.location = "Pune";
  f3.workers = 700;

  Machine m3 = new Machine();
  f3.machine = m3;
  m3.machineId = 103;
  m3.name = "Drill";
  m3.type = "Drilling";
  m3.power = 4.5;
  m3.isWorking = true;

  f3.getFactoryDetails();
  
  Factory f4 = new Factory();
  f4.factoryId = 4;
  f4.name = "Reliance Textile";
  f4.location = "Surat";
  f4.workers = 450;

  Machine m4 = new Machine();
  f4.machine = m4;
  m4.machineId = 104;
  m4.name = "Loom";
  m4.type = "Weaving";
  m4.power = 6.0;
  m4.isWorking = false;

  f4.getFactoryDetails();
 
  Factory f5 = new Factory();
  f5.factoryId = 5;
  f5.name = "ITC Foods";
  f5.location = "Bangalore";
  f5.workers = 350;

  Machine m5 = new Machine();
  f5.machine = m5;
  m5.machineId = 105;
  m5.name = "Mixer";
  m5.type = "Processing";
  m5.power = 3.5;
  m5.isWorking = true;

  f5.getFactoryDetails();
  
  Factory f6 = new Factory();
  f6.factoryId = 6;
  f6.name = "Ashok Leyland";
  f6.location = "Chennai";
  f6.workers = 600;

  Machine m6 = new Machine();
  f6.machine = m6;
  m6.machineId = 106;
  m6.name = "Welder";
  m6.type = "Joining";
  m6.power = 5.0;
  m6.isWorking = true;

  f6.getFactoryDetails();
 
  Factory f7 = new Factory();
  f7.factoryId = 7;
  f7.name = "BHEL";
  f7.location = "Hyderabad";
  f7.workers = 800;

  Machine m7 = new Machine();
  f7.machine = m7;
  m7.machineId = 107;
  m7.name = "Generator";
  m7.type = "Power";
  m7.power = 10.0;
  m7.isWorking = true;

  f7.getFactoryDetails();
  
  Factory f8 = new Factory();
  f8.factoryId = 8;
  f8.name = "Godrej";
  f8.location = "Mumbai";
  f8.workers = 400;

  Machine m8 = new Machine();
  f8.machine = m8;
  m8.machineId = 108;
  m8.name = "Press";
  m8.type = "Molding";
  m8.power = 6.5;
  m8.isWorking = false;

  f8.getFactoryDetails();
  
  Factory f9 = new Factory();
  f9.factoryId = 9;
  f9.name = "Hindustan Unilever";
  f9.location = "Delhi";
  f9.workers = 550;

  Machine m9 = new Machine();
  f9.machine = m9;
  m9.machineId = 109;
  m9.name = "Filler";
  m9.type = "Packaging";
  m9.power = 4.0;
  m9.isWorking = true;

  f9.getFactoryDetails();
  
  Factory f10 = new Factory();
  f10.factoryId = 10;
  f10.name = "PepsiCo";
  f10.location = "Punjab";
  f10.workers = 300;

  Machine m10 = new Machine();
  f10.machine = m10;
  m10.machineId = 110;
  m10.name = "Bottle Line";
  m10.type = "Filling";
  m10.power = 5.5;
  m10.isWorking = true;

  f10.getFactoryDetails();
  
  Factory f11=new Factory();
  Machine m11=new Machine();
  f11.factoryId=11;
  f11.name="Amul";
  f11.location="Gujarat";
  f11.workers=400;
  
  f11.machine=m11;
  m11.machineId=111;
  m11.name="Cooler";
  m11.type="Storage";
  m11.power=3.0;
  m11.isWorking=true;
  
  f11.getFactoryDetails();

  Factory f12=new Factory();
  Machine m12=new Machine();
  f12.factoryId=12;
  f12.name="Nestle";
  f12.location="Goa";
  f12.workers=350;
  
  f12.machine=m12;
  m12.machineId=112;
  m12.name="Dryer";
  m12.type="Processing";
  m12.power=4.5;
  m12.isWorking=true;
  
  f12.getFactoryDetails();

  Factory f13=new Factory();
  Machine m13=new Machine();
  f13.factoryId=13;
  f13.name="Maruti";
  f13.location="Haryana";
  f13.workers=900;
  
  f13.machine=m13;
  m13.machineId=113;
  m13.name="RobotArm";
  m13.type="Automation";
  m13.power=8.0;
  m13.isWorking=true;
  
  f13.getFactoryDetails();

  Factory f14=new Factory();
  Machine m14=new Machine();
  f14.factoryId=14;
  f14.name="LG";
  f14.location="Noida";
  f14.workers=600;
  
  f14.machine=m14;
  m14.machineId=114;
  m14.name="Assembler";
  m14.type="Assembly";
  m14.power=5.0;
  m14.isWorking=true;
  
  f14.getFactoryDetails();

  Factory f15=new Factory();
  Machine m15=new Machine();
  f15.factoryId=15;
  f15.name="Samsung";
  f15.location="Noida";
  f15.workers=700;
  
  f15.machine=m15;
  m15.machineId=115;
  m15.name="ChipMaker";
  m15.type="Electronics";
  m15.power=9.0;
  m15.isWorking=true;
  
  f15.getFactoryDetails();

  Factory f16=new Factory();
  Machine m16=new Machine();
  f16.factoryId=16;
  f16.name="Voltas";
  f16.location="Mumbai";
  f16.workers=450;
  
  f16.machine=m16;
  m16.machineId=116;
  m16.name="Compressor";
  m16.type="Cooling";
  m16.power=6.0;
  m16.isWorking=false;
  
  f16.getFactoryDetails();

  Factory f17=new Factory();
  Machine m17=new Machine();
  f17.factoryId=17;
  f17.name="Bosch";
  f17.location="Bangalore";
  f17.workers=650;
  
  f17.machine=m17;
  m17.machineId=117;
  m17.name="SensorUnit";
  m17.type="Electronics";
  m17.power=3.5;
  m17.isWorking=true;
  
  f17.getFactoryDetails();

  Factory f18=new Factory();
  Machine m18=new Machine();
  f18.factoryId=18;
  f18.name="Philips";
  f18.location="Pune"; 
  f18.workers=500;
  
  f18.machine=m18;
  m18.machineId=118;
  m18.name="Tester";
  m18.type="Quality";
  m18.power=2.5;
  m18.isWorking=true;
  
  f18.getFactoryDetails();

  Factory f19=new Factory();
  Machine m19=new Machine();
  f19.factoryId=19;
  f19.name="Dabur";
  f19.location="UP";
  f19.workers=350;
  
  f19.machine=m19;
  m19.machineId=119;
  m19.name="Grinder";
  m19.type="Processing";
  m19.power=4.0;
  m19.isWorking=true;
  
  f19.getFactoryDetails();

  Factory f20=new Factory();
  Machine m20=new Machine();
  f20.factoryId=20;
  f20.name="Patanjali";
  f20.location="Haridwar";
  f20.workers=300;
  
  f20.machine=m20;
  m20.machineId=120;
  m20.name="Mixer";
  m20.type="Processing";
  m20.power=3.0;
  m20.isWorking=true;
  
  f20.getFactoryDetails();

 }
}
class GymExecutor{

 public static void main(String[] args){

  Gym g1 = new Gym();
  g1.gymId = 1;
  g1.name = "Gold Gym";
  g1.location = "BTM";
  g1.type = "Fitness";

  Trainer t1 = new Trainer();
  g1.trainer = t1;
  t1.trainerId = 101;
  t1.name = "Rahul";
  t1.specialization = "Weight Training";
  t1.experience = 5;
  t1.salary = 25000;

  g1.getGymDetails();
  
  Gym g2 = new Gym();
  g2.gymId = 2;
  g2.name = "Cult Fit";
  g2.location = "Indiranagar";
  g2.type = "Cardio";

  Trainer t2 = new Trainer();
  g2.trainer = t2;
  t2.trainerId = 102;
  t2.name = "Ankit";
  t2.specialization = "Cardio";
  t2.experience = 4;
  t2.salary = 22000;

  g2.getGymDetails();
  
  Gym g3 = new Gym();
  g3.gymId = 3;
  g3.name = "Fitness One";
  g3.location = "Whitefield";
  g3.type = "Yoga";

  Trainer t3 = new Trainer();
  g3.trainer = t3;
  t3.trainerId = 103;
  t3.name = "Sneha";
  t3.specialization = "Yoga";
  t3.experience = 6;
  t3.salary = 24000;

  g3.getGymDetails();
  
  Gym g4 = new Gym();
  g4.gymId = 4;
  g4.name = "Muscle Factory";
  g4.location = "Marathahalli";
  g4.type = "Bodybuilding";

  Trainer t4 = new Trainer();
  g4.trainer = t4;
  t4.trainerId = 104;
  t4.name = "Kiran";
  t4.specialization = "Bodybuilding";
  t4.experience = 7;
  t4.salary = 30000;

  g4.getGymDetails();
  
  Gym g5 = new Gym();
  g5.gymId = 5;
  g5.name = "Power Gym";
  g5.location = "Yelahanka";
  g5.type = "Fitness";

  Trainer t5 = new Trainer();
  g5.trainer = t5;
  t5.trainerId = 105;
  t5.name = "Ravi";
  t5.specialization = "Strength";
  t5.experience = 5;
  t5.salary = 26000;

  g5.getGymDetails();
  
  Gym g6 = new Gym();
  g6.gymId = 6;
  g6.name = "Fit Zone";
  g6.location = "Hebbal";
  g6.type = "Cardio";

  Trainer t6 = new Trainer();
  g6.trainer = t6;
  t6.trainerId = 106;
  t6.name = "Pooja";
  t6.specialization = "Cardio";
  t6.experience = 3;
  t6.salary = 20000;

  g6.getGymDetails();
  
  Gym g7 = new Gym();
  g7.gymId = 7;
  g7.name = "Iron Gym";
  g7.location = "KR Puram";
  g7.type = "Bodybuilding";

  Trainer t7 = new Trainer();
  g7.trainer = t7;
  t7.trainerId = 107;
  t7.name = "Arjun";
  t7.specialization = "Strength";
  t7.experience = 6;
  t7.salary = 28000;

  g7.getGymDetails();
 
  Gym g8 = new Gym();
  g8.gymId = 8;
  g8.name = "Flex Gym";
  g8.location = "Majestic";
  g8.type = "Fitness";

  Trainer t8 = new Trainer();
  g8.trainer = t8;
  t8.trainerId = 108;
  t8.name = "Divya";
  t8.specialization = "Yoga";
  t8.experience = 4;
  t8.salary = 23000;

  g8.getGymDetails();
 
  Gym g9 = new Gym();
  g9.gymId = 9;
  g9.name = "Ultimate Gym";
  g9.location = "Rajajinagar";
  g9.type = "Cardio";

  Trainer t9 = new Trainer();
  g9.trainer = t9;
  t9.trainerId = 109;
  t9.name = "Manoj";
  t9.specialization = "Cardio";
  t9.experience = 5;
  t9.salary = 25000;

  g9.getGymDetails();
  
  Gym g10 = new Gym();
  g10.gymId = 10;
  g10.name = "Pro Fitness";
  g10.location = "Jayanagar";
  g10.type = "Fitness";

  Trainer t10 = new Trainer();
  g10.trainer = t10;
  t10.trainerId = 110;
  t10.name = "Neha";
  t10.specialization = "Yoga";
  t10.experience = 6;
  t10.salary = 27000;

  g10.getGymDetails();
  
  Gym g11=new Gym();
  Trainer t11=new Trainer();
  g11.gymId=11;
  g11.name="Gold Gym";
  g11.location="BTM";
  g11.type="Fitness";
  
  g11.trainer=t11;
  t11.trainerId=111;
  t11.name="User11";
  t11.specialization="Cardio";
  t11.experience=5;
  t11.salary=25000;
  
  g11.getGymDetails();

  Gym g12=new Gym();
  Trainer t12=new Trainer();
  g12.gymId=12;
  g12.name="Cult Fit";
  g12.location="BTM";
  g12.type="Cardio";
  
  g12.trainer=t12;
  t12.trainerId=112;
  t12.name="User12";
  t12.specialization="Yoga";
  t12.experience=4;
  t12.salary=22000;
  
  g12.getGymDetails();

  Gym g13=new Gym();
  Trainer t13=new Trainer();
  g13.gymId=13;
  g13.name="Fitness One";
  g13.location="BTM";
  g13.type="Yoga";
  
  g13.trainer=t13;
  t13.trainerId=113;
  t13.name="User13";
  t13.specialization="Strength";
  t13.experience=6;
  t13.salary=24000;
  
  g13.getGymDetails();

  Gym g14=new Gym();
  Trainer t14=new Trainer();
  g14.gymId=14;
  g14.name="Muscle Factory";
  g14.location="BTM";
  g14.type="Bodybuilding";
  
  g14.trainer=t14;
  t14.trainerId=114;
  t14.name="User14";
  t14.specialization="Cardio";
  t14.experience=7;
  t14.salary=30000;
  
  g14.getGymDetails();

  Gym g15=new Gym();
  Trainer t15=new Trainer();
  g15.gymId=15;
  g15.name="Power Gym";
  g15.location="BTM";
  g15.type="Fitness";
  
  g15.trainer=t15;
  t15.trainerId=115;
  t15.name="User15";
  t15.specialization="Yoga";
  t15.experience=5;
  t15.salary=26000;
  
  g15.getGymDetails();

  Gym g16=new Gym();
  Trainer t16=new Trainer();
  g16.gymId=16;
  g16.name="Fit Zone";
  g16.location="BTM";
  g16.type="Cardio";
  
  g16.trainer=t16;
  t16.trainerId=116;
  t16.name="User16";
  t16.specialization="Strength";
  t16.experience=3;
  t16.salary=20000;
  
  g16.getGymDetails();

  Gym g17=new Gym();
  Trainer t17=new Trainer();
  g17.gymId=17;
  g17.name="Iron Gym";
  g17.location="BTM";
  g17.type="Bodybuilding";
  
  g17.trainer=t17;
  t17.trainerId=117;
  t17.name="User17";
  t17.specialization="Cardio";
  t17.experience=6;
  t17.salary=28000;
  
  g17.getGymDetails();

  Gym g18=new Gym();
  Trainer t18=new Trainer();
  g18.gymId=18;
  g18.name="Flex Gym";
  g18.location="BTM";
  g18.type="Fitness";
  
  g18.trainer=t18;
  t18.trainerId=118;
  t18.name="User18";
  t18.specialization="Yoga";
  t18.experience=4;
  t18.salary=23000;
  
  g18.getGymDetails();

  Gym g19=new Gym();
  Trainer t19=new Trainer();
  g19.gymId=19;
  g19.name="Ultimate Gym";
  g19.location="BTM";
  g19.type="Cardio";
  
  g19.trainer=t19;
  t19.trainerId=119;
  t19.name="User19";
  t19.specialization="Strength";
  t19.experience=5;
  t19.salary=25000;
  
  g19.getGymDetails();

  Gym g20=new Gym();
  Trainer t20=new Trainer();
  g20.gymId=20;
  g20.name="Pro Fitness";
  g20.location="BTM";
  g20.type="Fitness";
  
  g20.trainer=t20;
  t20.trainerId=120;
  t20.name="User20";
  t20.specialization="Yoga";
  t20.experience=6;
  t20.salary=27000;
  
  g20.getGymDetails();

 }
}
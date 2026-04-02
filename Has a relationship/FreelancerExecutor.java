class FreelancerExecutor{

 public static void main(String[] args){

  Freelancer f1 = new Freelancer();
  f1.freelancerId = 1;
  f1.name = "Ravi";
  f1.skill = "Java Developer";
  f1.experience = 3;

  Client c1 = new Client();
  f1.client = c1;

  c1.clientId = 101;
  c1.name = "Infosys";
  c1.project = "Banking App";
  c1.budget = 50000;
  c1.isActive = true;

  f1.getFreelancerDetails();
 
  Freelancer f2 = new Freelancer();
  f2.freelancerId = 2;
  f2.name = "Neha";
  f2.skill = "Web Designer";
  f2.experience = 4;

  Client c2 = new Client();
  f2.client = c2;

  c2.clientId = 102;
  c2.name = "TCS";
  c2.project = "E-commerce UI";
  c2.budget = 40000;
  c2.isActive = true;

  f2.getFreelancerDetails();
  
  Freelancer f3 = new Freelancer();
  f3.freelancerId = 3;
  f3.name = "Arjun";
  f3.skill = "Python Developer";
  f3.experience = 5;

  Client c3 = new Client();
  f3.client = c3;

  c3.clientId = 103;
  c3.name = "Wipro";
  c3.project = "AI Model";
  c3.budget = 80000;
  c3.isActive = true;

  f3.getFreelancerDetails();
 
  Freelancer f4 = new Freelancer();
  f4.freelancerId = 4;
  f4.name = "Sneha";
  f4.skill = "Content Writer";
  f4.experience = 2;

  Client c4 = new Client();
  f4.client = c4;

  c4.clientId = 104;
  c4.name = "Zomato";
  c4.project = "Blog Content";
  c4.budget = 20000;
  c4.isActive = true;

  f4.getFreelancerDetails();
  
  Freelancer f5 = new Freelancer();
  f5.freelancerId = 5;
  f5.name = "Kiran";
  f5.skill = "Android Developer";
  f5.experience = 3;

  Client c5 = new Client();
  f5.client = c5;

  c5.clientId = 105;
  c5.name = "Swiggy";
  c5.project = "Food App";
  c5.budget = 60000;
  c5.isActive = true;

  f5.getFreelancerDetails();
 

  Freelancer f6=new Freelancer();
  Client c6=new Client();
  f6.freelancerId=6;
  f6.name="Manoj";
  f6.skill="Tester";
  f6.experience=4;
  
  f6.client=c6;
  c6.clientId=106; 
  c6.name="Capgemini";
  c6.project="QA Testing";
  c6.budget=30000;
  c6.isActive=true;
  
  f6.getFreelancerDetails();

  Freelancer f7=new Freelancer();
  Client c7=new Client();
  f7.freelancerId=7;
  f7.name="Divya";
  f7.skill="UI Designer";
  f7.experience=3;
  
  f7.client=c7;
  c7.clientId=107;
  c7.name="Amazon";
  c7.project="Website UI";
  c7.budget=70000;
  c7.isActive=true;
  
  f7.getFreelancerDetails();

  Freelancer f8=new Freelancer();
  Client c8=new Client();
  f8.freelancerId=8;
  f8.name="Rohit";
  f8.skill="DevOps";
  f8.experience=6;
  
  f8.client=c8;
  c8.clientId=108;
  c8.name="Google";
  c8.project="Cloud Setup";
  c8.budget=90000;
  c8.isActive=true;
  
  f8.getFreelancerDetails();

  Freelancer f9=new Freelancer();
  Client c9=new Client();
  f9.freelancerId=9;
  f9.name="Anu";
  f9.skill="SEO Expert";
  f9.experience=2;
  
  f9.client=c9;
  c9.clientId=109;
  c9.name="Flipkart";
  c9.project="SEO Project";
  c9.budget=25000;
  c9.isActive=true;
  
  f9.getFreelancerDetails();

  Freelancer f10=new Freelancer();
  Client c10=new Client();
  f10.freelancerId=10;
  f10.name="Vikas";
  f10.skill="React Dev";
  f10.experience=5;
  
  f10.client=c10;
  c10.clientId=110;
  c10.name="Paytm";
  c10.project="Frontend";
  c10.budget=75000;
  c10.isActive=true;
  
  f10.getFreelancerDetails();

  Freelancer f11=new Freelancer();
  Client c11=new Client();
  f11.freelancerId=11;
  f11.name="Amit";
  f11.skill="Java";
  f11.experience=4;
  
  f11.client=c11;
  c11.clientId=111;
  c11.name="HCL";
  c11.project="ERP";
  c11.budget=60000;
  c11.isActive=true;
  
  f11.getFreelancerDetails();

  Freelancer f12=new Freelancer();
  Client c12=new Client();
  f12.freelancerId=12;
  f12.name="Pooja";
  f12.skill="Designer";
  f12.experience=3;
  
  f12.client=c12;
  c12.clientId=112;
  c12.name="Myntra";
  c12.project="UI Revamp";
  c12.budget=50000;
  c12.isActive=true;
  
  f12.getFreelancerDetails();

  Freelancer f13=new Freelancer();
  Client c13=new Client();
  f13.freelancerId=13;
  f13.name="Sanjay";
  f13.skill="ML Engineer";
  f13.experience=6;
  
  f13.client=c13;
  c13.clientId=113;
  c13.name="Meta";
  c13.project="ML Model";
  c13.budget=100000;
  c13.isActive=true;
  
  f13.getFreelancerDetails();

  Freelancer f14=new Freelancer();
  Client c14=new Client();
  f14.freelancerId=14;
  f14.name="Latha";
  f14.skill="Writer";
  f14.experience=2;
  
  f14.client=c14;
  c14.clientId=114;
  c14.name="Medium";
  c14.project="Articles";
  c14.budget=20000;
  c14.isActive=true;
  
  f14.getFreelancerDetails();

  Freelancer f15=new Freelancer();
  Client c15=new Client();
  f15.freelancerId=15;
  f15.name="Karthik";
  f15.skill="Android";
  f15.experience=5;
  
  f15.client=c15;
  c15.clientId=115;
  c15.name="Uber";
  c15.project="Driver App";
  c15.budget=80000;
  c15.isActive=true;
  
  f15.getFreelancerDetails();

  Freelancer f16=new Freelancer();
  Client c16=new Client();
  f16.freelancerId=16;
  f16.name="Meena";
  f16.skill="Tester";
  f16.experience=3;
  
  f16.client=c16;
  c16.clientId=116;
  c16.name="Dell";
  c16.project="Testing";
  c16.budget=35000;
  c16.isActive=true;
  
  f16.getFreelancerDetails();

  Freelancer f17=new Freelancer();
  Client c17=new Client();
  f17.freelancerId=17;
  f17.name="Ajay";
  f17.skill="DevOps";
  f17.experience=7;
  
  f17.client=c17;
  c17.clientId=117;
  c17.name="IBM";
  c17.project="Deployment";
  c17.budget=95000;
  c17.isActive=true;
  
  f17.getFreelancerDetails();

  Freelancer f18=new Freelancer();
  Client c18=new Client();
  f18.freelancerId=18;
  f18.name="Nisha";
  f18.skill="SEO";
  f18.experience=2;
  
  f18.client=c18;
  c18.clientId=118;
  c18.name="Nykaa";
  c18.project="SEO";
  c18.budget=30000;
  c18.isActive=true;
  
  f18.getFreelancerDetails();

  Freelancer f19=new Freelancer();
  Client c19=new Client();
  f19.freelancerId=19;
  f19.name="Rahul";
  f19.skill="React";
  f19.experience=4;
  
  f19.client=c19;
  c19.clientId=119;
  c19.name="Zerodha";
  c19.project="Dashboard";
  c19.budget=70000;
  c19.isActive=true;
  
  f19.getFreelancerDetails();

  Freelancer f20=new Freelancer();
  Client c20=new Client();
  f20.freelancerId=20;
  f20.name="Priya";
  f20.skill="Full Stack";
  f20.experience=6;
  
  f20.client=c20;
  c20.clientId=120;
  c20.name="Byjus";
  c20.project="Learning App";
  c20.budget=90000;
  c20.isActive=true;
  
  f20.getFreelancerDetails();

 }
}
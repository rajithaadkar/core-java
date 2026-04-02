class BankExecutor{

 public static void main(String[] args){

  Bank b1 = new Bank();
  b1.bankId = 1;
  b1.name = "SBI";
  b1.branch = "BTM";
  b1.location = "Bangalore";

  AccountHolder a1 = new AccountHolder();
  b1.accountHolder = a1;
  a1.accId = 101;
  a1.name = "Raj";
  a1.type = "Savings";
  a1.balance = 10000;
  a1.mobile = "900001";

  b1.getBankDetails();

  Bank b2 = new Bank();
  b2.bankId = 2;
  b2.name = "HDFC";
  b2.branch = "Indiranagar";
  b2.location = "Bangalore";

  AccountHolder a2 = new AccountHolder();
  b2.accountHolder = a2;
  a2.accId = 102;
  a2.name = "Anu";
  a2.type = "Current";
  a2.balance = 20000;
  a2.mobile = "900002";

  b2.getBankDetails();
  
  Bank b3 = new Bank();
  b3.bankId = 3;
  b3.name = "ICICI";
  b3.branch = "Whitefield";
  b3.location = "Bangalore";

  AccountHolder a3 = new AccountHolder();
  b3.accountHolder = a3;
  a3.accId = 103;
  a3.name = "Kiran";
  a3.type = "Savings";
  a3.balance = 15000;
  a3.mobile = "900003";

  b3.getBankDetails();
 
  Bank b4 = new Bank();
  b4.bankId = 4;
  b4.name = "Axis";
  b4.branch = "Marathahalli";
  b4.location = "Bangalore";

  AccountHolder a4 = new AccountHolder();
  b4.accountHolder = a4;
  a4.accId = 104;
  a4.name = "Pooja";
  a4.type = "Current";
  a4.balance = 25000;
  a4.mobile = "900004";

  b4.getBankDetails();

  Bank b5 = new Bank();
  b5.bankId = 5;
  b5.name = "Canara";
  b5.branch = "Yelahanka";
  b5.location = "Bangalore";

  AccountHolder a5 = new AccountHolder();
  b5.accountHolder = a5;

  a5.accId = 105;
  a5.name = "Ravi";
  a5.type = "Savings";
  a5.balance = 30000;
  a5.mobile = "900005";

  b5.getBankDetails();
  
  Bank b6 = new Bank();
  b6.bankId = 6;
  b6.name = "SBI";
  b6.branch = "Hebbal";
  b6.location = "Bangalore";

  AccountHolder a6 = new AccountHolder();
  b6.accountHolder = a6;

  a6.accId = 106;
  a6.name = "Sneha";
  a6.type = "Current";
  a6.balance = 18000;
  a6.mobile = "900006";

  b6.getBankDetails();

  Bank b7 = new Bank();
  b7.bankId = 7;
  b7.name = "HDFC";
  b7.branch = "KR Puram";
  b7.location = "Bangalore";

  AccountHolder a7 = new AccountHolder();
  b7.accountHolder = a7;

  a7.accId = 107;
  a7.name = "Arjun";
  a7.type = "Savings";
  a7.balance = 22000;
  a7.mobile = "900007";

  b7.getBankDetails();

  Bank b8 = new Bank();
  b8.bankId = 8;
  b8.name = "ICICI";
  b8.branch = "Majestic";
  b8.location = "Bangalore";

  AccountHolder a8 = new AccountHolder();
  b8.accountHolder = a8;

  a8.accId = 108;
  a8.name = "Divya";
  a8.type = "Current";
  a8.balance = 27000;
  a8.mobile = "900008";

  b8.getBankDetails();

  Bank b9 = new Bank();
  b9.bankId = 9;
  b9.name = "Axis";
  b9.branch = "Rajajinagar";
  b9.location = "Bangalore";

  AccountHolder a9 = new AccountHolder();
  b9.accountHolder = a9;

  a9.accId = 109;
  a9.name = "Manoj";
  a9.type = "Savings";
  a9.balance = 32000;
  a9.mobile = "900009";

  b9.getBankDetails();

  Bank b10 = new Bank();
  b10.bankId = 10;
  b10.name = "Canara";
  b10.branch = "Jayanagar";
  b10.location = "Bangalore";

  AccountHolder a10 = new AccountHolder();
  b10.accountHolder = a10;

  a10.accId = 110;
  a10.name = "Neha";
  a10.type = "Current";
  a10.balance = 35000;
  a10.mobile = "900010";

  b10.getBankDetails();
  
  Bank b11 = new Bank();
  b11.bankId=11;
  b11.name="SBI";
  b11.branch="BTM"; 
  b11.location="Bangalore";
  
  AccountHolder a11 = new AccountHolder();
  b11.accountHolder=a11;
  
  a11.accId=111;
  a11.name="User11"; 
  a11.type="Savings"; 
  a11.balance=11000;
  a11.mobile="900011";
  
  b11.getBankDetails();
 
  Bank b12 = new Bank();
  b12.bankId=12;
  b12.name="HDFC";
  b12.branch="BTM";
  b12.location="Bangalore";
  
  AccountHolder a12 = new AccountHolder();
  b12.accountHolder=a12;
  
  a12.accId=112;
  a12.name="User12";
  a12.type="Current";
  a12.balance=12000;
  a12.mobile="900012";
  b12.getBankDetails();
 

  Bank b13 = new Bank();
  b13.bankId=13;
  b13.name="ICICI";
  b13.branch="BTM";
  b13.location="Bangalore";
  
  AccountHolder a13 = new AccountHolder();
  b13.accountHolder=a13;
  a13.accId=113;
  a13.name="User13";
  a13.type="Savings";
  a13.balance=13000;
  a13.mobile="900013";
  b13.getBankDetails();

  Bank b14 = new Bank();
  b14.bankId=14;
  b14.name="Axis";
  b14.branch="BTM";
  b14.location="Bangalore";
  
  AccountHolder a14 = new AccountHolder();
  b14.accountHolder=a14;
  a14.accId=114;
  a14.name="User14";
  a14.type="Current";
  a14.balance=14000;
  a14.mobile="900014";
  b14.getBankDetails();

  Bank b15 = new Bank();
  b15.bankId=15;
  b15.name="Canara";
  b15.branch="BTM";
  b15.location="Bangalore";
  
  AccountHolder a15 = new AccountHolder();
  b15.accountHolder=a15;
  a15.accId=115;
  a15.name="User15";
  a15.type="Savings";
  a15.balance=15000;
  a15.mobile="900015";
  b15.getBankDetails();

  Bank b16 = new Bank();
  b16.bankId=16;
  b16.name="SBI";
  b16.branch="BTM";
  b16.location="Bangalore";
  
  AccountHolder a16 = new AccountHolder();
  b16.accountHolder=a16;
  a16.accId=116;
  a16.name="User16";
  a16.type="Current";
  a16.balance=16000;
  a16.mobile="900016";
  b16.getBankDetails();

  Bank b17 = new Bank();
  b17.bankId=17;
  b17.name="HDFC";
  b17.branch="BTM";
  b17.location="Bangalore";
  
  AccountHolder a17 = new AccountHolder();
  b17.accountHolder=a17;
  a17.accId=117;
  a17.name="User17";
  a17.type="Savings";
  a17.balance=17000;
  a17.mobile="900017";
  b17.getBankDetails();
 
  Bank b18 = new Bank();
  b18.bankId=18;
  b18.name="ICICI";
  b18.branch="BTM";
  b18.location="Bangalore";
  
  AccountHolder a18 = new AccountHolder();
  b18.accountHolder=a18;
  a18.accId=118;
  a18.name="User18";
  a18.type="Current";
  a18.balance=18000;
  a18.mobile="900018";
  b18.getBankDetails();
 
  Bank b19 = new Bank();
  b19.bankId=19;
  b19.name="Axis";
  b19.branch="BTM";
  b19.location="Bangalore";
  
  AccountHolder a19 = new AccountHolder();
  b19.accountHolder=a19;
  a19.accId=119;
  a19.name="User19";
  a19.type="Savings";
  a19.balance=19000;
  a19.mobile="900019";
  b19.getBankDetails();

  Bank b20 = new Bank();
  b20.bankId=20;
  b20.name="Canara";
  b20.branch="BTM";
  b20.location="Bangalore";
  
  AccountHolder a20 = new AccountHolder();
  b20.accountHolder=a20;
  a20.accId=120;
  a20.name="User20"; 
  a20.type="Current"; 
  a20.balance=20000; 
  a20.mobile="900020";
  b20.getBankDetails();
 }
}
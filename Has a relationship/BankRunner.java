class BankRunner{

public static void main(String[] b){

Bank bank = new Bank();
bank.bankId = 1;
bank.name ="canara";

AccountHolder acc1 = new AccountHolder();
bank.accountHolder = acc1;
acc1.accId = 2;
acc1.name ="rajitha";

bank.getBankDetails();





}
}

package encapsulation;

public class BankAccount {
   private String accountNumber;
   private  double balance;
 
  
   public BankAccount(String accountNumber,double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
        
        
    }
   BankAccount(){
        accountNumber = "Unknown";
        balance = 0.00;
        
        
       
   }
   public void display(){
        System.out.printf("Account Name : %s%n ", getaccountNumber());
         System.out.printf("Account Balance : %.2f%n ", getbalance());
          
           
    }
   public String getaccountNumber() {
        return accountNumber;
    }

    public double getbalance() {
        return balance;
    }

   
}

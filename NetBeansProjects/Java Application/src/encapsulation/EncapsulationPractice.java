/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package encapsulation;

/**
 *
 * @author LENOVO
 */
public class EncapsulationPractice {
   private String accountNumber;
   private  String accountHolderName;
   private  String bvn;
   private double balance;
   private String accountType;
   
   
    EncapsulationPractice(){
        accountNumber = "0000000000";
        accountHolderName = "Unknown";
        bvn = "000000000000";
        balance = 0.00;
        accountType = "Savings";
       
   }
    public EncapsulationPractice(String accountNumber,String accountHolderName,String bvn,double balance,String accountType){
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.bvn = bvn;
        this.balance = balance;
        this.accountType = accountType;
    }
    public EncapsulationPractice(String accountNumber,String accountHolderName){
        this.accountNumber=accountNumber;
        this.accountHolderName=accountHolderName;
        
    }
    
    
    public void display(){
        System.out.printf("Account number : %s%n ", getAccountNumber());
         System.out.printf("Account holder name : %s%n ", getAccountHolderName());
          System.out.printf("Account balance : %f%n ", getBalance());
           System.out.printf("Account type: %s%n ", getAccountType());
            System.out.printf("Account BVN : %s%n ", getBvn());
    }
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public String getBvn() {
        return bvn;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public void setBvn(String bvn) {
        this.bvn = bvn;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    
}

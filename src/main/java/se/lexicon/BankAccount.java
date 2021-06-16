package se.lexicon;

public class BankAccount {
    public static int counter=0;
    private int accountNumber=++counter;
    private double balance;
    private String customerName;
    private String email;
    private int phoneNumber;
    //constructor
    public BankAccount(int balance,String customerName,String email,int phoneNumber){
        this.accountNumber=accountNumber;
        this.balance=balance;
        this.customerName=customerName;
        this.email=email;
        this.phoneNumber=phoneNumber;
    }
    //con2
    public void deposit(double amount){
        balance+=amount;
    }
    //con3
    public void withdraw(double amount){
        balance-=amount;
    }
    //con4
    public BankAccount(){

    }

    public void setAccountNumber(int accountNumber){
        this.accountNumber=accountNumber;
    }
    public int getAccountNumber(){
        return accountNumber;
    }
    public void setBalance(int balance){
        this.balance=balance;
    }
    public double getBalance(){
        return balance;
    }
    public void setCustomerNamecustomerName(String customerName){
        this.customerName=customerName;
    }
    public String getCustomerName(){
        return customerName;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public String getEmail(String email){
        return email;
    }
    public void setPhoneNumber(int phoneNumber){
        this.phoneNumber=phoneNumber;
    }
    public int getPhoneNumber(int phoneNumber){
        return phoneNumber;
    }
    public static int count(){
        return counter;

    }




    }

package ATMpackage;

import com.sun.source.tree.BreakTree;

import java.text.DecimalFormat;
import java.util.Scanner;
//WE ARE DOING THE ACCOUNT ACTIONS IN THIS CLASS
// githubdaki ekranda yazdim
// github tekrar yazdim

public class Account {
    private int accountNumber;
    private int pinNumber;

    private double checkingBalance;
    private double savingBalance;

    Scanner scan = new Scanner(System.in);
DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");


//asagiyi sag tus generate yaptik.getters and setters yaptik. tum secenekleri sectik.asagisi oldu.
    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getPinNumber() {
        return pinNumber;
    }

    public void setPinNumber(int pinNumber) {
        this.pinNumber = pinNumber;
    }

    public double getCheckingBalance() {
        return checkingBalance;
    }

    public void setCheckingBalance(double checkingBalance) {
        this.checkingBalance = checkingBalance;
    }

    public double getSavingBalance() {
        return savingBalance;
    }

    public void setSavingBalance(double savingBalance) {
        this.savingBalance = savingBalance;
    }
    // CALCULATE CHECKING BALANCE AFTER WITHDRAW
    private double calculateCheckingBalanceAfterWithdraw (double amount){
        checkingBalance = checkingBalance-amount;
        return checkingBalance;
    }


    // calculate checking account balance AFTER DEPOSIT
    private double calculateCheckingBalanceAfterDeposit(double amount){
        checkingBalance =checkingBalance+ amount;
        return checkingBalance;
    }
    // CALCULATE SAVING BALANCE AFTER WITHDRAW
    private double calculateSavingBalanceAfterWithdraw (double amount){
        savingBalance = savingBalance-amount;
        return savingBalance;
    }


    // CALCULATE SAVING BALANCE balance AFTER DEPOSIT
    private double calculatesavingBalanceAfterDeposit(double amount){
        savingBalance =savingBalance+ amount;
        return savingBalance;
    }
    // INTERACT WITH USER TO WITHDRAW MONEY FROM CHECKING ACCOUNT
    public void getCheckingWithDraw(){
        System.out.println("Your checking Balance "+moneyFormat.format(checkingBalance));
        System.out.println("Enter the amount you would like to withdraw: ");
        double amount = scan.nextDouble();
        if (amount <=0){
            System.out.println("Negative or Zero amount is not acceptable!");
            getCheckingBalance();
        } else if (checkingBalance>=amount) {
          calculateCheckingBalanceAfterWithdraw(amount);
            System.out.println("Your checking Balance "+moneyFormat.format(checkingBalance));
        } else {
            System.out.println("You do not have enough money on your checking account");
        }
    }
    // INTERACT WITH USER TO DEPOSIT MONEY TO THEIR CHECKING ACCOUNT
    public void getCheckingDeposit(){
        System.out.println("Your checking Balance "+moneyFormat.format(checkingBalance));
        System.out.println("Enter the amount you would like to deposit: ");
        double amount = scan.nextDouble();

        if (amount<=0 ){
            System.out.println("Negative or Zero amount is not acceptable!");
            getCheckingDeposit();
        }else {
            calculateCheckingBalanceAfterDeposit(amount);
            System.out.println("Your checking Balance "+moneyFormat.format(checkingBalance));
        }

    }
    // INTERACT WITH USER TO WITHDRAW MONEY FROM SAVING ACCOUNT
    public void getSavingWithDraw(){
        System.out.println("Your saving Balance "+moneyFormat.format(savingBalance));
        System.out.println("Enter the amount you would like to withdraw: ");
        double amount = scan.nextDouble();
        if (amount <=0){
            System.out.println("Negative or Zero amount is not acceptable!");
            getSavingWithDraw();
        } else if (savingBalance>=amount) {
            calculateSavingBalanceAfterWithdraw(amount);
            System.out.println("Your saving Balance "+moneyFormat.format(savingBalance));
        } else {
            System.out.println("You do not have enough money on your saving account");
        }
    }
    // INTERACT WITH USER TO DEPOSIT MONEY TO THEIR SAVING ACCOUNT
    public void getSavingDeposit(){
        System.out.println("Your saving Balance "+moneyFormat.format(savingBalance));
        System.out.println("Enter the amount you would like to deposit: ");
        double amount = scan.nextDouble();

        if (amount<=0 ){
            System.out.println("Negative or Zero amount is not acceptable!");
            getSavingDeposit();
        }else {
            calculatesavingBalanceAfterDeposit(amount);
            System.out.println("Your saving Balance "+moneyFormat.format(savingBalance));
        }

    }


}

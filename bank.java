import java.util.*;
class Account
{
    double balance;
    Account(double b)
    {
        if(b>0)
            balance=b;
        else
        {
            balance=0;
            System.out.println("Invalid balance");
        }
    }
    void credit(double c)
    {
        balance+=c;
    }
    void debit(double d)
    {
        if(d<balance)
            balance-=d;
        else
            System.out.println("Not Enough Balance");
    }
    void enquiry()
    {
        System.out.println("The balance is: "+balance);
    }
}
class SavingsAccount extends Account
{
    double interestRate;
    SavingsAccount(double b,double ir)
    {
        super(b);
        interestRate=ir;
    }
    public double calculateInterest()
    {
        return balance*(interestRate/100);
    }
}
class CheckingAccount extends Account
{
    double feepertran;
    CheckingAccount(double b,double fee)
    {
        super(b);
        feepertran=fee;
    }
    void credit(double c)
    {
        balance+=c-feepertran;
    }
    void debit(double d)
    {
        if((d+feepertran)<balance)
            balance-=d-feepertran;
        else
            System.out.println("Not Enough Balance");
    }
}
class bank
{
    public static void main(String args[])
    {
        SavingsAccount obj1= new SavingsAccount(1000,2);
        obj1.enquiry();
        obj1.credit(obj1.calculateInterest());
        obj1.enquiry();
        CheckingAccount obj2= new  CheckingAccount(1000,20);
        obj2.enquiry();
        obj2.credit(100);
        obj2.debit(30);
        obj2.enquiry();
    }
}

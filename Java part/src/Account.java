import java.util.*;
public class Account implements BankAccount
{
	private double balance;
	public Account()
	{
     balance=200.0;
	}
	public boolean deposit(double amt)
	{
	balance=balance+amt;
	System.out.println("$"+amt+" deposited successfully.");
	return true;
	}
	public double totBal()
	{
	return balance;
	}
	public boolean withdraw(double amt)
	{
	boolean flag=false;
	double check=balance;
	check=check-amt;
    if(check>=100)
	{
	balance=balance-amt;
	System.out.println("Amount after withdrawing cash: $"+balance);
	flag=true;
	}
	else
	{
	System.out.println("Transaction Failed. Minimum balance of $100 needs to be maintained in the account.");
	}
	return flag;
	}
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	Account ac=new Account();
	System.out.println("*****Welcome to the ATM*****");
	System.out.println("Choose what you want to do:\n 1. Deposit Cash\n 2. Withdraw Cash\n 3. Check Balance");
	int choice=sc.nextInt();
	switch(choice)
	{
	case 1: System.out.println("Enter the amount you wish to deposit:");
			double d=sc.nextDouble();
			boolean bo=ac.deposit(d);
			double t=ac.totBal();
			System.out.println("Available balance after depositing cash is: $"+t);
			break;
	case 2: System.out.println("Enter the amount you wish to withdraw:");
			double w=sc.nextDouble();
			boolean res=ac.withdraw(w);
			if(res)
			System.out.println("Transaction Successful. Take your cash.");
			break;
	case 3: double tot=ac.totBal();
	        System.out.println("Available balance is: $"+tot);
	        break;
	default:System.out.println("Invalid Input");        		

	}


	}


}
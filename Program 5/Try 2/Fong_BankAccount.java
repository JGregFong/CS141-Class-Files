/***************************************************************
* file: Fong_BankAccount
* author: Jonathan Fong
* class: CS 141: Programming and Problem Solving
*
* assignment: program 5
* date last modified: 5/24/2016
*
* purpose: 
*
****************************************************************/
public abstract class Fong_BankAccount
{
private double balance;
private int depNumber;
private int witNumber;
private double annualInterest;
private double serviceCharge;
private double monthlyRate;




public abstract void deposit(double amount);

public abstract void withdraw(double amount);

public abstract void calcInterest(double interest);

public abstract void monthlyProcess();

public double getBalance()
{
	return balance;
}

public abstract int getDepositNumber();

public abstract void setDepositNumber(int depNumber);

public abstract int getWithdrawalNumber();

public abstract void setWithdrawalNumber(int witNumber);

public double getInterest()
{
	return annualInterest;
}


public void setInterest(double interest)
{
annualInterest = .12;
}


public abstract double getServiceCharge();

public abstract void setServiceCharge(double charge);

	


public Fong_BankAccount(double bal, double interest)
	{
	balance = bal;
	annualInterest = interest;

	}

}
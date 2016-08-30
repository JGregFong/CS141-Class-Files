/***************************************************************
* file: Fong_RegularAccount
* author: Jonathan Fong
* class: CS 141: Programming and Problem Solving
*
* assignment: program 5
* date last modified: 5/24/2016
*
* purpose: 
*
****************************************************************/
public class Fong_RegularAccount extends Fong_BankAccount
{
	private double bal = getBalance();
	private double interest = getInterest();
	private int depNumber;
	private int witNumber;
	private double serviceCharge;
	
	
	public void deposit(double amount)
		{
		bal = bal + amount;
		System.out.println("The current balance is $" + bal);
		depNumber++;
		}

	public void withdraw(double amount)
		{
		if (bal < amount)
			{
				System.out.println("Error - Not enough funds.");
			}
		else
		{
			bal = bal - amount;
			System.out.println("The current balance is $" + bal);
		}
		}

	public void calcInterest(double interest)
		{
		double intRate = (interest/12);
		double monthlyInterest = bal * intRate;
		bal = bal + monthlyInterest;
		}

	public void monthlyProcess()
		{
		bal = bal - serviceCharge;
		calcInterest(interest);
		System.out.println("The current balance is $" + bal);
		depNumber = 0;
		witNumber = 0;

		}


	public int getDepositNumber()
		{
		return depNumber;
		}

	public void setDepositNumber(int depNumber)
		{
		depNumber = 0;
		}

	public int getWithdrawalNumber()
		{
	return witNumber;
		}

	public void setWithdrawalNumber(int witNumber)
		{
		witNumber = 0;
		}

	public double getServiceCharge()
		{
		return serviceCharge;
		}

	public void setServiceCharge(double serviceCharge)
		{
		serviceCharge = 2;
		}


	


public Fong_RegularAccount(double bal1, double interest1)
	{
	super(bal1, interest1);


	}
}
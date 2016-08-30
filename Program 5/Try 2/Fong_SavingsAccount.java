/***************************************************************
* file: Fong_SavingsAccount
* author: Jonathan Fong
* class: CS 141: Programming and Problem Solving
*
* assignment: program 5
* date last modified: 5/24/2016
*
* purpose: 
*
****************************************************************/
public class Fong_SavingsAccount extends Fong_BankAccount
{
private double bal = getBalance();
private double interest = getInterest();
private boolean status;
private int depNumber;
private int witNumber;
private double charge;


	public void deposit(double amount)
		{
			if (status || (!status && ((bal + amount) > 25 )))
			{
			bal = bal + amount;
			System.out.println("The current balance is $" + bal);
			depNumber++;
			}
			else 
			{
				System.out.println("That is not enough money to restore the account.");
			}
		
		
		}
	
	public void withdraw(double amount)
		{
		bal = bal - amount;
		System.out.println("The current balance is $" + bal);
		witNumber++;
		}
	
	public void calcInterest(double interest)
		{
		double intRate = (interest/12);
		double monthlyInterest = bal * intRate;
		bal = bal + monthlyInterest;
		}
	
	public void monthlyProcess()
		{
			if (witNumber > 4)
				{
				bal = bal - (witNumber - 4);
				System.out.println("The current balance is now: $" + bal);
				if (bal < 25)
					{
						status = false;
						System.out.println("The account is now inactive.");
					}
				else
					{
						calcInterest(interest);
						System.out.println("The account is still active.");
						witNumber = 0;
						depNumber = 0;
						
					}
				}
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
		return charge;
		}
	
	public void setServiceCharge(double charge)
		{
		charge = 0;
		}
	
		
	
	
	public Fong_SavingsAccount(double bal1, double interest1)
		{
		super(bal1, interest1);

		}

}
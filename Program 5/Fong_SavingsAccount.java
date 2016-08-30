/***************************************************************
* file: Fong_SavingsAccount
* author: Jonathan Fong
* class: CS 141: Programming and Problem Solving
*
* assignment: program 5
* date last modified: 5/16/2016
*
* purpose: 
*
****************************************************************/
import java.util.Scanner;
public class Fong_SavingsAccount extends Fong_BankAccount
{
private boolean accountStatus = true;
Scanner keyboard = new Scanner(System.in);
public double interest = getInterest();
public double monthlyRate;


	//method: Fong_SavingsAccount constructor
	//purpose: To organize the instance variables from the abstract class Fong_BankAccount.
	public Fong_SavingsAccount(double bal, double interest, int depNumber, int witNumber, double charge)
	{
		super(bal, interest, depNumber, witNumber, charge);
	}
	
	//method: set/getServiceCharge
	//purpose: To retrieve and set the serviceCharge variable.
	public void setServiceCharge(double charge)
	{
	serviceCharge = charge;
	}

	public double getServiceCharge()
	{
	return serviceCharge;
	}


	//method: deposit
	//purpose: To add more money to the balance and increase the deposit counter.
	public void deposit(double addDeposit)
	{
		balance = balance + addDeposit;
		
		System.out.print("Current balance is $" + balance);
		depositNumber++;
		if (balance > 25)
		{
		accountStatus = true;
		System.out.println("The account is now active.");
		}
		else
		{
		System.out.println("The current balance is $" +balance);		
		}

	}
	
	//method: withdraw
	//purpose: To subtract money from the balance and increase the withdraw counter.
	public void withdraw(double subWithdraw)
	{

		if(accountStatus = true)
		{

		System.out.println("The current balance is $" + (balance - subWithdraw));
		balance = balance - subWithdraw;
		withdrawalNumber++;
		}
		else 
		{
		System.out.println("The savings account is still inactive.");
		}

	}

	//method: calcInterest
	//purpose: To calculate the interest rate and use it for the new balance.
	public void calcInterest()
	{
		monthlyRate = interest/12;
		balance = balance * (1 + monthlyRate);
		System.out.println("The new balance is $" + balance);
	}

	//method: monthlyProcess
	//purpose: To subtract the monthly processing fee from the balance and to check
	//if the account is active or inactive.
	public double monthlyProcess(double bal)
	{
		if (withdrawalNumber > 4)
		{
		
			if(bal < 25)
			{
			accountStatus = false;
			System.out.println("Account balance is $" + balance);
			System.out.println("The account is now inactive.");
			return balance;
			}

			else
			{
			balance = balance - (withdrawalNumber - 4);
			return balance;
			}

		}

		else{
		return balance;
		}
		calcInterest();
	}

	//method: get/set Balance, DepositNumber, WithdrawalNumber, and Interest.
	//purpose: To get or set the variables above.
	public double getBalance()
	{
	return balance;
	}

	public void setBalance(double bal)
	{
	balance = bal;
	}

	public double getDepositNumber()
	{
	return depositNumber;
	}

	public void setDepositNumber(int deposNumber)
	{
	depositNumber = deposNumber;
	}

	public double getWithdrawalNumber()
	{
	return withdrawalNumber;
	}

	public void setWithdrawalNumber(int withNumber)
	{
	withdrawalNumber = withNumber;
	}

	public double getInterest()
	{
	return annualInterest;
	}

	public void setInterest()
	{
	annualInterest = interest;
	}



}
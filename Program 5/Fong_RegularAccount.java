/***************************************************************
* file: Fong_RegularAccount
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
public class Fong_RegularAccount extends Fong_BankAccount
{
private double balance;
private int depositNumber = 0;
private int withdrawalNumber = 0;
private double annualInterest = .12;
private double interest;
private double serviceCharge = 5;
private double monthlyRate;
Scanner keyboard = new Scanner(System.in);

	//method: Fong_RegularAccount
	//purpose:To organize the instance variables from the abstract class Fong_BankAccount into a constructor. 
	public Fong_RegularAccount(double balance, double interest, int depNumber, int witNumber, double charge)
	{
		super(balance, interest, depNumber, witNumber, charge);

	}
	//method: get/set Balance, serviceCharge, DepositNumber, WithdrawalNumber, and Interest.
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

	public void setWithdrawalNumber(int witNumber)
	{
	withdrawalNumber = witNumber;
	}

	public double getInterest()
	{
	return annualInterest;
	}

	public void setInterest(double annualInterest)
	{
	interest = annualInterest;
	}

	public void setServiceCharge(double charge)
	{
	serviceCharge = charge;
	}

	public double getServiceCharge()
	{
	return serviceCharge;
	}

	//method: monthlyProcess
	//purpose: To subtract the serviceCharge and use calcInterest
	//to come up with the new balance.
	public double monthlyProcess()
	{
		balance = balance - serviceCharge;
		calcInterest();
		return balance;
	}

	//method: deposit
	//purpose: To increase the deposit counter and balance;
	public double deposit(double addDeposit)
	{
		depositNumber++;
		return balance + addDeposit;
	}

	//method: withdraw
	//purpose: To subtract from the balance, stop from going into the negatives,
	//and increase the WithdrawalNumber.
	public double withdraw(double subWithdraw)
	{

		if (balance < subWithdraw)
		{
		System.out.println("Error - Insufficient Funds.");
		}
		else
		{
		balance = balance - subWithdraw;
		System.out.println("The current balance is $" + balance);
		withdrawalNumber++;
		return balance;
		}
		return balance;
	}

	//method: calcInterest
	//purpose: to calculate the interest gained and use that in 
	//the new balance.
	public double calcInterest()
	{
		monthlyRate = annualInterest/12;
		balance = balance * (1 + monthlyRate);
		return balance;
	}

}
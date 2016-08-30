/***************************************************************
* file: Fong_BankAccount
* author: Jonathan Fong
* class: CS 141: Programming and Problem Solving
*
* assignment: program 5
* date last modified: 5/16/2016
*
* purpose: 
*
****************************************************************/
public abstract class Fong_BankAccount
{
private double balance;
private int depositNumber;
private int withdrawalNumber;
private double annualInterest;
private double serviceCharge;
private double monthlyRate;



	


public Fong_BankAccount(double bal, double interest, int depNumber, int witNumber, double charge)
	{
	balance = bal;
	annualInterest = interest;
	depositNumber = depNumber;
	withdrawalNumber = witNumber;
	serviceCharge = charge;

	}

}
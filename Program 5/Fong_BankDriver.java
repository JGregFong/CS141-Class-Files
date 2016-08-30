/***************************************************************
* file: Fong_BankDriver
* author: Jonathan Fong
* class: CS 141: Programming and Problem Solving
*
* assignment: program 5
* date last modified: 5/22/2016
*
* purpose: 
*
****************************************************************/
import java.util.Scanner;
import java.io.*;
public class Fong_BankDriver 
{

//method: main
//purpose: Runs the program and changes the balances of the
//savings and regular accounts.
public static void main (String args[])
{

	Scanner keyboard = new Scanner(System.in);
	System.out.println("Which bank account do you want to access?");
	System.out.println("Regular, Savings, or do you want to Quit?");
	String choice = keyboard.nextLine();
	String choiceUpper = choice.toUpperCase();
	boolean exit = false;
	Fong_RegularAccount regular = new Fong_SavingsAccount(20000, 0, 0, .12, 1);
	Fong_SavingsAccount savings = new Fong_RegularAccount(1000, 0, 0, .12, 1);
	double balance1;
	double balance2;
	String selection = keyboard.nextLine();
	String selectionUpper = selection.toUpperCase();


	do{
	switch (choiceUpper)
	{
		case "REGULAR": 
			System.out.println("Do you want to withdraw, deposit, gather interest, or pay the monthly charge?");

				if (selection == "WITHDRAW")
				{
				System.out.println("How much do you want to withdraw?");
				System.out.print("$");
				double subWithdraw = keyboard.nextDouble();
				balance1 = Fong_RegularAccount.withdraw(subWithdraw);
				}
				else if (selection == "DEPOSIT")
				{
					System.out.println("How much do you want to deposit?");
					System.out.print("$");
					double addDeposit = keyboard.nextDouble();
					balance1 = Fong_RegularAccount.deposit(addDeposit);
					System.out.println("Current balance is $"+ balance1);
				}
				else if (selection == "MONTHLY CHARGE")
				{
				balance1 = Fong_RegularAccount.monthlyProcess();
				System.out.println("The new balance is $" + balance1);
				}
				else
				{
				System.out.println("That is not a valid input.");
				}
				break;

		case "SAVINGS":
			System.out.println("Do you want to withdraw, deposit, gather interest, or pay the monthly charge?");

				if (selection == "WITHDRAW")
				{
				System.out.print("How much do you want to withdraw?");
				double subWithdraw = keyboard.nextDouble();		
				balance2 = Fong_SavingsAccount.withdraw(subWithdraw);
				}
				else if (selection == "DEPOSIT")
				{
				System.out.println("How much do you want to deposit?");
				double addDeposit = keyboard.nextDouble();
				balance2 = Fong_SavingsAccount.deposit(addDeposit);
				}
				else if (selection == "MONTHLY CHARGE")
				{
				balance2 = Fong_SavingsAccount.monthlyProcess(balance2);
				}
				else
				{
				System.out.println("That is not a valid input.");
				}
			break;
		case "Q": case "QUIT":
			exit = true;
			break;

		default:
			System.out.println("That is not a valid input. Please try again.");

	}

	}

	while(exit == false);
}



}
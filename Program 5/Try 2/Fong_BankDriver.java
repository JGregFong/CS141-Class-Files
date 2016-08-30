/***************************************************************
* file: Fong_BankDriver
* author: Jonathan Fong
* class: CS 141: Programming and Problem Solving
*
* assignment: program 5
* date last modified: 5/24/2016
*
* purpose: To
*
****************************************************************/
import java.util.Scanner;
public class Fong_BankDriver
{


	public static void main(String args[])
	{
		Fong_BankAccount [] bank = new Fong_BankAccount [2];
		bank[0] = new Fong_SavingsAccount(0, .12);
		bank[1] = new Fong_RegularAccount(0, .12);
		Scanner keyboard = new Scanner(System.in);
		boolean quit =  false;
		String inputRepeat;
		char startLetter2 = 'a';
		

			System.out.println("Which bank account do you want to access?");
			System.out.println("1. Regular");
			System.out.println("2. Savings");
			System.out.println("Quit or quit.");
			String choose = keyboard.nextLine();
			char startLetter = choose.charAt(0);
			
			do
			{
				if (startLetter != 'q' || startLetter != 'Q' || startLetter2 != 'q' || startLetter2 != 'Q')	
				{
						int selectInt = Integer.parseInt(new String (Character.toString(startLetter)));
						System.out.println("What action do you wish to perform:");
						System.out.println("Type a number:");
						System.out.println("1. Withdraw");
						System.out.println("2. Deposit");
						System.out.println("3. Monthly Process");
						
				
						int action = keyboard.nextInt();
						switch (action){
						case 1:
								System.out.print("Enter the amount to withdraw: $");
								double amount = keyboard.nextDouble();
								bank[selectInt - 1].withdraw(amount);
								break;
						case 2:
								System.out.print("Enter the amount to deposit: $");
								double amount1 = keyboard.nextDouble();
								bank[selectInt - 1].deposit(amount1);
								break;
						case 3:
								bank[selectInt - 1].monthlyProcess();
								break;
						default:
								System.out.println("That is not a valid input.");
								break;
						}
				}	

				else
				{	
				quit = true;
				}
				keyboard.nextLine();
				
				System.out.println("Which bank account do you want to access?");
				System.out.println("1. Regular");
				System.out.println("2. Savings");
				System.out.println("Quit or quit.");
				inputRepeat = keyboard.nextLine();
				startLetter2 = inputRepeat.charAt(0);
			}	
		while (quit != true);
		
		}


	}
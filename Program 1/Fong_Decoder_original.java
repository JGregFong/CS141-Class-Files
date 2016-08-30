/***************************************************************
* file: Fong_Decoder.java
* author: J. Fong
* class: CS 141: Programming and Problem Solving
*
* assignment: program 1
* date last modified: 3/31/2016
*
* This is a program that decodes a secret message contained in a text file by
* counting the length of the first line in text file and using the second line
* of numbers in the file to create the secret message.
****************************************************************/
import java.util.Scanner; //Needed for the Scanner class.
import java.io.*;

public class Fong_Decoder
{
	public static void main(String[] args)
	{
	Scanner keyboard = new Scanner(System.in);	 //This Scanner is for keyboard input.
	String inputMessage = keyboard.nextLine();   // To hold the first line message inputted.
	int codeNumber = keyboard.nextInt();		// To read the set of numbers in the second line.
	String secretMessage = "This is a test.";    //To test the decoding a message.
	char decodedLetter;

	//This Prints out the secret message.
	// Use while loops. NO For loops!
	// When the string is read, an index will automatically be made for each character in that first string line.
	// hasNextInt is a boolean. So use it in the while loop.
	System.out.println("The secret message is: ");

	decodedLetter = inputMessage.charAt(codeNumber);

	System.out.print(decodedLetter); 
	while (keyboard.hasNextInt())
	{
	codeNumber = keyboard.nextInt();	
	decodedLetter = inputMessage.charAt(codeNumber);

	System.out.print(decodedLetter); 
	
	}


	}}

/***************************************************************
* file: Fong_AsciiArt.java
* author: J. Fong
* class: CS 141: Programming and Problem Solving
*
* assignment: program 3
* date last modified: 4/23/2016
*
* This is a program that reorders the array Ascii Art file into
* different transformations.
****************************************************************/
import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;
public class Fong_AsciiArt
{
	public static void main(String args[])
	{
	Scanner keyboard = new Scanner (System.in);
	int rows;	
	int columns;


	rows = keyboard.nextInt();
	columns = keyboard.nextInt();
	keyboard.nextLine();

	char [][] picture = new char [rows][columns];

	System.out.println(rows);
	System.out.println(columns);
	
	//Same result as StringBuilder.
	//String testingLine1 = keyboard.nextLine();
	//char[] testerNumber1= testingLine1.toCharArray();
	//System.out.println(testerNumber1);

	for (int row = 0; row < rows; row++)
	{
	String lineReader = keyboard.nextLine();
		for (int col=0; col<columns; col++)
		{
		picture[row][col]= lineReader.charAt(col);
		}
	}

	System.out.println("The ORIGINAL Mona Lisa:");
	System.out.println("Note: it does not read: THIS IS A FAKE (in permanent marker)");
	for (int row = 0; row < rows; row++)
	{
			System.out.println(picture[row]);
	}

	System.out.println("");
	System.out.println("Transformations:");
	for (int row = rows-1; row > 0; row--)
	{
		System.out.println(picture[row]);
	}

	System.out.println("----------");

	for (int row= 0; row <rows; row++)
	{
		
		for (int col= columns-1;  col > 0; col--)
		{
			System.out.print(picture[row][col]);
		}
		System.out.print("\n");
	}

	
	for (int row = rows-1; row > 0; row--)
	{
		
		for (int col= columns-1;  col > 0; col--)
		{
			System.out.print(picture[row][col]);
		}
		System.out.print("\n");
	}




	//WORKS but does not display anything.
	//StringBuilder newTester = new StringBuilder(testingLine1);
	//System.out.println(newTester);
	//newTester.reverse();
	//System.out.println(newTester);

	//for (int row = 0; row <= rows; row++)
	//{
	//StringBuilder newLine = arrayScanner.nextLine();
	//Maybe use a printwriter.
	//newLine.getChars(0,columns, picture, 0);
	//System.out.println(newLine);
	
	//}
	
	//A nested for-loop is needed for this program.
	//It is similar to the first program. The secret message one.

	
	}}
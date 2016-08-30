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
	public static void main(String args[]) throws FileNotFoundException
	{
	File monalisa = new File ("monalisa.txt");
	Scanner keyboard = new Scanner(monalisa);
	int rows;	
	int columns;

	//This portion reads the integers on the first line and apply 
	//them to the parameters of the char 2d array.
	rows = keyboard.nextInt();
	columns = keyboard.nextInt();
	keyboard.nextLine();

	char [][] picture = new char [rows][columns];

	//Tested to see if integers are being read.
	//System.out.println(rows);
	//System.out.println(columns);
	
	//This for loop reads each line and stores each character 
	//into a 2d array.
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
	//This is a reference to the Doctor Who story "City of Death".
	
	//This for loop prints out the original picture.
	for (int row = 0; row < rows; row++)
	{
			System.out.println(picture[row]);
	}

	System.out.println("");
	System.out.println("Transformations:");

	//This for loop flips the picture vertically 
	//and displays it.
	for (int row = rows-1; row > 0; row--)
	{
		System.out.println(picture[row]);
	}

	System.out.println("----------");

	//This for loop flips the picture horizontally.
	for (int row= 0; row <rows; row++)
	{
		
		for (int col= columns-1;  col > 0; col--)
		{
			System.out.print(picture[row][col]);
		}
		System.out.print("\n");
	}

	System.out.println("-----------");

	//This for loop flips the picture vertically and horizontally.
	for (int row = rows-1; row > 0; row--)
	{
		
		for (int col= columns-1;  col > 0; col--)
		{
			System.out.print(picture[row][col]);
		}
		System.out.print("\n");
	}


	}}
/***************************************************************
* file: Fong_Driver.java
* author: J. Fong
* class: CS 141: Programming and Problem Solving
*
* assignment: program 2
* date last modified: 3/31/2016
*
* This is a program that holds the methods for calculating the area
* of geometric objects. This program is referred by Fong_Driver and
* executes whichever method it calls.
****************************************************************/
import java.util.Scanner;
import java.io.*;
public class Fong_Driver1
{
	public static void main(String args[])
	{
	double radius;
	double length;
	double width;
	double base;
	double area;
	double choice;
	int selection;
	//have a do loop
	do
	{
		choice = userChoice();
		area = isAValidChoice(selection);
	}
	while(choice !=4);

	}

	public static int userChoice()
	{
	Scanner keyboard = new Scanner(System.in);

	System.out.println("----------------------------------");
	System.out.println("Geometry Calculator");
	System.out.println("----------------------------------");
	System.out.println("1. Calculate the Area of a Circle");
	System.out.println("2. Calculate the Area of a Rectangle");
	System.out.println("3. Calculate the Area of a Triangle");
	System.out.println("4. Quit");
	System.out.println(" ");
	System.out.println("Enter your choice (1-4):");

	int selection;

	selection = keyboard.nextInt();
	
	
	}
	public static int isAValidChoice(int number)
	{

		switch (selection)
		{
			case 1:
				System.out.println("Enter the radius of the circle:");
				radius = keyboard.nextDouble();
				area = Fong_Geometry.CircleArea(radius);
				System.out.println("The area of this particular circle is: " + area);
				break;
			case 2:
				System.out.println("Enter the length of the rectancgle:");
				length = keyboard.nextDouble();
				System.out.println("Enter the width of the rectangle:");
				width = keyboard.nextDouble();
				area = Fong_Geometry.RectangleArea(length, width);
				System.out.println("The area of this particular rectangle is: " + area);
				break;
			case 3:
				System.out.println("Enter the base of the triangle:");
				base = keyboard.nextDouble();
				System.out.println("Enter the height of the triangle:");
				height = keyboard.nextDouble();
				area = Fong_Geometry.TriangleArea(base, height)
				System.out.println("The area of this particular triangle is: " + area) 
			default:
				System.out.println("That is not a valid input. Enter (1-4) to calculate a shape's area:");

		}
		return selection;
	}
	
	
}
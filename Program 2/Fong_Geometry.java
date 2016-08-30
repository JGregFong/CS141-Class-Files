/***************************************************************
* file: Fong_Geometry.java
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
public class Fong_Geometry
{
	private double length;
	private double width;
	private double base;
	private double height;
	private double radius;
	private double area;

	//Calculates the area of a circle with the radius given by the user.
	public static double CircleArea(double radius)
	{
		return Math.PI * radius * radius;
	}
	
	//Calculates the area of a rectangle with the length and width given by the user.
	public static double RectangleArea(double length, double width)
	{
		return length * width;
	}

	//Calculates the area of a triangle with the base and height given by the user.
	public static double TriangleArea(double height, double base)
	{
		return 0.5 * height * base;
	}
}
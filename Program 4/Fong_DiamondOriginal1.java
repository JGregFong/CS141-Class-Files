/***************************************************************
* file: Fong_Diamond.java
* author: Jonathan Fong
* class: CS 141 Programming and Problem Solving
*
* assignment: program 4
* date last modified: 5/6/2016
*
* purpose: This program accepts integer input from the command line, doubles the
* value of input; the result is output to both the screen and a file called data.txt
*
****************************************************************/ 
import java.lang.*;
public class Fong_Diamond
{
private String stockNumber;
private double carat;
private String clarity;
private int returnValue;
private int 
private char color;
private String cut;


	//method: getStock
	//purpose: To return the stockNumber variable.
	public String getStock(String stockNumber)
	{
	return stockNumber;
	}

	//method: getCarat
	//purpose: To return the carat variable.
	public double getCarat()
	{
	return carat;
	}

	//method: getClarity
	//purpose: To return the clarity variable.
	public String getClarity(String clarity)
	{
	return clarity;
	}

	//method: getColor
	//purpose: To return the color variable.
	public char getColor(char color)
	{
	return color;
	}

	//method: getCut
	//purpose: To return the cut variable.
	public String getCut(String cut)
	{
	return cut;
	}

	//method: toString
	//purpose: To compile each of the variables into a single string.
	public String toString()
	{
	String str = stockNumber + ": " + carat + " " + clarity + " " + color + " " + cut;
	return str;
	}

	//method: diamondCompare
	//purpose: To compare two diamonds and tell which one is better based on
	//carat. If carats are the same, it then compares color and clarity of a diamond
	//and determines which is better and compares the two diamonds based on that value.
	public int compareTo(Fong_Diamond diamond2)
	{
	Double anyNumber = carat;
	Double anyNumber2 = diamond2.getCarat();
	returnValue = anyNumber.compareTo(anyNumber2);

	if (returnValue= 0)
	{
	//enum, switch, or if else statements for comparing clarity and color.
	enum clarityGrade {FL, IF, VVS1, VVS2, VS1, VS2, SI1, SI2, I1, I2, I3}
	enum colorGrade {D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z}
	String diamondClarity1 = clarity;
	Int clarityRank1 = (clarityGrade.clarity.ordinal() * 2) +1;
	Char diamondColor1 = color;
	Int colorRank1 = colorGrade.color.ordinal();
	String diamondClarity2 = diamond2.getClarity();
	Int clarityRank2 = (clarityGrade.diamondClarity2.ordinal()*2) +1;
	Char diamondColor2 = diamond2.getColor();
	Int colorRank2 = colorGrade.diamondColor2.ordinal();

		if (clarityRank1 > colorRank1)
		{
			if (clarityRank2 > colorRank2)
			{
				if (clarityRank1 = clarityRank2)
				{
					//if (colorRank1 = colorRank2)
					//{
					//	returnValue = 0;
					//	return returnValue;
					//}

					//else if (colorRank1 > colorRank2)
					//{
					//	returnValue = 1;
					//	return returnValue * -1;
					//}

					//else 
					//{
					//	returnValue = -1;
					//return returnValue * -1;
					//}
					returnValue = colorRank1.compareTo(colorRank2);
					return returnValue * -1;
				}
				//else if (clarityRank1 > clarityRank2)
				//{
				//	returnValue = 1;
				//	return returnValue * -1;
				//}
				else 
				{
					returnValue = clarityRank1.compareTo(clarityRank2);
					return returnValue * -1;
				}
			}
			else
			{
			
			}
		}
		else
			if(clarityRank2 > colorRank2)
			{
			
			}


	
	

	else
	{
	return returnValue * -1;
	}
	//System.out.println(diamond2.getCarat());
	//return carat;
			
	}

	//method: Fong_Diamond
	//purpose: To sort each of the types of information into their own variable.
	public Fong_Diamond(String stock, double gemSize, String clearness, char colorHue, String shape)
	{
	stockNumber = stock;
	carat = gemSize;
	clarity= clearness;
	color = colorHue;
	cut = shape;
	}


}
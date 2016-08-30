/***************************************************************
* file: Fong_Diamond.java
* author: Jonathan Fong
* class: CS 141 Programming and Problem Solving
*
* assignment: program 4
* date last modified: 5/12/2016 11:30 PM
*
* purpose: This program sorts an array of diamond objects into 
* one that goes from best to worst according to carat, 
* then compares the best clarity/color qualities and then compares
* the worst clarity/color qualities if the best qualities are equal.
*
****************************************************************/ 

public class Fong_Diamond
{
private String stockNumber;
private double carat;
private String clarity;
private int returnValue;
private char color;
private String cut;
private int clarityGrade;
private int colorGrade;
//enum ClarityGrade {FL, IF, VVS1, VVS2, VS1, VS2, SI1, SI2, I1, I2, I3}
//enum ColorGrade {D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z}

	//method: getStock
	//purpose: To return the stockNumber variable.
	public String getStock()
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
	public String getClarity()
	{
	return clarity;
	}

	//method: getColor
	//purpose: To return the color variable.
	public char getColor()
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

	//method: convertClarity
	//purpose: To convert the clarity String into an integer.
	public int convertClarity(String clarity)
	{
		if (clarity == "FL")
		{
		clarityGrade = 0;
		return clarityGrade;
		}
		else if (clarity == "IF")
		{
		clarityGrade = 1;
		return clarityGrade;		
		}
		else if (clarity == "VVS1")
		{
		clarityGrade = 2;
		return clarityGrade;		
		}
		else if (clarity == "VVS2")
		{
		clarityGrade = 3;
		return clarityGrade;		
		}
		else if (clarity == "VS1")
		{
		clarityGrade = 4;
		return clarityGrade;		
		}
		else if (clarity == "VS2")
		{
		clarityGrade = 5;
		return clarityGrade;		
		}
		else if (clarity == "SI1")
		{
		clarityGrade = 6;
		return clarityGrade;		
		}
		else if (clarity == "SI2")
		{
		clarityGrade = 7;
		return clarityGrade;		
		}
		else if (clarity == "I1")
		{
		clarityGrade = 8;
		return clarityGrade;		
		}
		else if (clarity == "I2")
		{
		clarityGrade = 9;
		return clarityGrade;		
		}
		else 
		{
		clarityGrade = 10;
		return clarityGrade;
		}
	}

	//method: convertColor
	//Takes the String color and spits out an integer value.
	public int convertColor (char color)
	{
	switch (color)
		{
			case 'D': case 'E':
				colorGrade = 0;
			break;

			case 'F': case 'G':
				colorGrade = 1;
			break;

			case 'H': case 'I':
				colorGrade = 2;
			break;
			case 'J': case 'K':
				colorGrade = 3;
			break;

			case 'L': case 'M':
				colorGrade = 4;
			break;

			case 'N': case 'O':
				colorGrade = 5;
			break;

			case 'P': case 'Q':
				colorGrade = 6;
			break;

			case 'R': case 'S':
				colorGrade = 7;
			break;

			case 'T': case 'U':
				colorGrade = 8;
			break;

			case 'V': case 'W':
				colorGrade = 9;
			break;

			case 'X': case 'Y': case 'Z':
				colorGrade = 10;

			break;
			default:
				colorGrade = 100;
				break;

					
		}
		return colorGrade;
	}

	//method: compareTo
	//purpose: To compare two diamonds and tell which one is better based on
	//carat. If carats are the same, it then compares color and clarity of a diamond
	//and determines which is better and compares the two diamonds based on that value.
	public int compareTo(Fong_Diamond diamond2)
	{
	Double anyNumber = carat;
	Double anyNumber2 = diamond2.getCarat();
	returnValue = anyNumber.compareTo(anyNumber2);
	
	Integer clarityRank1 = convertClarity(clarity);
	Integer colorRank1 = convertColor(color);
	String diamondClarity2 = diamond2.getClarity();
	Integer clarityRank2 = convertClarity(diamondClarity2);
	char diamondColor2 = diamond2.getColor();
	Integer colorRank2 = convertColor(diamondColor2);
	if (returnValue == 0)
	{
	//enum, switch, or if else statements for comparing clarity and color.



		if (clarityRank1 > colorRank1)
		{
			if (clarityRank2 > colorRank2)
			{
					returnValue = clarityRank1.compareTo(clarityRank2);
					return returnValue * -1;
			}
			else
			//(clarityRank2 < colorRank2)
			{
					returnValue = clarityRank1.compareTo(colorRank2);
					return returnValue * -1;
			}
		}
		else
		//(clarityRank1 < colorRank1)
		{			
			if(clarityRank2 > colorRank2)
			{
					returnValue = colorRank1.compareTo(clarityRank2);
					return returnValue * -1;
			}
			else
			//(clarityRank2 < colorRank2)
			{
					returnValue = colorRank1.compareTo(colorRank2);
					return returnValue * -1;
			}
		}


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
public class Diamond
{
stockNumber
carot
clarity
color
cut

	getStock
	{
	String temp = new String(stockNumber);
	return temp;
	}

	getclarity()
	{
	String temp = new String(clarity);
	return temp;
	}

	getCut()
	{
	String temp = new String(cut);
	return temp;
	}
	public String toString()
	{
	return new String ("Diamond Stock Number: " + stockNumber + carot + clarity + color + cut);
	}

	public Diamond
	//diamond constructor

	compareto
	{
	clarityRank =0;
	colorRank = 0;
	clarityRank2= 0;
	colorRank2 = 0;
	character thisColor = this. getcolor();
	character passedColor = d.getColor();
	String bestRank="";
	String bestRank2= "";

	if(this.getCarot()<d.getCarot())
		return-1;
	else if (this.getCarot()<d.getCarot())
		return 1;
	else if (this.getClarity(). equals(d.Clarity()) && this.getColor()==d.getColor())
		return 0;
	else{
		clarity Rank = getClarityRank(this.getClarity());
		clarityRank2

		colorRank = getColorRank(this.getColor());

		bestRank=getBestRank(clarityRank,colorRank);
		bestRank2=getBestRank(clarityRank2,colorRank2);

		if(bestRank.equals("clarity") && bestRank2.equals ("clarity"))
		{
			if(clarityRank==clarityRank2)
				return thisColor.compareTo(passedColor);
			else
				return clarityRank.compareTo(clarityRank2);

		}
		else if (bestRank.equals("clarity") && bestRank.equals("color"))
			return clarityRank.compareTo(colorRank2);
		else if(bestRank.equals("color") && bestRank2.equals("color"))
			return colorRank.compareTo(colorRank2);
		else{
			if(colorRank==colorRank2)
			{
			return clarityRank.
			}
			else return thisColor.compareTo(passedColor);

		}
		}

		public String getBestRank(int cl, int co)
		{
		
		}
		//pretty much compare 
	}

	toString



}
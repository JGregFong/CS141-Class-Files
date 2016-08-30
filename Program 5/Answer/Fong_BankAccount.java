public abstract class Fong_BankAccount
{
private double balance = 0.0;
....... etc

	public void setBalance (double b)
		{
		balance= b;

		}

	public int getWithdraws ()
	{
	return withdraws;
	}

	public void deposit (double amount)
	{
		if (amount>-1)
		{
		setBalance(getBalance()+amount);
		setDeposits(getDeposits()+1);

		}

		else
		System.out.println("Error:");
	}
	public void withdraw (double amount)
	{
	
	}

	public void calcInterest()
	{
		double monthlyRate = getInterestRate()/1200.0;
		double monthlyInterest = getBalance()* monthlyRate;
		setBalabce(getBalance()+monthlyInterest);
	}

	public void monthlyPorcess()
	{
		setBalance(getBalance()-getServiceCharge());
		caclInterest();
		setWithdraws(0);
		setDeposits(0);

	}
}
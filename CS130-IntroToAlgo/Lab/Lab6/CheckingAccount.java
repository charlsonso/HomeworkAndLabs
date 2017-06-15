//Charlson So
//Lab 6

public class CheckingAccount extends BankAccount{
	private double fee= .15;
	CheckingAccount(String name, double amount){
		super(name,amount);
		String acc = getAccountNumber()+"-10";
		setAccountNumber(acc);
	}
	
	@Override
	public boolean withdraw(double amount){
		//amount to withdrawal plus fees
		double j = amount+fee;
		boolean completed = true;

      	if (j <= getBalance())
      	{
         setBalance(getBalance() - j);
      	}
      	else
      	{
         completed = false;
      	}
      	return completed;
	}
	
}
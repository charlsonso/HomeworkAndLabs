//Charlson So
//Lab 6

public class SavingsAccount extends BankAccount{
	private double rate=0.025;
	private int savingsNumber=0;
	private String accountNumber;
	SavingsAccount(String name, double amount){
		super(name, amount);

		String acc = super.getAccountNumber()+"-"+Integer.toString(savingsNumber);
		accountNumber=acc;
	}
	
	SavingsAccount(SavingsAccount oldAccount, double amount){
		super(oldAccount,amount);
		savingsNumber=oldAccount.savingsNumber+1;
		accountNumber=super.getAccountNumber()+"-"+Integer.toString(savingsNumber);
	}
	
	public void postInterest(){
		deposit(getBalance()*(rate/12));
	}

	@Override
	public String getAccountNumber(){
			return accountNumber;
	}	
	
}
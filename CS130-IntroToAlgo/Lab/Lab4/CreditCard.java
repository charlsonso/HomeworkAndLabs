public class CreditCard{
	private Money balance;
	private Money creditLimit;
	private Person owner;
	public CreditCard(Person newCardHolder, Money limit){
		owner = newCardHolder;
		creditLimit=limit;
		balance = new Money(0);
	}
	public Money getBalance(){
		return new Money(balance);
	}
	public Money getCreditLimit(){
		return new Money(creditLimit);
	}
	public String getPersonals(){
		return owner.toString();
	}
	public void charge(Money amo){
		balance=balance.add(amo);
		if (balance.compareTo(creditLimit)==1){
			System.out.println("Error: the amount should not be added");
			balance=balance.subtract(amo);
		}
	}
	public void payment(Money amount){
		balance=balance.subtract(amount);
	}
}
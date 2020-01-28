package entities;

public final class SavingsAccount extends Account {

	private Double interestRate;

	
	public SavingsAccount() {
		super();
	}

	public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	
	public void updateBalance() {
		balance += balance*interestRate;
	}
	
	
	@Override
	public void withdraw(double amount) {
		
		if (balance < 0.0 || amount > balance) {
			System.out.println("Não há valor suficiente para saque!");
		} else {
			balance -= amount;
		}
		
	}
}

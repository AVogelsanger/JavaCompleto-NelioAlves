package entities;

public class BusinessAccount extends Account {

	private Double loanLimit;
	
	public BusinessAccount() {
		super();
	}

	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance);
		this.setLoanLimit(loanLimit);
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}
	
	public void loan(double amount) {
		
		if (amount <= loanLimit) {
			balance += amount - 10.0;
		}
	}
	
	
	@Override
	public void withdraw(double amount) {
		
		if (balance < 0.0 || amount > balance) {
			System.out.println("Não há valor suficiente para saque!");
		} else {
			super.withdraw(amount);
			balance -= 2.0;
		}
		
	}
}

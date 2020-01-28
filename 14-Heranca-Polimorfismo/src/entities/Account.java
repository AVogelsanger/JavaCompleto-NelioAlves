package entities;

public class Account {

	private Integer number;
	private String holder;
	protected Double balance;
	
	public Account() {
		
	}
	public Account(Integer number, String holder, Double balance) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
	}
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	public String getHolder() {
		return holder;
	}
	public void setHolder(String holder) {
		this.holder = holder;
	}
	public Double getBalance() {
		return balance;
	}
	
// para não permitir acesso para mudar o saldo da conta livremente. 
//	public void setBalance(Double balance) {
//		this.balance = balance;
//	}

	public void withdraw(double amount) {
		
		if (balance < 0.0 || amount > balance) {
			System.out.println("Não há valor suficiente para saque!");
		} else {
			balance -= amount + 5.0;
		}
		
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
}

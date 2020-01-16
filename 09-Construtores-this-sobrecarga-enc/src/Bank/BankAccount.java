package Bank;

public class BankAccount {
	
	private int number;
	private String holder;
	private double balance;
	
	public BankAccount() {
		
	}

	public BankAccount(int number, String holder, double initialDeposit) {
		//super();
		this.number = number;
		this.holder = holder;
		//this.balance = balance; a melhor forma é chamar o método aqui, pra casos de atualização do método.
		deposit(initialDeposit);
	}
	
	public BankAccount(int number, String holder) {
		//super();
		this.number = number;
		this.holder = holder;
	}
	
	public double deposit(double depositAmount) {
		return balance += depositAmount; 
	}
	
	public double withDraw(double withDrawAmount) {
		return balance -= (withDrawAmount + 5.00); 
	}

	public int getNumber() {
		return number;
	}

//	public void setNumber(int number) {
//		this.number = number;
//	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getAmountDep() {
		return balance;
	}
//
//	public void setAmountDep(double amountDep) {
//		this.balance = amountDep;
//	}
	
	public String toString() {
		return "Account "
				+ number 
				+", Holder: "
				+ holder
				+ ", Balance: US$"
				+ String.format("%.2f", balance);
	}
}

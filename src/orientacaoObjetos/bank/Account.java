package orientacaoObjetos.bank;

public class Account {
	private String name;
	private double balance;
	
	// Declaração do construtor da classe
	public Account(String name, double balance) {
		this.name = name;
		
		if (balance > 0.00) {
			this.balance = balance;
		}
	}
	
	public void deposit(double depositAmount) {
		if (depositAmount > 0.00) {
			this.balance += depositAmount; 
		}
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

}

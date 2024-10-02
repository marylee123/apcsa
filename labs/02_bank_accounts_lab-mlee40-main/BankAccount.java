abstract class BankAccount {
	private String name;
	private double balance;
	public BankAccount(String name, double initialDeposit) throws Exception {
		// WRITE YOUR CODE HERE
		// If the name does not have more than 2 characters
		// the constructor should throw an Exception
		// Also, if the initialDeposit is negative or equal
		// to zero, it should throw an Exception
		if(name.length() > 2){
			this.name = name;
		}
		else{
			throw new Exception("Name must have more than 2 characters");
		}

		if(initialDeposit > 0){
			balance = initialDeposit;
		}
		else{
			throw new Exception("Initial deposit cannot be 0 or less");
		}
	}
	public void deposit(double amount) throws Exception{
		if(amount > 0){
			balance += amount;
		}
		else{
			throw new Exception("Deposit cannot be 0 or less");
		}
	}
	public void withdraw(double amount) throws Exception{
		if(amount <= balance){
			balance -= amount;
		}
		else{
			throw new Exception("Cannot withdraw more than balance value");
		}
	}
	public void transfer(double amount, BankAccount destination) throws Exception{
		if(amount <= balance){
			balance -= amount;
			destination.balance += amount;
		}
		else{
			throw new Exception("Cannot transfer more than balance value");
		}
	}
	// With the same logic, throw an Exception in the deposit
	// method if the amount is negative or equal to zero.
	// Think and implement a condition that could throw an
	// exception in the methods: withdrawal and transfer.
	public String getName(){
		return name;
	}
	public double getBalance(){
		return balance;
	}
}

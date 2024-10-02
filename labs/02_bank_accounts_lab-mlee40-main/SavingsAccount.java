class SavingsAccount extends BankAccount {
	private double interestRate;
	private int withdrawCount;

	public SavingsAccount(String name, double initialDeposit, double interestRate) throws Exception {
		// implement the constructor
		super(name, initialDeposit);
		this.interestRate = interestRate;
		withdrawCount = 0;
	}
	public void addInterest() throws Exception {
		// WRITE YOUR CODE HERE
		if(interestRate > 0){
			this.deposit(getBalance() * interestRate);
		}
		else{
			throw new Exception("Interest rate must be at least 0");
		}
	}
	public int getWithdrawCount(){
		// WRITE YOUR CODE HERE
		return withdrawCount;
	}
	public void withdraw(double withdrawal) throws Exception{
		if(withdrawCount < 6){
			super.withdraw(withdrawal);
			withdrawCount++;
		}
		else{
			throw new Exception("Too many withdrawals");
		}
	}
}

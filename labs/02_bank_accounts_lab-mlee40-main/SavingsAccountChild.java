class SavingsAccountChild extends SavingsAccount{
	private String parentName;

	public SavingsAccountChild(String name, double initialDeposit, double interestRate, String parentName) throws Exception {
		// implement the constructor
		super(name, initialDeposit, interestRate);
		this.parentName = parentName;
	}

	public void withdraw(double amount, String parentName) throws Exception {
		// WRITE YOUR CODE HERE
		// Check if the parameter parentName is equals to the
		// instance variable parentName before withdrawing from
		// the account
		if(this.parentName.equals(parentName)){
			super.withdraw(amount);
		}
		else{
			throw new Exception("Parent's name does not match");
		}
	}
	public String getParentName(){
		return parentName;
	}
}

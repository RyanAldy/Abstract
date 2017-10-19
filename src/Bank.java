
abstract class Bank {
	
	// All abstract methods so need to be overridden by sub classes
	
	abstract public void Deposit(int A);
	abstract public void Withdraw(int A);
	abstract public void Balance();
	
	public void Welcome() {
		
		System.out.println("Hello!");
	}
	
	

}

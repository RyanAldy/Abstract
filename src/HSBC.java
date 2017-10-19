
public class HSBC extends Bank {
	
	int Amount;
	
	// Overriding Withdraw method
	
	public void Withdraw(int B) {
		
		Amount -= B;
	}

	// Overriding Balance method
	
	public void Balance() {
		
		System.out.println(Amount);
	}
	
	// Overriding Deposit method
	
	public void Deposit(int B) {
		
		Amount += B;
		
	}
	
}

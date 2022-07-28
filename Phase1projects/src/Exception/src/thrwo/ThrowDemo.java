package thrwo;

public class ThrowDemo {

	public static void main(String[] args) {
		ThrowDemo obj = new ThrowDemo();
		try {
			int withDrawAmount = 5000;
			System.out.println("Withdrawing: " + withDrawAmount);
			obj.withdrawFromATM(withDrawAmount, 4538);
			System.out.println("Amount Withdrawn");
		} catch (RuntimeException ex) {
			System.out.println("Exception Occurred. " + ex.getMessage());
		}
	}
	
	void withdrawFromATM(int withDrawAmount, int accountNumber) {
		int balance = getBalanceFromAccount(accountNumber);
		if (withDrawAmount > balance) {
			throw new RuntimeException("Division by zero");
			
		} 
	}
	
	int getBalanceFromAccount(int accountNumber) {
		return 1000;
	}
}
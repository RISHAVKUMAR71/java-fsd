package contructor;

import finance.BankAccount;

	
	public class DefaultConstructorTest {
		
		public static void main(String[] args) {
			
			BankAccount account1 = new BankAccount();
			account1.accountNumber=1001;
			account1.balanceTotal=10000;
//			account1.withdrawMoney(500);
//			account1.depositMoney(1000);
			
			BankAccount account2 = new BankAccount();
			account2.accountNumber=1002;
			account2.balanceTotal=20000;
			
//			account2.withdrawMoney(500);
//			account2.depositMoney(1000);
			
			account1.printAccount();
			account2.printAccount();
			
			
			
		}

	}



package daythree.assignment.Bank_Transaction;

public class BankingSystemDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingsAccount sa = new SavingsAccount("Dharani", 1000);
		CheckingAccount ca = new CheckingAccount("Thirumalai", 10000);
		
		System.out.println("TotalAccounts: " + Bank.getTotalAccount());
		
		Transaction txn = new Transaction();
		txn.performTransaction(sa, "deposit", 3000);
		txn.performTransaction(sa, "withdraw", 1000);
		
		txn.performTransaction(ca, "deposit", 1300);
		txn.performTransaction(ca, "withdraw", 5000);
		
		sa.printAccountInfo();
		ca.printAccountInfo();

	}

}

public class Main {

	public static void main(String[] args) {
		
		
		MinBalance m = new MinBalance(8000); // creating a MinBalance object, the input is the balance
		System.out.println(m.getBalance()); //displaying the beginning balance
		m.deposit(13); // calling the deposit function, the input is the amount to deposit
		m.withdraw(203); // calling the withdraw function, the input is the amount to withdraw
		m.endOfMonth(); // Displaying the current balance, the daily lowest balance, and the number of transactions
		
		
		NickelInDime n = new NickelInDime(20000); // creating a NickelInDime object, the input is the balance
		System.out.println(n.getBalance());//displaying the beginning balance
		n.deposit(700);  // calling the deposit function, the input is the amount to deposit
		n.withdraw(1300); // calling the withdraw function, the input is the amount to withdraw
		n.endOfMonth();// Displaying the current balance, the daily lowest balance, and the number of transactions
		
		
		TFDA t = new TFDA(5000); // creating a NickelInDime object, the input is the balance
		System.out.println(t.getBalance());
		t.deposit(800);  // calling the deposit function, the input is the amount to deposit
		t.withdraw(1500); // calling the withdraw function, the input is the amount to withdraw
		t.endOfMonth();// Displaying the current balance, the daily lowest balance, and the number of transactions
		
	}
}

import java.text.*; // importing the decimal format (and several other formats)

/****************************************
	* AUTHOR: Kezia Sorensen
	* Date: October 10
	* Description: The parent class that contains the types of transactions
	****************************************/
abstract public class Account { // creating the class account, which is the parent class
	
	private double balance = 0; // creating and initializing the balance 
	private int transNum = 0; // creating and initializing a variable to keep track of the number of transactions
	private double interest; // creating and initializing a variable for the additional charges from the individual accounts (both fees and interest are counted using the variable)
	private double lDailyBalance; // creating and initializing a variable to keep track of the lowest daily balance
	private double tempBalance; // creating and initializing a variable to check if a transaction happened or not
	
	/****************************************
	* AUTHOR: Kezia Sorensen
	* Date: October 10
	* Description: Initializing variables
	****************************************/
	Account(double balance) { // creating an account constructor to initialize the variables
		this.balance = balance; // making the parameter balance equal to the balance variable that was created
		lDailyBalance = balance; // making the lowest daily balance equal to the balance because it's the only one so far and can change later
		
	}
		abstract double depositUpdate(double amt, double balance, int transNum); // creating an abstract method for updating the individual deposits
		abstract double withdrawUpdate (double amt, double balance, int transNum); // creating an abstract method for updating the individual withdrawals
		abstract double endOfMonthUpdate(double balance, double interest) ; // creating an abstract method for updating the individual month ends
		
		/****************************************
		* AUTHOR: Kezia Sorensen
		* Date: October 10
		* Description: Getting and returning the balance
		* Inputs: None
		* Outputs: Double
		****************************************/
		double getBalance() {
			return balance; // just returning the balance because this method does not have any calculations
		}
		/****************************************
		* AUTHOR: Kezia Sorensen
		* Date: October 10
		* Description: Depositing money into the balance
		* Inputs: double
		* Outputs: None
		****************************************/
		void deposit(double amt) { // creating a method to calculate deposits
			lDailyBalanceUpdate(); // updating the lowest daily balance
			balance = depositUpdate(amt, balance, transNum); // making the balance equal to the updated balance
			balance = balance + amt; // adding the amount to the balance
			transactionUpdate(); // updating the transaction number, if you withdraw nothing it's not a transaction
			lDailyBalanceUpdate(); // updating the lowest daily balance
			
		}
		/****************************************
		* AUTHOR: Kezia Sorensen
		* Date: October 10
		* Description: Withdrawing money from the balance
		* Inputs: double
		* Outputs: None
		****************************************/
		void withdraw(double amt) { // creating a method to calculate withdrawals
			lDailyBalanceUpdate(); // updating the lowest daily balance
			tempBalance = balance; // keeping the balance before calculations
			balance = withdrawUpdate(amt, balance, transNum); // making the balance equal to the updated balance
			balance = balance - amt; // subtracting the amount from the balance
			
			if (tempBalance == balance) { // seeing if there was a difference before and after the withdrawal (if no money was taken out then it isn't a transaction)
				
				}else {
					transactionUpdate(); // updating the transaction number
					lDailyBalanceUpdate(); // updating the lowest daily balance
					
			}
			System.out.println();
			
		}
		/****************************************
		* AUTHOR: Kezia Sorensen
		* Date: October 10
		* Description: Adding one to the transaction counter
		* Inputs: integer
		* Outputs: None
		****************************************/
		void transactionUpdate(){ // call this from the other functions to update the transactions
			++transNum; // adding one to the number of transactions
		}
		
		/****************************************
		* AUTHOR: Kezia Sorensen
		* Date: October 10
		* Description: Displaying all the values at the end of the month
		* Inputs: integer
		* Outputs: None
		****************************************/
		void endOfMonth() { // creating a method to calculate month ends
			
			interest = endOfMonthUpdate(balance, interest); // getting the calculated interest for the account
			System.out.println("");
			balance = (balance + interest); // calculating the balance for the end of the month
			DecimalFormat Currency = new DecimalFormat("#0.00");
			String sBalance= Currency.format(balance); // putting the balance in the right format to be displayed
			System.out.println("Final balance is: $" + sBalance); // displaying the final balance
			System.out.println("so far there are have been " + transNum + " transactions"); // displaying the number of transactions
			String sLDB= Currency.format(lDailyBalance); // putting the lowest daily balance in the right format to be displayed
			System.out.println("The lowest daily balance was $" + sLDB); // displaying the lowest daily balance
			System.out.println("");
		}
		
		/****************************************
		* AUTHOR: Kezia Sorensen
		* Date: October 10
		* Description: Updating the lowest daily balance
		* Inputs: integer
		* Outputs: None
		****************************************/
		void lDailyBalanceUpdate(){ // creating a method to calculate the lowest daily balance
			if (transNum == 0){ // checks if there have been any transactions yet (if there are none the first day's balance is the lowest)
				
			lDailyBalance = balance;
			
		} else if (balance<lDailyBalance) {
				lDailyBalance = balance; // making the lowest daily balance the current balance
				}
		}
}

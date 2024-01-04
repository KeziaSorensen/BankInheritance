
 /****************************************
		* AUTHOR: Kezia Sorensen
		* Date: October 10
		* Description: The parent class that contains the types of transactions
		****************************************/
 public class MinBalance extends Account{
	 
	 /****************************************
		* AUTHOR: Kezia Sorensen
		* Date: October 10
		* Description: Initializing variables
		****************************************/
	MinBalance( double balance) { // creating a constructor to initialize the variables
		super (balance); // getting the balance from the super class
	}
	
	 /****************************************
	* AUTHOR: Kezia Sorensen
	* Date: October 10
	* Description: Returning the balance (this class does not have any special features for deposits)
	* Inputs: double, double, int
	* Outputs: Double
	****************************************/
	double depositUpdate (double amt, double balance, int transNum) { // creating a method to complete calculations for deposits (nothing in this case)
		return balance; // returning the balance
	}
	
	 /****************************************
		* AUTHOR: Kezia Sorensen
		* Date: October 10
		* Description: Subtracting from the balance and updating the number of transactions
		* Inputs: Double, double, integer
		* Outputs: Double
		****************************************/
	double withdrawUpdate(double amt, double balance, int transNum) { // creating a method to check if the withdrawal can go through
		
		if ((balance<amt) || (balance-amt<3)) { // stop them from withdrawing
			System.out.println("You don't have enough money, this transaction cannot be completed");
			balance = balance + amt; // adding the amount to the balance so that when it gets subtracted later the balance stays the same as before 
		} else{
	
		}
		return balance;
		
	}
	
	 /****************************************
	* AUTHOR: Kezia Sorensen
	* Date: October 14
	* Description: Checking which calculation to make at the end of the month and setting the interest value	
	* Inputs: Double, double
	* Outputs: Double
	****************************************/
	double endOfMonthUpdate(double balance, double interest) { // creating a method to make calculations for the end of the month
		
		if (balance > 20000) {
			interest =  (balance * 0.01); //  interest is to be added onto the balance at the end of the month
			
		} else if (balance < 400) {
			interest = -3; 
			
		}
		return interest; //returns the amount that has to be added to the balance
		
	}

}

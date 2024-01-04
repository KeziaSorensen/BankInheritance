
 public class NickelInDime extends Account{
	
	 /****************************************
		* AUTHOR: Kezia Sorensen
		* Date: October 10
		* Description: Initializing variables
		****************************************/
		 NickelInDime( double balance) { // creating a constructor to initialize the variables
			super (balance); // getting the balance from the super class
			
		}
		
		
		 /****************************************
			* AUTHOR: Kezia Sorensen
			* Date: October 10
			* Description: Adding to the balance, taking out the fee, and updating the number of transactions
			* Inputs: Double
			* Outputs: Integer
			****************************************/
		 double depositUpdate (double amt, double balance, int transNum) { // creating a method to send the balance to another method to do the calculations
			 balance = nickleInDimeTransaction( balance, transNum); // making the balance equal to the balance after the fee has been taken away
			 return balance;
			
		}
		 
		 /****************************************
			* AUTHOR: Kezia Sorensen
			* Date: October 10
			* Description: Subtracting the $0.50 fee from the balance			
			* Inputs: Double
			* Outputs: Integer
			****************************************/
		 double nickleInDimeTransaction(double balance, int transNum) { 
				
			 balance = balance - 0.5; // subtracting the fee from the balance
				return balance;
			}
		
		 /****************************************
		* AUTHOR: Kezia Sorensen
		* Date: October 10
		* Description: Checking if the transaction can go through or not
		* Inputs: Double, integer
		* Outputs: Integer
		****************************************/
		double withdrawUpdate(double amt, double balance, int transNum) {

			if (balance-amt>3.5) {
				balance = nickleInDimeTransaction( balance, transNum); // making the balance equal to the balance after the fee has been taken away
				

			} else { // stop them from withdrawing
				System.out.println("You don't have enough money, this transaction cannot be completed");
				balance = balance + amt; // adding the amount to the balance so that when it gets subtracted later the balance stays the same as before 
				
			}
			return balance;
			
		}
		/****************************************
		* AUTHOR: Kezia Sorensen
		* Date: October 14
		* Description: Displaying the current balance, the daily lowest balance, and the number of transactions
		* Inputs: Double, double
		* Outputs: Double
		****************************************/
		double endOfMonthUpdate(double balance, double interest) { // creating a method to make calculations for the end of the month
			
			interest = -3; //  interest is to be added onto the balance at the end of the month
			return interest; //returns the amount that has to be added to the balance
			

			
		}

	}

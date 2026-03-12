
public class CashRegister {
private int cashOnHand; //variable to store the cash
						//in the register

//Default constructor to set the cash
//in the register to 500 cents
//Postcondition: cashOnHand = 500
public CashRegister(){
	cashOnHand = 500;
}


//Constructor with parameters to set the cash in
//the register to a specific amount
//Postcondition: cashOnHand = cashIn
public CashRegister(int cashIn){
	
	if (cashIn >= 0)
		cashOnHand = cashIn;
	else
		cashOnHand = 500;
}

public int currentBalance() {
	//Method to show the current amount in the cash register
	//Postcondition: The value of the instance variable
	// cashOnHand is returned
	return cashOnHand;
}

public void acceptAmount(int amountIn) {
	//Method to receive the amount deposited by
	//the customer and update the amount in the register
	//Postcondition: cashOnHand = cashOnHand + amountIn
	cashOnHand = cashOnHand + amountIn;
}


}

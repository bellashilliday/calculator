// Name: Isabella Shilliday 
// StudentID: 547
// Description: goes through each method and does the operation specified 
// in each method

package cse360assign2;

public class Calculator {

	//variable for total returned  
	private int total;
	StringBuffer history; 
	
	public Calculator () {
		total = 0;  // not needed - included for clarity
	}

    // returns the total at the end of program	
	public int getTotal () {
		return total;
	}
	
	// add operation that adds to the total
	public void add (int value) {
		 total += value; 
		 history.append("+" + value); 
	}
	
	// subtract operation that subtracts from the total
	public void subtract (int value) {
		 total-= value; 
		 history.append("-" + value); 
	}
	
	// multiply operation that multiplies the total
	public void multiply (int value) {
		total *= value; 
		history.append("*" + value); 
	}
	
	// divide operation that divides from the total
	public void divide (int value) {
		if (value==0)
		{
			total = 0; 
		}
		else 
		{
		    total = total / value; 
		    history.append("/" + value); 
		}
	}
	
	// gets the user history 
	public String getHistory () {
		return history.toString();
	}
}
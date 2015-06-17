import java.util.Scanner; //import scanner class for receiving input from console
public class Fibonacci {

	/** Assignment 3 - Patricia Organ 01110489
	 * The Fibonacci numbers are the integer sequence 0,1, 1, 2, 3, 5, 8, 13, 21, ..., 
	 * in which each item is formed by adding the previous two.  An efficient way to output
	 *  a series of numbers in the sequence is to the recurrence relation Fn = Fn-1 + Fn-2, 
	 *  with the first two numbers in the sequence F1 and F2 both defined as 1.  
	 *  Using this recurrence relation write an application that accepts N, where N>=1 from the 
	 *  user and displays the first N numbers in the Fibonacci sequence. 
	 */
	public static void main(String[] args) {
		// declare variables for receiving input and calculations and loops
		int n, toprint;
		int num1 = 1;
		int num2 = 1;
		
		//declare the scanner object and populate the variable n with the integer typed by user
		Scanner input = new Scanner(System.in);
		System.out.print("This program outputs the first N \nnumbers in the Fibonacci sequence\nEnter N: ");
		n = input.nextInt();
		System.out.printf("The first %d numbers of the Fibonacci \nsequence are as follows:\n",n);
		
		// if the value entered is less than 3 or 0/negative value in a switch print predefined values or error
		if(n<=3 ){
			switch(n){
			case 1: System.out.print(n);
				break;
			case 2: System.out.printf("0 %d", num1);				
				break;
			case 3:	System.out.printf("0 %d %d",num1,num2);			
			 	break;
			default: System.out.print("Input Error: Value has to be greater than zero");
				break;
			}//end switch
		}//end if
		
		/* else loop through the remaining sequence until 'n' is reached and print the 
		calculation and move up to the the next set of number for the next iteration */
		else{
			for(int i = 3; i < n; i++){
				
				if(i==3){
					System.out.printf("0 %d %d",num1,num2);
				}//end if
				
				toprint = num1 + num2;
				System.out.printf(" %d",toprint);
				num1 = num2;
				num2 = toprint;
				
			}// end loop
		}//end else

	}//end main method

}// end class

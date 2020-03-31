import java.util.Scanner;

public class ExchangeApp {

	public static void main(String[] args) {
		//declare local variables
		double amount;
		double rate;
		String answer = "yes";
		
		//declare objects 
		Exchange myEx = new Exchange();
		
		do {
		//input
		Scanner sc = new Scanner(System.in);
		System.out.println("\tPlease enter amount to be converted: ");
		amount = sc.nextDouble();
		
		//setMethod to put sc value
		System.out.println("\nPlease enter \nthe conversion rate: ");
		rate = sc.nextDouble();
		
		//setMethod
		myEx.setAmount(amount);
		myEx.setRate(rate);
		myEx.calculation();
		
		//process
		double conv = myEx.getConversion();
		//output
		System.out.println(+ amount + " at a rate of " + rate + " is " + conv);
		System.out.println();
		
		System.out.println("Would you like to try again (yes/no)?");
		answer = sc.next();
		
		}while(answer.equalsIgnoreCase("yes")) ;
		
		if(answer.equalsIgnoreCase("no")) {
		System.out.println("Bye, bye!");
		}	
	}//end main

}//end class

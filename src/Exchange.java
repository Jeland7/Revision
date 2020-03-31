
public class Exchange {

	//declare data members - amount, rate, conversion
	private double amount;
	private double rate;
	private double conversion;
	
	//constructor
	public Exchange() {
		
		}
	
	
	//constructor - amount, rate
	public Exchange(double amount, double rate) {
		this.amount = amount;
		this.rate = rate;
	}
	
	//set methods
	public void setAmount(double amount){
		this.amount = amount;
	}
	
	public void setRate(double rate) {
		this.rate = rate;
	}
	
	//calculation = conversion
	public void calculation() {
		conversion = amount * rate;
	}
	
	//get method return conversion
	public double getConversion() {
		return conversion;
	}
}

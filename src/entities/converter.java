package entities;

public class converter {
	
	public static double EURO = 5.52;
	public static double DOLLAR = 5.21;
	public String currency;
	public double quantity;
	
	public static double euroCalc(double quantity){
		return 5.52 * quantity + 0.06 * 100;
	}
	
	public static double dollarCalc(double quantity) {
		return 5.21 * quantity + 0.06 * 100;
	}
	
}

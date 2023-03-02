package Application;

import java.util.Locale;
import java.util.Scanner;

import entities.converter;

public class currencyConverter {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Witch currency do you want to buy?");
		System.out.printf("Euro %n" + "Dollar %n");
		String currency = sc.nextLine();
		System.out.println("How many " + currency + " will be bought?");
		double quantity = sc.nextInt();
		if(currency.equals("Euro")){
			double euro = converter.euroCalc(quantity);
			System.out.printf("The current value of the euro is: %.2f%n", converter.EURO);
			System.out.printf(quantity + " euros will be bought%n");
			System.out.printf("The value to be paid will be: %.2f%n", euro);
		}
		else if(currency==("Dollar")){
			double dollar = converter.dollarCalc(quantity);
			System.out.printf("The current value of the dollar is: %.2f%n", converter.DOLLAR);
			System.out.printf(quantity + " dollars will be bought%n");
			System.out.printf("The value to be paid will be: %.2f%n", dollar);
		}
		else {
			System.out.print("Currency unavailable");
		}
		
		sc.close();
		
	}

}

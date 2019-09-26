package JavaBasics;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyFormatter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// written an code to convert the currency for the different countries using
		// NumberFormat class
		
		Scanner scan = new Scanner(System.in);
		double d = scan.nextDouble();
		
		Locale indiaLocale = new Locale("en", "IN");
		
		NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
		NumberFormat ita = NumberFormat.getCurrencyInstance(Locale.ITALIAN);
		NumberFormat ch = NumberFormat.getCurrencyInstance(Locale.CHINA);
		NumberFormat fr = NumberFormat.getCurrencyInstance(Locale.FRANCE);
		NumberFormat ind = NumberFormat.getCurrencyInstance(indiaLocale);
		
		System.out.println("US::" +us.format(d));
		System.out.println("Italy::" +ita.format(d));
		System.out.println("China:" +ch.format(d));
		System.out.println("France:" +fr.format(d));
		System.out.println("India:" +ind.format(d));
		
	}

}

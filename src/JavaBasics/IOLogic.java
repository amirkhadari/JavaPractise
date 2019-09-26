package JavaBasics;

import java.util.Scanner;

public class IOLogic {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		scan.nextLine();
		double num2 = scan.nextDouble();
		scan.nextLine();
		String text = scan.nextLine();
		
		
		System.out.println("text: "+text);
		System.out.println("double: "+num2);
		System.out.println("int: "+num);
	}

}

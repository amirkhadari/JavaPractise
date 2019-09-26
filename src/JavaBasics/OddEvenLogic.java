package JavaBasics;

import java.util.Scanner;

public class OddEvenLogic {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		if(num%2==0) {
			if((num>=2)&&(num<=5)) {
				System.out.println("not weird");
			}
			if((num>=6)&&(num<=20)) {
				System.out.println("weird");
			}
			if(num>20) {
				System.out.println("not weird");
			}
		}else {
			System.out.println("weird");
		}

	}

}

package JavaBasics;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int result = 1;
		if(n<=0) {
			System.out.println("Number should be greater than 0");
		}else {
			for(int t=1;t<=n;t++) {
				result = result*t;
			}
			System.out.printf("Factorial of "+n+": "+result);
		}
		
	}

}

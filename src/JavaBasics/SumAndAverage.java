package JavaBasics;

import java.util.Scanner;

public class SumAndAverage {

	public static void main(String[] args) {
		// Here we write a code to calculate the sum and average of the array
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		for(int i=0; i<t; i++) {
			int n = scan.nextInt();
			int arr[] = new int[n];
			for(int j=0;j<n;j++) {
				arr[j] = scan.nextInt();
			}
			int total = 0;
			float average = 0;
			for(int k=0;k<n;k++) {
				total = total+arr[k];
			}
			
			average = (float)total/n;
			System.out.print(total+ " ");
			System.out.printf("%.2f", average);
			System.out.println();
		}
	}

}

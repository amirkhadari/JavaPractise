package JavaBasics;

import java.util.Scanner;

public class BinaryNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
//		String bin = "";
		int s=0,t=0;
		while(n>0) {
//			will stores the remainder in rem variable
			int rem = n%2;
//			Will add the remainder with bin 
//			bin = rem+bin;
//			then Number is divided with 2 to get the second value
			n = n/2;
			if(rem==1) {
				s++;
				if(s>=t) {
					t=s;
				}
			}else {
				s=0;
			}
		}
		System.out.println(s);
	}

}

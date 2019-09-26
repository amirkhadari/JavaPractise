package JavaBasics;

import java.util.Scanner;

public class StringManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Given a string S , of length N that is indexed from 0 to N-1, print its even-indexed 
//		and odd-indexed characters as 2 space-separated strings on a single line 
//		(see the Sample below for more detail).
		
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		for(int i=0; i<t; i++) {
			String s = scan.next();
			char[] word = s.toCharArray();
			for(int j=0; j<s.length(); j++) {
				if(j%2==0) {
					System.out.print(word[j]);
				}
			}
			System.out.print(" ");
			for(int k=0; k<s.length(); k++) {
				if(k%2!=0) {
					System.out.print(word[k]);
				}
			}
			System.out.println();
		}

	}

}

package JavaBasics;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String S = scan.next();
		String rev = "";
		int len = S.length()-1;
		for(int i = len; i>=0;i--) {
			rev = rev + S.charAt(i);
		}
		System.out.println(rev);
//		if(S.equalsIgnoreCase(rev)) {
//			System.out.println("It is a Palindrome String");
//		} else {
//			System.out.println("it is not a Palindrome");
//		}
		System.out.println((S.equalsIgnoreCase(rev)? "Yes":"No"));
	}

}

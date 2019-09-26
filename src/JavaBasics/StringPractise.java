package JavaBasics;

import java.util.Scanner;

public class StringPractise {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		String str1 = scan.next();
		
		int stringlength = str.length()+str1.length();
		System.out.println(stringlength);
		
		for(int i=0;i<str.length() && i<str1.length(); i++) {
			int str1_ch = str.charAt(i);
			int str2_ch = str1.charAt(i);
			
			if(str1_ch!=str2_ch) {
				System.out.println(str1_ch-str2_ch);
			}
		}
		
	}

}

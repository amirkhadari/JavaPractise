package JavaBasics;

import java.util.Scanner;

public class StringPrac2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		// Reads the string from console
		String str1 = scan.next();
		String str2 = scan.next();
		
		//variable sl is used to store the sum of the length of strings
		int sl = str1.length()+str2.length();
		System.out.println(sl);
		
		//compareTo Operator will compare the Strings 
		int s1 = str1.compareTo(str2);
		System.out.println(s1>0? "yes":"no");
		
		//Will convert the first letters of the strings into Uppercase as Given
		str1 = str1.substring(0, 1).toUpperCase()+str1.substring(1,str1.length());
		str2 = str2.substring(0, 1).toUpperCase()+str2.substring(1,str2.length()); 
		
		//Prints the output in console
		System.out.println(str1+ " " +str2);

	}

}

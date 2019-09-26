package JavaBasics;

import java.util.Scanner;

public class Anagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//written an program to check whether two strings are anagrams or nor
		Scanner scan = new Scanner(System.in);
		
		// will take the two input strings 
		String A = scan.nextLine();
		String B = scan.nextLine();
		
		// calculate the length of the strings 
		int Alen = A.length();
		int Blen = B.length();
		
		// will take two dummy integers and initialize with 0 for logic
		int found = 0, notfound = 0;
		
		//if length of the both strings are equal then move to this condition and inner loop
		if(Alen == Blen) {
			
			// here we compare the first character of the first string with all characters of the second string
			for(int i=0;i<Alen;i++) {
				char c1 = A.charAt(i);
				for(int j=0;j<Alen;j++) {
					char c2 = B.charAt(j);
					
					// if any of the character of first string is equal to the characters of the second string then
					// we initialize found = 1; and then break the inner loop
					// for case - insensitive we convert the characters into lower case and then check
					if(Character.toLowerCase(c1) == Character.toLowerCase(c2)) {
						found = 1;
						break;
					} 
				}
				
				//if any of character is not equal to the characters of the second string then we initialize 
				// notfound = 1; and break the outer loop
				if(found == 0) {
					notfound = 1;
					break;
				}
			}
			
			// after breaking of the outer loop, will check whether notfound is equal to 0 (or) 1 
			// if notfound = 1 then the words are NOT ANAGRAMS
			// if notfound = 0 then the words are ANAGRAMS
			// we use conditional operator/ terinary operator for the above logic
			System.out.println((notfound == 1)? "Not Anagrams":"Anagrams");
		}else {
			System.out.println("Not Anagrams");
		}
	}

}

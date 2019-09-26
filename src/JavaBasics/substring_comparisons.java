package JavaBasics;

import java.util.Scanner;

public class substring_comparisons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		int k = scan.nextInt();
		
		String small = "";
		String large = "";
		
		small = large = s.substring(0, k);
		
		scan.close();
		
		int start = s.length()-k;
		
		for(int i=0;i<=start;i++) {
			String str = s.substring(i, (i+k));
			if(small.compareTo(str)>0) {
				small = str;
			}if (large.compareTo(str)<0) {
				large =str;
			}
		}
		System.out.println(small+ "\n" +large);

	}

}

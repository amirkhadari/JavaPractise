package JavaBasics;

public class Logic_1 {

	public static void main(String[] args) {
		for(int i=1500; i<=2700; i++) {
			if((i%7==0)&(i%5==0)) {
				System.out.println(i);
			}
		}
		
		String[] s = new String[2];
				s[0]="Hello";
				s[1]="World";
				System.out.println(s.length);
				System.out.println(s[0].length());
	}

}

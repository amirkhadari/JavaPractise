package JavaBasics;

import java.util.Scanner;

public class PrintSeries {
	
	/*Need to print the series in the form of 
	 * (a+2^0.b),((a+2^0.b)+2^1.b),......((a+2^0.b)+2^1.b+....+2^n-1.b)
	*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int sum = a+b;
            for(int j=1; j<=n;j++) {
            	System.out.print(sum+" ");
            	sum+= (Math.pow(2,j)*b);
            }
            System.out.println();
        }
        in.close();
	}

}

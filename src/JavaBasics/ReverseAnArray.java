package JavaBasics;

import java.util.Scanner;

public class ReverseAnArray {
	
	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = scanner.nextInt();
		int temp;
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }
        for(int j=0; j<n/2; j++) {
        	temp = arr[j];
        	arr[j] = arr[n-j-1];
        	arr[n-j-1] = temp;
        }
        for(int k=0; k<n; k++) {
        	System.out.print(arr[k]+" ");
        }
        scanner.close();

	}

}

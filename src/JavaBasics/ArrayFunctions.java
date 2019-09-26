package JavaBasics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ArrayFunctions {
	
	public int[] sort(int arr[]) {
		for(int i=0; i<arr.length;i++) {
			for(int j=i+1; j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}
	public void printarray(int[] arr) {
		for(int k=0;k<arr.length;k++) {
			System.out.print(arr[k]+" ");
		}
		System.out.println();
			
	}
	public int[] createArray() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter size of an array: ");
		int n = scan.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = scan.nextInt();
		}
		scan.close();
		return a;
	}
	public void pairSum(int[] arr) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Number to find a pair in Array: ");
		int x = scan.nextInt();
		scan.close();
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				int res = arr[i] + arr[j];
				if(res == x) {
					System.out.println("("+arr[i]+","+arr[j]+")");
				}
			}
		}
	}
	public void pairS(int[] arr) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Number to find a pair in Array");
		int x = scan.nextInt();
		int n = arr.length;
		scan.close();
		for(int i=0,j=n-1;i<j;) {
			int res = arr[i] + arr[j];
			if(res>x) {
				j--;
			}
			else if(res<x) {
				i++;

			}
			else {
				System.out.println("("+arr[i]+","+arr[j]+")");
				j--;
			}
		}
	}
	
	public void rotation(int No, int Shift, char c) {
		switch(c) {
			case 'l': System.out.println("Left shift:" +(No<<Shift));
						break;
			case 'r': System.out.println("Right shift:" +(No>>Shift));
						break;
			default: System.out.println("Please Enter only l/r chars");
			
		}
	}
	public int[] arrayLeftRotation(int[] arr, int shift) {
		int n = arr.length-1;
		int temp[] = new int[shift];
		for(int i=0; i<shift;i++) {
			temp[i] = arr[i];
		}
		for(int i=0; i<(arr.length-shift); i++) {
			arr[i]=arr[i+shift];
//			arr[i+shift] = temp[i];
		}
		for(int i=0;i<shift;i++) {
			arr[i+(arr.length-shift)] = temp[i];
		}
		return arr;
 	}
	public int[] arrayRightRotation(int[] arr, int shift) {
		int n = arr.length-1;
		int temp[] = new int[shift];
		for(int i=0; i<shift;i++) {
			temp[i] = arr[i+(arr.length-shift)];
		}
		for(int i=n;i>=shift;i--) {
			arr[i]=arr[i-shift];
		}
		for(int i=0;i<shift;i++) {
			arr[i] = temp[i];
		}
		return arr;
 	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ArrayFunctions af = new ArrayFunctions();
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int n = Integer.parseInt(br.readLine());
//		int s = Integer.parseInt(br.readLine());
//		char c = (char)br.read();
//		af.rotation(n, s, c);
		int[] a = af.createArray();
//		int[] b = af.arrayLeftRotation(a, 6);
		int[] c = af.arrayRightRotation(a, 5);
//		af.printarray(b);
		af.printarray(c);
//		af.printarray(b);
//		int[] c = af.sort(b);
//		af.printarray(c);
//		af.pairSum(c);
//		af.pairS(b);
		
	}

}

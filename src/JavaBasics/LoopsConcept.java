package JavaBasics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LoopsConcept {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter an Integer");
		final int a = Integer.parseInt(br.readLine());
		System.out.println("Enter an Another Integer");
		final int b = Integer.parseInt(br.readLine());
		 do {
			System.out.println("Hello");
		}while(a<b);
		System.out.println("HI");
	}

}

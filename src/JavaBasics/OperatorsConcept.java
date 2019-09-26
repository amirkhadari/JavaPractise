package JavaBasics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OperatorsConcept {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter an Integer");
		int x = Integer.parseInt(br.readLine());
			switch(x) {
			case 1:
				System.out.println("lights");
				break;
			case 2:
				System.out.println("camera");
				break;
			case 3:
				System.out.println("action");
				break;
			default:
				System.out.println("cut");
				break;	
		}
	}

}

package DataStructures;

import java.util.HashMap;
import java.util.Map;

public class Dictionaries_Maps {

	public static void main(String[] args) {
		// Will develop a program to define family relationship
		
		Map<String, String> famRelations = new HashMap<String, String>();
//		Inserting the data of family relations in Maps
		famRelations.put("Father", "S.B.A Khadari");
		famRelations.put("Mother", "Ahamadunnisa");
		famRelations.put("Younger Brother", "Afrid");
		famRelations.put("Very Younger Brother", "Arshad");
		
//		Retrieve the data
		
		System.out.println(famRelations.get("Father"));
		System.out.println(famRelations.get("Mother"));
		System.out.println(famRelations.get("Younger Brother"));
		System.out.println(famRelations.get("Very Younger Brother"));
		
//		Will print the all values of keys
		System.out.println(famRelations.keySet());
		
//		Will print the all values of values
		System.out.println(famRelations.values());
		
//		To print key-value pair 
		System.out.println(famRelations.toString());
		
//		will clear the data from the set famRelations
		famRelations.clear();
		
//		will check that map is empty or not
		System.out.println(famRelations.isEmpty());
		

	}

}

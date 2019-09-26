package DataStructures;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Maps_Practise {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		Map<String, Long> phoneBook = new HashMap<String, Long>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for(int i=0; i<t;i++) {
			String key = br.readLine();
			long value = Long.parseLong(br.readLine());
			phoneBook.put(key, value);
		}
		String name = br.readLine();
		String cont = phoneBook.entrySet().toString();
		System.out.println(cont);
		
		
		
//		System.out.println(pair);
//		if(name==pair) {
//			String[] phn = pair.split("=");
//			System.out.println(phn[0]);
//		}

	}

}

package DataStructures;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		Map<String, Long> PBook = new HashMap<String, Long>();
		
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            long phone = in.nextInt();
            PBook.put(name, phone);
            // Write code here
        }
        while(in.hasNext()){
            String name = in.next();
            // Write code here
//            String name = PBook.entrySet().toString();
//            System.out.println(PBook.containsKey(name));
            System.out.println(PBook.get(name));
            if (PBook.containsKey(name)) {
                Long phone = PBook.get(name);
                System.out.println(name + "=" + phone);
            } else System.out.println("Not found");
        }
        in.close();

	}

}

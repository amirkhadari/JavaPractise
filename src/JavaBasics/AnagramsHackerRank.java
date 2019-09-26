package JavaBasics;

import java.util.Scanner;

public class AnagramsHackerRank {
	
	static boolean isAnagram(String a, String b) {
        // Complete the function
        int alen = a.length();
        int blen = b.length();

        boolean found = false, notfound = false;

        if(alen == blen){
            for(int i=0; i<alen; i++){
                char c1 = a.charAt(i);
                for(int j=0; j<alen; j++){
                    char c2 = b.charAt(j);
                    if(Character.toLowerCase(c1)==Character.toLowerCase(c2)){
                        found = true;
                        break;
                    }
                }
                if(found == false){
                    notfound = true;
                    break;
                }
            }
            return found;
        }else
        {
            return notfound;
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );

	}

}

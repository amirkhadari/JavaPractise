package JavaBasics;

import java.util.ArrayList;
import java.util.List;

public class SimpleArraySum {
	
	
//		static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
//			int alicetotalscore=0, bobtotalscore = 0;
//			final int SIZE=3;
//			for(int i=0;i<SIZE;i++) {
//				int alicescore=a.get(i);
//				int bobscore=a.get(i);
//				if(alicescore>bobscore) {
//					alicetotalscore++;
//				}else {
//					bobtotalscore++;
//				}
//				
//			}
//			List<Integer> result = new ArrayList<>();
//			result.add(alicetotalscore);
//			result.add(bobtotalscore);
//			return result;
//	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//			System.out.println('\u00FE');
//			System.out.println("\u00FA");
//			System.out.println("\u00EA");
//			System.out.println("\u00FF");
//			System.out.println(10%9);
			String s1 ="HYBRID";
			char[] s1ToArray = s1.toCharArray();
			String s2 = "hybrid";
			String copyOfs1 = s1.toLowerCase();
			String copyOfs2 = s2.toLowerCase();
			boolean status = true;
			for (char c : s1ToArray)
            {
                int index = copyOfs2.indexOf(c);
 
                if(index != -1)
                {
                    //If character is present in copyOfs2, removing that char from copyOfs2
 
                    copyOfs2 = copyOfs2.substring(0, index)+copyOfs2.substring(index+1, copyOfs2.length());
                    System.out.println(copyOfs2);
                }
                else
                {
                    //If character is not present in copyOfs2, setting status as false and breaking the loop
 
                    status = false;
 
                    break;
                }
            }
	}

}

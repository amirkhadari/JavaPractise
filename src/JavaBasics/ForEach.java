package JavaBasics;

public class ForEach {

	public static void main(String[] args) {
		int[][][] x = {{{10,20,30,40,50},{60,70,80,90}},{{1,2,3,4,5},{6,7,8,9,0},{34,45,56}}};
		for(int i=0; i<x.length;i++) {
			for(int j=0;j<x[i].length;j++) {
				for(int k=0;k<x[i][j].length;k++) {
					System.out.println(x[i][j][k]);	
				}
			}
		}
		System.out.println("*****************");
		for(int[][] x1:x) {
			for(int[] x2:x1) {
				for(int x3: x2)
				System.out.println(x3);
			}
		}
	}

}

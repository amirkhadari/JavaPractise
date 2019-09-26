package JavaBasics;

public class AO_DO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//written an program arranging the array elements in ascending and descending order
		int A[] = {90,44,56,23,75,03,64,83,34,13};
		int B;
		
		for(int i=0;i<A.length-1;i++) {
			for(int j=i+1;j<A.length;j++) {
				if(A[i]>A[j]) {
					B = A[i];
					A[i] = A[j];
					A[j] = B;
				}
			}
		}
		System.out.println("Ascending Order");
		for(int k=0;k<(A.length-1);k++) {
			System.out.print(A[k]+", ");
		}
		System.out.print(A[A.length-1]);
	}

}

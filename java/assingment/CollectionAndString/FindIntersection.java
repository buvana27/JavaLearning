package assignment.CollectionAndString;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] A={3,2,11,4,6,7};
		int []	B= {1,2,8,4,9,7};
		for(int i=0;i<A.length;i++) {
			for(int j=0;j<B.length;j++) {

				if(A[i]==B[j]) {
					System.out.print(A[i]+" ");
				}


			}
		}
	}
}

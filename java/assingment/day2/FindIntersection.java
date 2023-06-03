package assingment.day2;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] a= {5,6,7,8,2,3,5,6};
		int [] b= {6,7,3,4,9,8,5};
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b.length;j++) {
				if(a[i]==b[j]) {
					System.out.print(a[i]+" ");
				}

			}
		}
	}
}

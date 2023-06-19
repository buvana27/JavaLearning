package assignment.CollectionAndString;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input="changename";
		char[] A=input.toCharArray();
		for(int i=0;i<A.length;i++) {
			if(i%2==0) 
			{
				A[i]=Character.toUpperCase(A[i]);
			}else
			{
				A[i]=Character.toLowerCase(A[i]);
			}
			System.out.print(A[i]);
		}
	}

}
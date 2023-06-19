package assignment.CollectionAndString;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input="paypal India";
		char[] input1=input.toCharArray();
		System.out.println(input1);
		Set<Character> charSet=new HashSet<Character>();
		Set<Character> dupcharset=new HashSet<Character>();
		for(int i=0;i<input1.length;i++) {
			boolean add=charSet.add(input1[i]);
			if(!add) {
				dupcharset.add(input1[i]);
			}
		}
		System.out.println(charSet);
		System.out.println("Duplicate words "+dupcharset);
	}


}

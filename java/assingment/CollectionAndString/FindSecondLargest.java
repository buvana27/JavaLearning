package assignment.CollectionAndString;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = {3,2,11,4,6,7,2,3,3,6,7};
		TreeSet<Integer> d1=new TreeSet<Integer>();
		
		
		for(int i=0;i<data.length;i++) {
			d1.add(data[i]);
		
		}	
		List<Integer> d2=new ArrayList<Integer>();
		System.out.println(d1);
		d2.addAll(d1);
		System.out.println("The size of array :"+d2.size());
		System.out.println(d2.get(d2.size()-2));  //the size array is 6 we minus 2 size form array to find the second largest
	}

}

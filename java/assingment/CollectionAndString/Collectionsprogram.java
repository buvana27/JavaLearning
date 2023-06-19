package assignment.CollectionAndString;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Collectionsprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num= {8,9,10,1,2,4,5,6,7,2,4,5,6,7};
		Set<Integer> num1=new TreeSet<Integer>();
		
		for(int i=0;i<num.length;i++) {
			num1.add(num[i]);
			
		}
		List<Integer> num2=new LinkedList<Integer>(num1);
		System.out.println(num1);
        int size=num1.size();
		for(int i=0;i<size;i++) {
		if(num2.get(i)!=i+1)	
			{
			System.out.println(i+1);
			break;
			}
			
		}
	}

}

package assignment.CollectionAndString;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SortingUsingCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] input= {"HCL"," Wipro",  "Aspire Systems", "CTS"};
Set<String> cn=new TreeSet<String>();  
for (int i = 0; i < input.length; i++) {
cn.add(input[i]);
	
}
	System.out.println(cn);

List<String> cn1=new LinkedList<String>(cn);
for(int i=cn1.size()-1;i>=0;i--) {  //
	for(int j=0;j<i;j++) {
	
		
	}
System.out.print(cn1.get(i)+" ");
}

	}
	

}

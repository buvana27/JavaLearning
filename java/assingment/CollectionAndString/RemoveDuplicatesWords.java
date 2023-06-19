package assignment.CollectionAndString;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "We learn java basics as part of java sessions in java week1";
         String[] stringtext = text.split(" ");//want to conform
        Set<String> textset=new LinkedHashSet<String>();
       for(int i=0;i<stringtext.length;i++) {
    	   textset.add(stringtext[i]);
       }
    	 System.out.println("Removedduplicate set :"+textset);  
    	 for (String stringtext1 :textset ) {
    		 System.out.print(stringtext1+" ");
			
			
		}
	}

}

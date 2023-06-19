package assignment.CollectionAndString;

import java.util.Iterator;

public class RemoveDuplicated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "We learn java basics as part of Java sessions in java week1";
		int count = 0;//   0    1    2   3      4  5     6  7    8        9   10  11
		String[] teststr=	text.split(" ");
		for (int i = 0; i < teststr.length; i++) {
			for (int j = i+1; j < teststr.length; j++) {
				if(teststr[i].equalsIgnoreCase(teststr[j])){
					teststr[j]="";
					count++;
				}if(count>1) {
					teststr[i].equals(" ");	
				}
			}
			System.out.print(teststr[i]+ " ");

		}
	}


}

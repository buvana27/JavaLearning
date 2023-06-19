package assignment.CollectionAndString;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class PrintUniqueCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="Buvaneshwari"; //Buvaneshwri
		char[] ch = name.toCharArray();
		Set<Character> name1=new TreeSet<Character>();

		for(int i=0;i<ch.length;i++) {
			name1.add(ch[i]);
		}
		System.out.println(name1);
		System.out.print("PrintUniqueCharacter:");
		for(Character name2 : name1)
			System.out.print(name2);

	}
}






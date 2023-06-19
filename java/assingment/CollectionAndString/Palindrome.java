package assignment.CollectionAndString;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="madam";
		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
			rev	+=str.charAt(i);	
		}
		if(str.equalsIgnoreCase(rev)) {
			System.out.println("The given string "+ str +" is palindrome");
		}else
			System.out.println("The given string "+ str +" is not palindrome");
	}

}

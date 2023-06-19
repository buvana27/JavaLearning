package assignment.CollectionAndString;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "I am a software tester"; 

		String[] teststr = test.split(" ");
		//System.out.println(teststr);
		
		for (int i = 0; i <=teststr.length-1; i++) {
			if(i%2!=0) {
				char[] charArray = teststr[i].toCharArray();
				
				for (int j = charArray.length-1; j >=0 ; j--) {
					
					System.out.print(charArray[j]);
				}
					
				}
			else {
				
				System.out.print(" ");
				System.out.print(" "+teststr[i]+" ");
			}
			}
			
			
	}
}



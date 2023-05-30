package assingment.day1;

public class PrimeNumber {
	public static void main(String[] args) {
		int num=4;
		int rem;
		boolean prime=true;
		
		for(int i=2;i<num;i++)  
		{
			rem=num%2;
			if(rem==0)
			prime =false;
		}
			
		if(prime==true)	
		{
			System.out.println(num +" is prime ");
			
		}else
			System.out.println( num +" number is not prime");
	}

}



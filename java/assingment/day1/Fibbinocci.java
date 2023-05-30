package assingment.day1;

public class Fibbinocci {
	public static void main(String[] args) {
		int n =50;
		int n1=0;
		int n2=1;
		System.out.println("fibbinocci series of "+ n);
		for(int i=1;i<=n;++i)
		{
			
			System.out.println(" "+n1);
			int n3=n1+n2; //0+1
			n1=n2;//n1=1
			n2=n3;//n2=0+1
		}
	}

}

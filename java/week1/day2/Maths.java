package week1.day2;

public class Maths {

	public int add(int a,int b) {
		return a+b;
	}
	public int sub(int a,int b) {
		return a-b;
	}
	public int div(int a,int b) {
		return a/b;
	}

	public static void main(String[] args) {
		Maths mref =new Maths();
		int add = mref.add(5, 10);
		System.out.println("Addition of a and b :"+add);
		System.out.println("subtraction of a and b: " +mref.sub(10, 5));
		int div = mref.div(15, 3);
		System.out.println("division of a and b: " +div);
	}

}
//f3 or right click the operation

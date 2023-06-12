package bank;

public class AxisBank extends BankInfo {
	
	public void saving()
	{
		System.out.println("The saving account");
	}
	public void fixed()
	{
		System.out.println("The fixed account");
	}
	public void deposit()
	{
		System.out.println(" Axis deposit account");	
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AxisBank ab=new AxisBank();
		ab.deposit();
		

	}

}

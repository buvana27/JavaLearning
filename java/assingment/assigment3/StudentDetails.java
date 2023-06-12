package assigment3;


public class StudentDetails {
	
	public void getStudentInfo(int id) {
		System.out.println("student id is :"+id );
	}
	public void getStudentInfo(int id,String Name) {
		System.out.println("student id is : "+ id + " And student name is :"+Name);
	}
	public void getStudentInfo(String email,long phone) {
		System.out.println("student email is :"+email+" And student phone is :"+phone);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentDetails sd=new StudentDetails();
		sd.getStudentInfo(18);
		sd.getStudentInfo(18, "Buvi");
		sd.getStudentInfo("buvi@gmail.com", 9988776655l);
		
		

	}

}

package org.student;

import org.department.Department;

public class Student extends Department {
	 public void studentName() {
		 System.out.println("The collage name is Buvi");
		 
	 }
	 public void studentDept() {
		 System.out.println("The collage name is ECE");
		 
	 }
	 public void studentId() {
		 System.out.println("The collage name is 18");
		 
	 }

	public static void main(String[] args) {
		Student st=new Student();
		st.collegeCode();
		st.collegeName();
		st.collegeRank();
		st.deptName();
		st.studentDept();
		st.studentId();
		st.studentName();
		 
	}

}

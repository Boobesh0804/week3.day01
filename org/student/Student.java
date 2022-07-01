package week3.day1.org.student;

import week3.day1.org.department.Department;

public class Student extends Department{
	
	
	
	public void studentName() {
	 
		System.out.println("Boobesh");
		
	}
	
	public void studentDept() {
		System.out.println("B.com");
	}
	
	private void studentId() {

		System.out.println("130p13");
	}
	

	
	
	public static void main(String[] args) {
		
		Student st = new Student();
		
		st.collegeName();
		st.collegeCode();
		st.collegeRank();
		st.deptName();
		st.studentName();
		st.studentDept();
		st.studentId();
		
		
	}
	
	

	

}

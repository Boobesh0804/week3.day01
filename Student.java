package week3.day1;

public class Student {
	
	
	public int getStudentInfo(int id) {
		return id;

	}


	public void getStudentInfo(int  id, String name) {
		
		System.out.println(id + " " + name);

		
		}
	
	public  void getStudentInfo(String email, long phoneNumber) {
		
		System.out.println(email +"  " +phoneNumber);
	}
	
	
	public static void main(String[] args) {
		Student get = new Student();
		
          get.getStudentInfo(123, "Boobesh");
          System.out.println(get.getStudentInfo(123));
          get.getStudentInfo("boobesh.kobo@gmail.com", 80561190345l);
	
		 
		
		
	
	}
	
}



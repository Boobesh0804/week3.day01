package week3.day1.org.system;

public class Desktop extends Computer {
	
	public float decktopSize() {
		return 5.55f;
	}

	public static void main(String[] args) {
		
		Desktop dk =new Desktop();
		dk.computerModel();
		dk.decktopSize();
		System.out.println(dk.computerModel());
	}
	

}

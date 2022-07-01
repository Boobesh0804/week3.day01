package week3.day1;

public class auto extends Vehicle {
	
	public boolean turnOnMeter() {
		return false;
	}
	
	public boolean handStart() {
		return false;
	}
	
	public static void main(String[] args) {

		auto au =new auto();
		
		au.applyBreak();
		au.soundHorn();
	}

}

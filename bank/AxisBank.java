package week3.day1.bank;

import org.apache.poi.hssf.record.aggregates.PageSettingsBlock;

public class AxisBank extends bankInfo{
	

	
	public void deposit() {
		
		System.out.println("new deposit acc");
		
	}

	public static void main(String[] args) {
		
		AxisBank  ab = new AxisBank();
	
		ab.saving();
		ab.fixed();
		ab.deposit();
		//ab.getStudentInfo(123);
		
		
		
		
	}
}

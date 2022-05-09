package Nivell_1_1;

public class NoGenericMethods {
	
	Month month1;
	Month month2;
	Month month3;
	
	public NoGenericMethods(Month month1, Month month2, Month month3) {
		
		
		this.month1=month1;
		this.month2=month2;
		this.month3=month3;
	}
	
	/*public NoGenericMethods(String month1, String month2, String month3) {
		
		this.month1=new Month(month1);
		this.month2=new Month(month2);
		this.month3=new Month(month3);
		
	}*/

	public Month getMonth1() {
		return month1;
	}

	public void setMonth1(Month month1) {
		this.month1 = month1;
	}

	public Month getMonth2() {
		return month2;
	}

	public void setMonth2(Month month2) {
		this.month2 = month2;
	}

	public Month getMonth3() {
		return month3;
	}

	public void setMonth3(Month month3) {
		this.month3 = month3;
	}

	@Override
	public String toString() {
		return "NoGenericMethods [getMonth1()=" + getMonth1() + ", getMonth2()=" + getMonth2() + ", getMonth3()="
				+ getMonth3() + "]";
	}
}

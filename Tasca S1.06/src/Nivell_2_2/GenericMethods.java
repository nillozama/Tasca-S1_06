package Nivell_2_2;

public class GenericMethods {
	
	public <T> void varArgs(Object...t) {
		
		for(Object o:t) {
			System.out.println(o.toString());
		}
	}
}

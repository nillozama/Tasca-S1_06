package Nivell_2_1;

public class Principal61N2 {

	public static void main(String[] args) {
		
		GenericMethods genericMethods=new GenericMethods();
		
		Persona persona=new Persona ("Eva", "Fort", 1);
		int number=6;
		String name="Victor";
		float numFloat=6.2f;
		char lletraA='A';

		System.out.println("Comprobación 1");
		genericMethods.generic(name, persona, number);
		
		System.out.println("\nComprobación 2");
		
		genericMethods.generic(String.valueOf(numFloat), "Hola", number);
		
		System.out.println("\nComprobación 3");
		
		genericMethods.generic(String.valueOf(lletraA), numFloat, persona);
	}
}

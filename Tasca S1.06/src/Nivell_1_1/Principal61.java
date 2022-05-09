package Nivell_1_1;

public class Principal61 {

	public static void main(String[] args) {
		
		Month month1=new Month("Agosto");
		Month month2=new Month("Abril");
		Month month3=new Month("Julio");
		
		NoGenericMethods ngm=new NoGenericMethods(month1, month2,month3);
		
		System.out.println(ngm);
		
		NoGenericMethods ngm2=new NoGenericMethods(month2, month3,month1);
		
		System.out.println(ngm2);
		
		NoGenericMethods ngm3=new NoGenericMethods(month3, month1,month2);
		
		System.out.println(ngm3);

		
		/*NoGenericMethods ngm=new NoGenericMethods("Agosto", "Abril","Julio");
		
		System.out.println(ngm);
		
		NoGenericMethods ngm2=new NoGenericMethods("Abril", "Julio","Agosto");
		
		System.out.println(ngm2);
		
		NoGenericMethods ngm3=new NoGenericMethods("Julio", "Agosto","Abril");
		
		System.out.println(ngm3);*/
		
	}
}

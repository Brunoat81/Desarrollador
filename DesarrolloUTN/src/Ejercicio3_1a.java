
public class Ejercicio3_1a {

	public static void main(String[] args) {
		
		 System.out.println ("Ejercicio 1 a:");
			
			String ejerCicio = "Un ejercicio de rutina de Java";
			
			int coNt = 0;
			char leTra = 'a';
			char ejercicioLetra = 'a';
			
			for (int c = 0; c < ejerCicio.length(); c++) {
				ejercicioLetra = ejerCicio.charAt(c);
				if (ejercicioLetra == leTra) {
					coNt++;
				}	    
			}
			
			System.out.println(coNt);
			
			//intenté realizar el ejercicio sin charAt por un lado, y por otro con indexOf, pero no pude resolverlo, al menos de momento de esa manera
		
			
			

	}

}

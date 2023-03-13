
public class Ejercicio3_1c {

	public static void main(String[] args) {
		
		 System.out.println ("Ejercicio 1 c:");
	        
	        int vecTor [] = {40, 60, 90, 100, 50, 20};
	        int nuMero = 50;
	        int suMa = 0;
	        int numaSumar = 0;
	        
	        for (int a = 0; a < vecTor.length; a++) {
	        	numaSumar = vecTor [a];
	        	if (numaSumar < nuMero) {
	        		suMa = numaSumar + suMa;
	        	}
	        }
	        
	        System.out.println("El resultado del ejercicio es:" + suMa);

	}

}

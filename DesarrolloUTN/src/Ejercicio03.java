import java.util.Arrays;
import java.util.Collections;

public class Ejercicio03 {

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
		
		System.out.println ("Ejercicio 1 b. Camino largo:");
        
        int unArray [] = {109, 80, 24};
        int orDen [] = new int [3];
        
        
        if ((unArray [0] < unArray [1]) && (unArray [0] < unArray [2])) {
        	orDen [0] = unArray [2];
        	orDen [1] = unArray [1];
        	orDen [2] = unArray [0];
        } else if ((unArray [0] > unArray [1]) && (unArray [1] > unArray [2])) {
        	orDen [0] = unArray [0];
        	orDen [1] = unArray [1];
        	orDen [2] = unArray [2];
        } else if ((unArray [0] < unArray [1]) && (unArray [1] > unArray [2])) {
        	orDen [0] = unArray [1];
        	if (unArray [0] > unArray [2]) {
        	   orDen [1] = unArray [0];
        	   orDen [2] = unArray [2];
        	}
        	} else if (unArray [0] < unArray [2]) {
        		orDen [1] = unArray [2];
        		orDen [2] = unArray [0];
        } else if ((unArray [0] > unArray [1]) && (unArray [1] < unArray [2])) {
        	orDen [2] = unArray [1];
        	if (unArray [0] > unArray [2]) {
        		orDen [0] = unArray [0];
        		orDen [1] = unArray [2];
        	} else if (unArray [0] < unArray [2]) {
        		orDen [0] = unArray [2];
        		orDen [1] = unArray [0];
        	}
        }
	
        System.out.println ("De mayor a menor:");
        System.out.println (orDen[0]);
        System.out.println (orDen [1]);
        System.out.println (orDen [2]);
        
        System.out.println("Ejercicio 1 b. Camino corto:");
        
        Integer arrAy [] = {4, 8, 16};
        boolean maYormenor = true;
        
        if (maYormenor) {
        	Arrays.sort(arrAy);
        }
        
        System.out.println ("De menor a mayor:");
        
        for (int numeros : arrAy) {
        	System.out.println (numeros);
        }
        
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

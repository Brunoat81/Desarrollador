import java.util.Arrays;

public class Ejercicio3_1b {

	public static void main(String[] args) {
		
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
	}
}

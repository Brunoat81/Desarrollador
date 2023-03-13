package src;
import java.util.Arrays;

public class Ejer4 {

	private static Integer enOrden (Integer [] numAordenar) {
        
		boolean maYormenor = true;
        int numEros = 0;
        
        if (maYormenor) {
        	Arrays.sort(numAordenar);
        }
        
        System.out.println ("De menor a mayor:");
        
        for (int numeros : numAordenar) {
        	numEros = numeros;
        }
        
        return numEros;
		

	}

}

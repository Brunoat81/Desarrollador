import java.util.Arrays;
import java.util.Scanner;

public class ejer4 {
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
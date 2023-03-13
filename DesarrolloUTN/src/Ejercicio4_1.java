import java.util.Arrays;

public class Ejercicio4_1 {

	public static void main (String [] args) {char A = 'A';int[] arrAy = new int [] {3, 87, 43};
		
        boolean maYormenor = true;
        
        if (maYormenor) {
        	Arrays.sort(arrAy);
        }
        System.out.println (A);
        System.out.println ("De menor a mayor:");
        
        for (int numeros : arrAy) {
        	System.out.println (numeros);

	}
	}
}



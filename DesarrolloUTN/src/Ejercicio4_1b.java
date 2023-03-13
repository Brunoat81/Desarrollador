import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio4_1b {

	public static void main (String [] args){//puedo pasar como argumento: char A = 'A' pero al momento de ejecutar System.out.println (A) no me reconoce la variable...
		
	
    boolean maYormenor = true;
    
    Scanner scn = new Scanner (System.in);
    
    System.out.println("Ingrese tres números (separados por un espacio):");
    
    String num  = scn.nextLine();
    
    String numEro [] = num.split(" ");
    
    long numeroAordenar [] = new long [3];
    
    for (int i = 0; i < numEro.length; i++) {
    	numeroAordenar [i] = Integer.parseInt(numEro[i]);
    }
    
    if (maYormenor) {
    	Arrays.sort(numeroAordenar);
    }
    
    System.out.println ("De menor a mayor:");
    
    for (long numeros : numeroAordenar) {
    	System.out.println (numeros);
    }
    
    scn.close();	
	}
}


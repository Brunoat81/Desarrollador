import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio4_1c {

	public static void main (String [] args){char A = 'A';int[] arrAy = new int [] {0, 0, 0};
		
	    boolean maYormenor = true;
	    
	    System.out.println (A);
	    
	    Integer numeroAordenar [] = new Integer [3];
	    
	    for (int h = 0; h < arrAy.length; h++) {
	    	  if ((arrAy [0] != 0) || (arrAy [1] != 0) || (arrAy [2] != 0)) {
	    		  numeroAordenar [h] = arrAy [h];
	    	} else {
	    		numeroAordenar [h] = porConsola(numeroAordenar);
	    		 System.out.println (numeroAordenar[h]);   	    
	        }
	    	 
	    }
	    
	    if (maYormenor) {
	    	Arrays.sort(numeroAordenar);
	    }
	    
	    System.out.println ("De menor a mayor:");
	    
	    for (int numeros : numeroAordenar) {
	    	System.out.println (numeros);
	    }
	}
	    	
	private static Integer porConsola (Integer [] numAordenar) {
			
			Scanner scn = new Scanner (System.in);
		    
		    System.out.println("Ingrese tres números (separados por un espacio):");
		    //una vez que se cumple el ciclo, vuelve a pedir ingresar tres números nuevamente, no entiendo porque vuelve a entrar al ciclo una vez finalizado
		    String num  = scn.nextLine();
		    
		    String numEro [] = num.split(" ");
		    
		    boolean maYormenor = true;
			
		    for (int i = 0; i < numEro.length; i++) {
		    	numAordenar [i] = Integer.parseInt(numEro[i]);
		    }
			
		    if (maYormenor) {
		    	Arrays.sort(numAordenar);
		    }
		    
		    scn.close();
		    
		    System.out.println ("De menor a mayor:");
		    
		    for (Integer numeros : numAordenar) {
		    	System.out.println (numeros);
		    }

		   scn.close();
		   
		   return null;//no puedo encontrar la forma de que no aparezca null en el resultado
	    
		}
	}


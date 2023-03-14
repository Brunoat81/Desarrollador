import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio4_3 {
//no puedo desarrollar el ejercicio, no entiendo como se trabaja con los parametros, como se hace para declararlos
	
	public static void main(String [] args) {
		
		String otraOpcion = "estoy muy bien";
        System.out.println (otraOpcion);
        
        char caracTeres [] = otraOpcion.toCharArray();
        int caracTeresCod [] = new int [14];
        int valorAscii = 'a';
        char leTra = (char)valorAscii;
        
        System.out.println("Mensaje codificado:");
        
        for (int i = 0; i < caracTeres.length; i++) {
        	valorAscii = caracTeres [i];
        	caracTeresCod [i] = valorAscii + 3;
        	System.out.println(caracTeresCod[i]);
        }
        
        System.out.println("Mensaje descodificado:");
        
        for (int i = 0; i < caracTeresCod.length; i++) {
        	valorAscii = caracTeresCod [i];
        	valorAscii = valorAscii - 3;  
        	leTra = (char)valorAscii;
        	System.out.println(leTra);
        }  	
		return;
	}
}

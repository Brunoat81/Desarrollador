import java.util.Base64;

public class Ejercicio3_2 {

	public static void main(String[] args) {
		
        System.out.println ("Ejercicio 2:");//esta forma de resolverlo la encontré en internet y me pareció interesante utilizarla como manera rápida y efectiva de resolver
        
        String ejerCicio = "hola que tal";
        
        String codiFicado = Base64.getEncoder().encodeToString(ejerCicio.getBytes());
        
        System.out.println ("String codificado:" + codiFicado);
        
        byte decodiFicado [] = Base64.getDecoder().decode(codiFicado);
        
        String nuevoString = new String (decodiFicado);
        
        System.out.println ("String codificado y descodificado:" + nuevoString);
		
        
        System.out.println ("Ejercicio 2:");
        
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
        
	}
}

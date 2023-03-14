import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Ejercicio4_2a {//no puedo encontrar la manera de ingresar por parametros sin que me de error en la sintaxis

	public static void main(String[] args) {Scanner scn = new Scanner (System.in);
    
    System.out.println("Ingrese m para multiplicar, s para sumar:");
    
    String opcIon  = scn.nextLine();
    
    scn.close();
		
	String rutaAbsoluta = "/home/BruPauWay/git/Desarrollador/DesarrolloUTN/Archivotexto.txt";
	
	Path pathDelArchivo = Paths.get(rutaAbsoluta);
	
    
	try {	
		
		int mulTi = 1;
		int suMa = 0;	
		
		if (opcIon.charAt(0) == 's') {
		for(String linea : Files.readAllLines(pathDelArchivo)) {
			Integer nUm = Integer.parseInt(linea);
			suMa = nUm + suMa;
		}
		
		System.out.println (suMa);
		
		} else if (opcIon.charAt(0) == 'm'){
			for(String otralinea : Files.readAllLines(pathDelArchivo)) {
				Integer numEro = Integer.parseInt(otralinea);
				mulTi = numEro * mulTi;
			} 
			
		System.out.println (mulTi);
			
		}
		
	
	    }catch (IOException e) {
		e.printStackTrace();
	} 
}
}


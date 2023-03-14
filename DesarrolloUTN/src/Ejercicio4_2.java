
	import java.io.IOException;
	import java.nio.file.Files;
	import java.nio.file.Path;
	import java.nio.file.Paths;

public class Ejercicio4_2 {
	
	public static void main(String[] args) {String rutaAbsoluta = "/home/BruPauWay/git/Desarrollador/DesarrolloUTN/Archivotexto.txt";
		//tengo dificultad para pasarlo como parámetro, no me toma luego dentro del for el "pathDelArchivo"
		Path pathDelArchivo = Paths.get(rutaAbsoluta);
		
		try {	
			int suMa = 0;
			
			for(String linea : Files.readAllLines(pathDelArchivo)) {
				Integer nUm = Integer.parseInt(linea);
				suMa = nUm + suMa;
			}
			
			System.out.println (suMa);
			
		}catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}

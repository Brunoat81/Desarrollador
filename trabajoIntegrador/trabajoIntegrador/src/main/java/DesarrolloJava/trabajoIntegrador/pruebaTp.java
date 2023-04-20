package DesarrolloJava.trabajoIntegrador;
		
import java.io.FileReader;		
import java.io.IOException;		
import java.util.List;
import com.opencsv.bean.CsvToBeanBuilder;
		
import modelo.Partidos;		
import modelo.Pronosticos;

		
public class pruebaTp {
		    
	public static void main(String[] args) {
		       
		        if(args.length == 0){
		            System.out.println("ERROR: No ingresaste ningún archivo como argumento!");
		            System.exit(88);
		        }

		        List <Partidos> listaDePartidos;
		        List <Pronosticos> listaDePronosticos;
		        
		        
		        
		        try {
		          
		        	listaDePartidos = new CsvToBeanBuilder<Partidos>(new FileReader(args[0]))	
		        			.withSkipLines(0)
		                    .withType(Partidos.class)
		                    .build()
		                    .parse();
		        	
		        	listaDePronosticos = new CsvToBeanBuilder<Pronosticos>(new FileReader(args[1]))	
		        			 .withSkipLines(0)
			        		 .withType(Pronosticos.class)
			        		 .build()
			        		 .parse(); 
		            
			        int sumatoria = 0;
		        	
		        for (Pronosticos pronosticos : listaDePronosticos) {
			        String gana = null;
			        
		              for (Partidos partidos : listaDePartidos) {
		                 String ganador = null;
		                 String ganador1 = null;	                
		                       
		                if (partidos.getGolesEquipoA() > partidos.getGolesEquipoB()) {
		                	ganador = partidos.getEquipoA();
		                    System.out.println ("El ganador es: " + ganador);
		                    if (pronosticos.getGanaEquipoA().equals("x")) {
	                        	gana = pronosticos.getEquipoA();
	                        	if (gana.equals(ganador)) {
	                        		sumatoria = sumatoria +1;
	                        	}
		                    }
		                 
		                } else if (partidos.getGolesEquipoA() < partidos.getGolesEquipoB()){
		                	ganador = partidos.getEquipoB ();
		                    System.out.println ("El ganador es: " + ganador);
		                    if (pronosticos.getGanaEquipoB().equals("x")) {
		                    	 gana = pronosticos.getEquipoB();
		                    	 if (gana.equals(ganador)) {
		                    		 sumatoria = sumatoria + 1;
		                    	 }
		                    }
	
		                } else {
		                	ganador = partidos.getEquipoA();
		                	ganador1 = partidos.getEquipoB();
		                    System.out.println ("Empate entre: " + ganador + " y " + ganador1);
		                    if (pronosticos.getEmpateEquipos().equals("x")) {
	                        	sumatoria = sumatoria + 1;
		            }
		            }
		              }
		        }
            
	                System.out.println("El puntaje obtenido por pronósticos correctos es: " + sumatoria);
		            
		        } catch (IOException e) {
		            e.printStackTrace();
		        }
	}
}


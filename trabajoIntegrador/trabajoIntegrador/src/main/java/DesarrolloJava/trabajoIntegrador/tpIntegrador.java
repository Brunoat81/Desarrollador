package DesarrolloJava.trabajoIntegrador;
		
import java.io.FileReader;		
import java.io.IOException;
import java.util.List;
import com.opencsv.bean.CsvToBeanBuilder;
		
import modelo.Partidos;		
import modelo.Pronosticos;

		
public class tpIntegrador {
		    
	public static void main(String[] args) {
		       
		        if(args.length == 0){
		            System.out.println("ERROR: No ingresaste ningún archivo como argumento!");
		            System.exit(88);
		        }

		        List <Partidos> listaDePartidos;
		        List <Pronosticos> listaDePronosticos;
		        
		        
		        try {
		          
		        	listaDePartidos = new CsvToBeanBuilder<Partidos>(new FileReader(args[0]))
		        			.withSkipLines(1)
		        			.withSeparator(',')
		                    .withType(Partidos.class)
		                    .build()
		                    .parse();
		          

		        	
		           for (Partidos partidos : listaDePartidos) {
		                String ganador = null;
		                String ganador1 = null;
		            
		                
                      if ((partidos.getGolesEquipoA() % 1 == 0) && (partidos.getGolesEquipoB() % 1 == 0)) {
		                if (partidos.getGolesEquipoA() > partidos.getGolesEquipoB()) {
		                	ganador = partidos.getEquipoA();
		                    System.out.println ("El ganador es: " + ganador);
		                } else if (partidos.getGolesEquipoA() < partidos.getGolesEquipoB()){
		                	ganador = partidos.getEquipoB ();
		                    System.out.println ("El ganador es: " + ganador);
		                } else {
		                	ganador = partidos.getEquipoA();
		                	ganador1 = partidos.getEquipoB();
		                    System.out.println ("Empate entre: " + ganador + " y " + ganador1);
		                   
		            }
		           }
		           }  
                      
			        listaDePronosticos = new CsvToBeanBuilder<Pronosticos>(new FileReader(args[1]))	   
			        		 .withSkipLines(1)
		        			 .withSeparator(',')
			        		 .withType(Pronosticos.class)
			        		 .build()
			        		 .parse(); 
		            
			        int sumatoriaMariana = 0;
			        int sumatoriaPedro = 0;
			        String persona1 = null;
			        String persona2 = null;
			        
			        for (Pronosticos pronosticos : listaDePronosticos) {
			        	int a = 0;
			      
			        	if (pronosticos.getPersona().equals("Mariana")) {
			        		persona1 = "Mariana";
	                     if (pronosticos.getGanaEquipoB().equals("x") && pronosticos.getEquipoA().equals("Argentina") && pronosticos.getEquipoB().equals("Uruguay")) {
	                           	a = a +1;
	                           	sumatoriaMariana = sumatoriaMariana + a;
	                           	a = 0;
	                           	
	                      
	                        } else if (pronosticos.getGanaEquipoB().equals("x") && pronosticos.getEquipoA().equals("Brasil") && pronosticos.getEquipoB().equals("Chile")) {
	                            a = a +1;
	                            sumatoriaMariana = sumatoriaMariana + a;
	                            a = 0;
	                            
	                        } else if (pronosticos.getEmpateEquipos().equals("x") && pronosticos.getEquipoA().equals("Ecuador") && pronosticos.getEquipoB().equals("Bolivia")) {
	                            a = a + 1;
	                            sumatoriaMariana = sumatoriaMariana + a;
	                            a = 0;
	                            
	                        } else if (pronosticos.getGanaEquipoA().equals("x") && pronosticos.getEquipoA().equals("Venezuela") && pronosticos.getEquipoB().equals("Colombia")) {
			                    a = a + 1;
			                    sumatoriaMariana = sumatoriaMariana + a;
			                    a = 0;
			                    
	                        } else if (pronosticos.getGanaEquipoA().equals("x") && pronosticos.getEquipoA().equals("Argentina") && pronosticos.getEquipoB().equals("Colombia")) {
	                           	a = a +1;
	                           	sumatoriaMariana = sumatoriaMariana + a;
	                           	a = 0;
	                           	
	                        } else if (pronosticos.getGanaEquipoA().equals("x") && pronosticos.getEquipoA().equals("Venezuela") && pronosticos.getEquipoB().equals("Uruguay")) {
	                            a = a +1;
	                            sumatoriaMariana = sumatoriaMariana + a;
	                            a = 0;
	                            
	                        } else if (pronosticos.getGanaEquipoB().equals("x") && pronosticos.getEquipoA().equals("Brasil") && pronosticos.getEquipoB().equals("Bolivia")) {
	                            a = a + 1;
	                            sumatoriaMariana = sumatoriaMariana + a;
	                            a = 0;
	                            
	                        } else if (pronosticos.getEmpateEquipos().equals("x") && pronosticos.getEquipoA().equals("Ecuador") && pronosticos.getEquipoB().equals("Chile")) {
			                    a = a + 1;
			                    sumatoriaMariana = sumatoriaMariana + a;
			                    a = 0;
	                        }
	                        }
			        	
			        	if (pronosticos.getPersona().equals("Pedro")) {
			        		persona2 = "Pedro";
	                     if (pronosticos.getGanaEquipoB().equals("x") && pronosticos.getEquipoA().equals("Argentina") && pronosticos.getEquipoB().equals("Uruguay")) {
	                           	a = a +1;
	                           	sumatoriaPedro = sumatoriaPedro + a;
	                           	a = 0;
	                           	
	                      
	                        } else if (pronosticos.getGanaEquipoB().equals("x") && pronosticos.getEquipoA().equals("Brasil") && pronosticos.getEquipoB().equals("Chile")) {
	                            a = a +1;
	                            sumatoriaPedro = sumatoriaPedro + a;
	                            a = 0;
	                            
	                        } else if (pronosticos.getEmpateEquipos().equals("x") && pronosticos.getEquipoA().equals("Ecuador") && pronosticos.getEquipoB().equals("Bolivia")) {
	                            a = a + 1;
	                            sumatoriaPedro = sumatoriaPedro + a;
	                            a = 0;
	                            
	                        } else if (pronosticos.getGanaEquipoA().equals("x") && pronosticos.getEquipoA().equals("Venezuela") && pronosticos.getEquipoB().equals("Colombia")) {
			                    a = a + 1;
			                    sumatoriaPedro = sumatoriaPedro + a;
			                    a = 0;
			                    
	                        } else if (pronosticos.getGanaEquipoA().equals("x") && pronosticos.getEquipoA().equals("Argentina") && pronosticos.getEquipoB().equals("Colombia")) {
	                           	a = a +1;
	                           	sumatoriaPedro = sumatoriaPedro + a;
	                           	a = 0;
	                           	
	                        } else if (pronosticos.getGanaEquipoA().equals("x") && pronosticos.getEquipoA().equals("Venezuela") && pronosticos.getEquipoB().equals("Uruguay")) {
	                            a = a +1;
	                            sumatoriaPedro = sumatoriaPedro + a;
	                            a = 0;
	                            
	                        } else if (pronosticos.getGanaEquipoB().equals("x") && pronosticos.getEquipoA().equals("Brasil") && pronosticos.getEquipoB().equals("Bolivia")) {
	                            a = a + 1;
	                            sumatoriaPedro = sumatoriaPedro + a;
	                            a = 0;
	                            
	                        } else if (pronosticos.getEmpateEquipos().equals("x") && pronosticos.getEquipoA().equals("Ecuador") && pronosticos.getEquipoB().equals("Chile")) {
			                    a = a + 1;
			                    sumatoriaPedro = sumatoriaPedro + a;
			                    a = 0;
	                        }
	                        }
			        }
		            
	                System.out.println("El puntaje obtenido por pronósticos correctos de " + persona1 + " es: " + sumatoriaMariana);
	                System.out.println("El puntaje obtenido por pronósticos correctos de " + persona2 + " es: " + sumatoriaPedro);
	                
		        } catch (IOException e) {
		            e.printStackTrace();
		        }
	}
}



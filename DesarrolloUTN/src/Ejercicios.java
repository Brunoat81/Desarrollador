
public class Ejercicios {

	public static void main(String[] args) {
		
		System.out.println ("Ejercicio 1 A");
		
		int nIni = 1;
		int nFin = 10;
		
		while (nIni <= nFin) {
			System.out.println(nIni);
			nIni = nIni + 1;
		}

        System.out.println ("Ejercicio 1 B");
        
    	int nInic = 1;
		int nFini = 10;
        
        while (nInic <= nFini) {
        	
        	if (nInic % 2 == 0) {
        		System.out.println(nInic);
        	}
        		nInic = nInic + 1;
        	}
        
        System.out.println ("Ejercicio 1 C");
        
        int nInici = 1;
        int nFinit = 10;
        boolean oTro = true;
        
        while (nInici <= nFinit) {
        	
        	if (nInici % 2 != 0) {
        		oTro = true;
        		System.out.println (nInici);
        		System.out.println ("Es impar");
        	} else {
        		oTro = false;
        	}
        		
        	nInici = nInici + 1;
       
        }
        
        System.out.println ("Ejercicio 1 D");
        
        int nF = 10;
        
        for (int nI = 1; nF >= nI; nF --) {
        	System.out.println (nF);
        }
        
        System.out.println ("Ejercicio 2");
        
        double ingreSos = 1;
        int vehicuLos = 1;
        int inmueBles = 1;
        int vehiculoLujo = 0;
        boolean actiVos = false;
        
        if ((ingreSos >= 489083) || (vehicuLos >= 3) || (inmueBles >= 3) || (vehiculoLujo >= 1) || (actiVos == true)) {
        	System.out.println ("Categoría: Altos Ingresos");
        } else if ((ingreSos < 489083) && (vehicuLos < 3) && (inmueBles < 3) && (vehiculoLujo < 1) && (actiVos == false)) {
        	System.out.println ("Categoría: Ingresos Medios");
        }
        
        }
	}


public class prueba {

	public static void main(String[] args) {
		
		int vecTor [] = {40, 60, 90, 100, 50, 20};
        int nuMero = 50;
        int suMa = 0;
        
        for (int numaSumar : vecTor) {
        	if (numaSumar < nuMero) {
        		suMa = numaSumar + suMa;
        	}
        }
        
        System.out.println("El resultado del ejercicio es:" + suMa);

	}

}

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.Flow;

public class pruebas {

	public static void main(String[] args) {
		
		int numeros [] = new int [] {1, 37, 16, 87, 95, 109};
		double resultado = 0;
		
		for (int i =0; i < numeros.length; i++) {
			resultado = resultado + i;
			System.out.println (resultado);
		}
		
		resultado = resultado / numeros.length;
		
		System.out.println(resultado);

	}
}




public class pruebas {

	public static void main(String[] args) {
		
		int x = 10;
		Integer a = Integer.valueOf(x);
		Integer b = Integer.valueOf("1024");
		Integer c = Integer.valueOf("1BC",16);
		Double d = Double.valueOf(b);
		Float e = Float.valueOf(a);

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		
	}

}

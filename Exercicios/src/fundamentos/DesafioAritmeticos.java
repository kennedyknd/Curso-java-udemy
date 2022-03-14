package fundamentos;

public class DesafioAritmeticos {
	public static void main(String[] args) {
		int a = 2 + 4 * 9;
		double b = Math.pow(a, 3); //Math é quando tem elevado a potência
		
		System.out.println(b);
		
		double c = 6 * ( 3 + 2);
		double d = Math.pow(c, 2);
		double e = d / ( 3 * 2);
		
		System.out.println(e);
		
		double f = ( 1 - 5) * ( 2 - 7 );
		double g = f / 2;
		double h = Math.pow(g, 2);
		
		System.out.println(h);
		
		double i = Math.pow(e - h, 3);
		double m = i / Math.pow(10, 3);
				
		System.out.println(m);
		
	}
}

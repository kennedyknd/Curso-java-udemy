package controle;

public class Continue1 {

	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			if ( i % 2 == 1) {
				continue; //Interrompe apenas aquela repeti��o no for 
			}
			System.out.println(i);
		}
	}
}

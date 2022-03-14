package controle;

import java.util.Iterator;

public class Break1 {

	public static void main(String[] args) {
		
		for (int i = 0; i < 10 ; i++) {
			if (i == 5) {
				break; //Interrompe o laço for
			}
			
			System.out.println(i);
		}
	}
}

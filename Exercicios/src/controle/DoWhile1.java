package controle;

import java.util.Scanner;

public class DoWhile1 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String texto = "";
		
		do {
			System.out.println("Digite o texto");
			texto = entrada.nextLine();
		} while (!texto.equalsIgnoreCase("sair"));
		
		System.out.println("Fim");
		
	}
}

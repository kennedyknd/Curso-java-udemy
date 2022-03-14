package exerciciosControle;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int numero = 0;
		int maiorNumero = 0;
		
		for (int i = 1; i <= 10 ; i++) {
			System.out.println("Insira um número");
			numero = entrada.nextInt();
			
			if (numero > maiorNumero ) {
				maiorNumero = numero;
			}
		}
		
		System.out.printf("O maior numero digitado é %d", maiorNumero);
		
		entrada.close();
		
	}
}

package controle;

import java.util.Scanner;

public class While1 {
	public static void main(String[] args) {
		
		int contador = 1;
		
		while (contador <= 5) {
			System.out.printf("Contador � %d\n", contador);
			contador++;
		}
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a nota");

		double nota = entrada.nextDouble();
		
		while ( nota < 0 || nota > 10 ) {
			System.out.println("Nota inv�lida");
			System.out.println("Digite a nota novamente");
			nota = entrada.nextDouble();
		} if ( nota < 7 ) {
			System.out.println("Aluno reprovado");
		} else {
			System.out.println("Aluno aprovado");
		}
		
		System.out.println("Fim");
		
		entrada.close();
		
	}
}

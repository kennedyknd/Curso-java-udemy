package exerciciosControle;

import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {

		//Adivinhar numeros entre 0 e 100
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Insira 10 tentativas de um número entre 0 e 100");

		int numeroAleatorio = 75;
		int tentativas = 0;
		int i = 9;
		double numero = entrada.nextDouble();
		
		while (numero < 0 || numero > 100) {
			System.out.println("Número inválido, digite novamente");
			numero = entrada.nextDouble();
		} 
		for (i = i; i > 0; i--) {
			tentativas++;
			if (numero == numeroAleatorio) {
				System.out.println("Acertou");
				System.out.printf("Foram computadas %d tentativas\n", tentativas);
				break;
			}  else {
				if (numero < numeroAleatorio ) {
					System.out.println("O número que você digitou é menor");
				} else {
					System.out.println("O número que você digitou é maior");
				}
				System.out.println("Tente novamente");
				System.out.printf("Ainda restam %d tentativas\n", i);
				numero = entrada.nextDouble();
				if (numero < 0 || numero > 100) {
					i--;
					break;
				}
			}
		}
		
		System.out.println("Acabaram as tentativas");
		
		entrada.close();
		
	}
}

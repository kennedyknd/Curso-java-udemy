package exerciciosControle;

import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[] args) {
		
		//Criar um programa que enquanto estiver
		//recebendo n�meros positivos
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Insira um n�mero positivo");
		int numero = entrada.nextInt();
		int soma = 0;
		
		while ( numero > 0) {
			soma += numero;
			System.out.printf("A soma dos n�meros � %d\n", soma);
			System.out.println("Insira o pr�ximo n�mero");
			numero = entrada.nextInt();
			if ( numero < 0) {
				break;
			}
		}
		
		System.out.println("Fim");
		
		entrada.close();
		
		
	}
}

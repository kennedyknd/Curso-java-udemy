package exerciciosControle;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Escreva um ano");
		int ano = entrada.nextInt();
		
		if (ano % 4 == 0) {
			System.out.println("Ano bissexto");
		} else {
			System.out.println("N�o bissexto");
		}
		
		entrada.close();

	}
}

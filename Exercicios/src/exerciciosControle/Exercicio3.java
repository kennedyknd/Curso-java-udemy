package exerciciosControle;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		
		// Media do aluno
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Nota 1: ");
		double nota1 = entrada.nextDouble();
		System.out.println("Nota 2: ");
		double nota2 = entrada.nextDouble();
		
		double media = ( nota1 + nota2 ) / 2;
		
		System.out.printf("Sua media é %.2f\n", media);
		
		if (media >= 7 ) {
			System.out.println("Aprovado");
		} else if (media >= 4 ) {
			System.out.println("Recuperação");
		} else {
			System.out.println("Reprovado");
		}
		
		entrada.close();

	}
}

package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Quantas notas?");
		
		int qtdNotas = entrada.nextInt();
		double total = 0;
		
		double[] notas = new double[qtdNotas];
		
		for (int i = 0; i < notas.length; i++) {
			System.out.printf("Digite Nota Nª %d\n", ( i + 1 ));
			notas[i] = entrada.nextDouble();
		}
		
		for (double nota : notas) {
			total += nota;
		}
		
		System.out.println(Arrays.toString(notas));
		
		System.out.printf("A media é %f", total / notas.length);
		
		entrada.close();

	}
}

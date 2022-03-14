package exerciciosControle;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		
		//1. Criar um programa que receba um 
		//nu�?mero e verifique se ele está entre 0 e 10 e e�? par;
				
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Escreva um número");
		int numero = entrada.nextInt();
				
		if (numero > 0 && numero < 10 && numero % 2 == 0) {
			System.out.println("O número esta entre 0 e 10 e é par");
		} else {
			System.out.println("Nenhuma das opções");
		}
		
		entrada.close();
	}
}

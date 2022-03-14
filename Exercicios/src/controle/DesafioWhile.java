package controle;

import java.util.Scanner;

public class DesafioWhile {
	public static void main(String[] args) {
		//Calcular média das notas
		//Quantos alunos?
		//Digitar nota válida
		//Armazenar as notas no Total
		//Quantas notas foram digitadas?
		//Calcular a média das notas digitadas
		//-1 para sair
		
		Scanner entrada = new Scanner(System.in);
		
		double nota = 0;
		double media = 0;
		double total = 0;
		int contador = 0;
		
		while ( nota != -1 ) { //Enquanto a nota for diferente de -1 faça
			System.out.println("Informe a nota");
			nota = entrada.nextDouble();
			
			if ( nota <= 10 && nota >= 0 ) {
				total += nota;
				contador++;
			} else if (nota != -1) {
				System.out.println("Nota inválida");
			}
		}
		
		media = total / contador;
		System.out.printf("Media: %f", media);
		
		entrada.close();
		
		
	}
}

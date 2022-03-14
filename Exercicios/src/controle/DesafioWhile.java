package controle;

import java.util.Scanner;

public class DesafioWhile {
	public static void main(String[] args) {
		//Calcular m�dia das notas
		//Quantos alunos?
		//Digitar nota v�lida
		//Armazenar as notas no Total
		//Quantas notas foram digitadas?
		//Calcular a m�dia das notas digitadas
		//-1 para sair
		
		Scanner entrada = new Scanner(System.in);
		
		double nota = 0;
		double media = 0;
		double total = 0;
		int contador = 0;
		
		while ( nota != -1 ) { //Enquanto a nota for diferente de -1 fa�a
			System.out.println("Informe a nota");
			nota = entrada.nextDouble();
			
			if ( nota <= 10 && nota >= 0 ) {
				total += nota;
				contador++;
			} else if (nota != -1) {
				System.out.println("Nota inv�lida");
			}
		}
		
		media = total / contador;
		System.out.printf("Media: %f", media);
		
		entrada.close();
		
		
	}
}

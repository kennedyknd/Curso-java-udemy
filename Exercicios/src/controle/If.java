package controle;

import java.util.Scanner;

public class If {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe a nota");
		double nota = entrada.nextDouble();

		if (nota < 0 || nota > 10) {
			System.out.println("Nota inválida, digite uma nota válida");
		} else if(nota < 7 ){
			System.out.println("Aluno reprovado");
		} else {
			System.out.println("Aluno aprovado");
		}
		
		entrada.close();
	}
}

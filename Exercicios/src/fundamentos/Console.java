package fundamentos;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String nome = entrada.nextLine();
		int idade = entrada.nextInt();
		
		System.out.printf("O nome � %s e sua idade � %d", nome, idade);
		
		entrada.close();
	}
}

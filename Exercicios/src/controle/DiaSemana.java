package controle;

import java.util.Scanner;

public class DiaSemana {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o dia");
		
		String dia = entrada.next();
		
		if (dia.equalsIgnoreCase("domingo")) {
			System.out.println("1");
		} else if (dia.equalsIgnoreCase("segunda")) {
			System.out.println("2");
		} else {
			System.out.println("Isso ai");
		}
		
		entrada.close();
	}
}

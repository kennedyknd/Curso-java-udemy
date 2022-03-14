package fundamentos;

import java.util.Scanner;

public class DesafioModulo {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número");
		double num1 = entrada.nextDouble();
		
		System.out.println("Digite o segundo número");
		double num2 = entrada.nextDouble();
		
		System.out.println("Digite a operação");
		String operacao = entrada.next();
		
		System.out.printf("A operação é %.2f %s %.2f ?", num1, operacao, num2);

		double resultado = "+".equals(operacao) ? num1 + num2 : 0;
		resultado = "-".equals(operacao) ? num1 - num2 : resultado;
		resultado = "*".equals(operacao) ? num1 * num2 : resultado;
		resultado = "/".equals(operacao) ? num1 / num2 : resultado;
		resultado = "%".equals(operacao) ? num1 % num2 : resultado;
		
		System.out.printf("\nO resultado é %.2f", resultado);
		
		entrada.close();
	}
}

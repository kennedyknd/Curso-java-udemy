package fundamentos;

import java.util.Scanner;

public class DesafioModulo {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o primeiro n�mero");
		double num1 = entrada.nextDouble();
		
		System.out.println("Digite o segundo n�mero");
		double num2 = entrada.nextDouble();
		
		System.out.println("Digite a opera��o");
		String operacao = entrada.next();
		
		System.out.printf("A opera��o � %.2f %s %.2f ?", num1, operacao, num2);

		double resultado = "+".equals(operacao) ? num1 + num2 : 0;
		resultado = "-".equals(operacao) ? num1 - num2 : resultado;
		resultado = "*".equals(operacao) ? num1 * num2 : resultado;
		resultado = "/".equals(operacao) ? num1 / num2 : resultado;
		resultado = "%".equals(operacao) ? num1 % num2 : resultado;
		
		System.out.printf("\nO resultado � %.2f", resultado);
		
		entrada.close();
	}
}

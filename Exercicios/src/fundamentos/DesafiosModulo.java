package fundamentos;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class DesafiosModulo {
	public static void main(String[] args) {
		
		//Fahrenheit para Celcius
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Insira a temperatura em Fahrenheit ");
		double fahrenheit = entrada.nextDouble();
		
		double celcius = ( fahrenheit - 32 ) / 1.8;
		
		System.out.printf("O resultado em Celcius é %.2f", celcius);

		//IMC
		
		String valor1 = JOptionPane.showInputDialog("Insira seu peso");
		double peso = Double.parseDouble(valor1);
		
		String valor2 = JOptionPane.showInputDialog("Insira sua altura");
		double altura = Double.parseDouble(valor2);
		
		double imc = peso / ( altura * altura );
		
		System.out.printf("Seu IMC é %.2f", imc);
		
	}
}

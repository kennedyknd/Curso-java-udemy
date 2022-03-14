package classe;

import java.util.Scanner;

public class DataTeste {

	public static void main(String[] args) {
		
		Data d1 = new Data(9, 12, 2020);
		
		var d2 = new Data();
		d2.ano = 2020;
		
		String dataFormatada1 = d1.obterDataFormatada();
		
		// Forma simples
		
		System.out.printf("Data 1: %d/%d/%d\n", d1.dia, d1.mes, d1.ano);
		System.out.printf("Data 2: %d/%d/%d\n", d2.dia, d2.mes, d2.ano);
		
		// Forma usando método
		
		System.out.println("Data usando método: " + dataFormatada1);
		
	}
}

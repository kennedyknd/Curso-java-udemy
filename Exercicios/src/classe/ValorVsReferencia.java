package classe;

public class ValorVsReferencia {

	public static void main(String[] args) {
		
		double a = 2;
		double b = a; //atribuição por valor ( Tipo primitivo )
		
		a++;
		b--;
		
		System.out.printf("Valor de a é: %.2f\n", a);
		System.out.printf("Valor de b é: %.2f\n", b);
		
		Data d1 = new Data(1, 6, 2022);
		Data d2 = d1; // Atribuição por referência ( Objeto )
		
		d1.dia = 31;
		d2.mes = 12;
		d1.ano = 2025;
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
		
	}
}

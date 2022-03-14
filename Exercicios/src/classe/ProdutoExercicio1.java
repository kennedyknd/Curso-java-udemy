package classe;

public class ProdutoExercicio1 {

	public static void main(String[] args) {
		
		//Desconto sempre será 25%
		
		Produto p3 = new Produto("Playstation", 100);
		Produto p4 = new Produto("Livro", 200, 40);
		
		double valor1 = p3.precoComDesconto();
		double valor2 = p4.precoComDesconto();
	
		System.out.printf("Valor de produto é %.2f\n", valor1);
		System.out.printf("Valor de produto é %.2f", valor2);
		
	}
}

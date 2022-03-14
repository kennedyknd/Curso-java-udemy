package classe;

import java.util.Scanner;

public class ProdutoTeste {

	public static void main(String[] args) {
		
		Produto p1 = new Produto("Notebook", 4356.89, 0.25);
		
		var p2 = new Produto();
		p2.nome = "Caneta Preta";
		p2.preco = 12.56;
		p2.desconto = 0.29;
		
		System.out.println(p1.nome);
		System.out.println(p2.nome);
		
		double precofinal1 = p1.precoComDesconto();
		double precofinal2 = p2.precoComDesconto();
		
		System.out.println(precofinal1);
		System.out.println(precofinal2);
		
		double soma = precofinal1 + precofinal2;
		
		System.out.printf("Soma dos produtos R$: %.2f", soma);
		
	}
}

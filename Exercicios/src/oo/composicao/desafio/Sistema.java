package oo.composicao.desafio;

public class Sistema {

	public static void main(String[] args) {
		
		Produto p1 = new Produto("Caneta", 10);
		Produto p3 = new Produto("Lapis", 50);
		
		Compra compra1 = new Compra();
		compra1.adicionarItem(p1, 5);
		compra1.adicionarItem(new Produto("Livro", 20), 10);
		
		Compra compra2 = new Compra();
		compra2.adicionarItem(p3, 5);
		compra2.adicionarItem(new Produto("Caderno", 20), 10);
		
		Cliente cliente1 = new Cliente("Kennedy");
		cliente1.compras.add(compra1);
		cliente1.adicionarCompra(compra2);
		
		System.out.println(cliente1.obterValorTotal());
		
	}
}

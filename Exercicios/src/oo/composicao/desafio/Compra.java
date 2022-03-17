package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {

	ArrayList<Item> itens = new ArrayList<>();
	
	void adicionarItem(Produto produto, int quantidade) {
		this.itens.add(new Item(produto, quantidade));
	}
	
	double obterValorTotal() {
		double total = 0;
		
		for (Item item : itens) {
			total = item.quantidade * item.produto.preco;
		}
		
		return total;
	}
}

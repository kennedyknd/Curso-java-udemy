package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		//Offer e add adicionam elementos na fila
		//Diferença é o comportamento quando a fila está cheia
		
		fila.add("Ana"); //Retorna false
		fila.offer("Bia"); //Lança uma exceção
		fila.offer("Carlos");
		fila.offer("Rafaela");
		fila.offer("Daniel");
		fila.offer("Kennedy");
		
		//Peek e element pega algo na fila ( sem remover )
		//Diferença é quando a fila está vazia
		
		System.out.println(fila.peek()); //Retorna false
		System.out.println(fila.element()); //Lança uma exceção
		
//		fila.clear();
//		fila.size();
//		fila.isEmpty();		
		
		System.out.println(fila.poll()); // pega um elemento da fila e remove
		System.out.println(fila.remove()); // pega um elemento da fila 
		//e remove e dá erro quando está vazia
		
		fila.contains("Kennedy");
		
	}
}

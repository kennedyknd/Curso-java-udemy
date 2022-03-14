package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		//Offer e add adicionam elementos na fila
		//Diferen�a � o comportamento quando a fila est� cheia
		
		fila.add("Ana"); //Retorna false
		fila.offer("Bia"); //Lan�a uma exce��o
		fila.offer("Carlos");
		fila.offer("Rafaela");
		fila.offer("Daniel");
		fila.offer("Kennedy");
		
		//Peek e element pega algo na fila ( sem remover )
		//Diferen�a � quando a fila est� vazia
		
		System.out.println(fila.peek()); //Retorna false
		System.out.println(fila.element()); //Lan�a uma exce��o
		
//		fila.clear();
//		fila.size();
//		fila.isEmpty();		
		
		System.out.println(fila.poll()); // pega um elemento da fila e remove
		System.out.println(fila.remove()); // pega um elemento da fila 
		//e remove e d� erro quando est� vazia
		
		fila.contains("Kennedy");
		
	}
}

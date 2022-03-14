package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

	public static void main(String[] args) {
		
		Deque<String> livros = new ArrayDeque<String>();
		
		livros.add("Livro 1");
		livros.push("Livro 2");
		livros.push("Livro 3");
		
		System.out.println(livros.peek());
		System.out.println(livros.poll());
		System.out.println(livros.remove());
		System.out.println(livros.pop());
		
		System.out.println(livros.size());
		System.out.println(livros.isEmpty());
		
		
	}
}

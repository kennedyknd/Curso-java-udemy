package colecoes;

import java.util.ArrayList;

public class Lista {
	
	public static void main(String[] args) {
		
		ArrayList<Usuario> lista = new ArrayList<>();
		
		lista.add(new Usuario("Kennedy"));
		lista.add(new Usuario("David"));
		lista.add(new Usuario("Silvana"));
		lista.add(new Usuario("Luiz"));
		
		System.out.println(lista.get(2));
		
		for (Usuario usuario : lista) {
			System.out.println(usuario.nome);
		}
		
		lista.remove(0);
		lista.remove(new Usuario("Luiz"));
		
		for (Usuario usuario : lista) {
			System.out.println(usuario.nome);
		}
	}
}

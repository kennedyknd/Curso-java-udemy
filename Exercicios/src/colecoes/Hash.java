package colecoes;

import java.util.HashSet;

public class Hash {

	public static void main(String[] args) {
		
		HashSet<Usuario> usuarios = new HashSet<>();
		
		usuarios.add(new Usuario("Kennedy"));
		usuarios.add(new Usuario("Lucas"));
		usuarios.add(new Usuario("Luiz"));
		
		System.out.println(usuarios.contains(new Usuario("Kennedy")));
		
	}
}

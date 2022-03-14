package classe;

public class Equals {

	public static void main(String[] args) {
		
		Usuario u1 = new Usuario();
		u1.nome = "Kennedy Alves";
		u1.email = "kennedyalves@gmail.com";
		
		Usuario u2 = new Usuario();
		u2.nome = "Kennedy Alves";
		u2.email = "kennedyalves@gmail.com";
		
		Usuario u3 = new Usuario();
		u3.nome = "Lucas Alves";
		u3.email = "lucasalves@gmail.com";
		
		System.out.println(u1.equals(u2));
		
	}
}

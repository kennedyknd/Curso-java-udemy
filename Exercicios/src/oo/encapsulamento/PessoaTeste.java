package oo.encapsulamento;

public class PessoaTeste {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa(40);
		System.out.println(p1.getIdade());
		p1.setIdade(60);
		System.out.println(p1.getIdade());
		
	}
}

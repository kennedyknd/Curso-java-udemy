package oo.encapsulamento;

public class Pessoa {

	private int idade;

	public Pessoa(int idade) {
		setIdade(idade);
	}
	
	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		if(idade >= 0) {
			this.idade = idade;
		}
	}
	
	
}

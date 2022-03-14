package classe;

public class Pessoa {

	String nome;
	double peso;
	
	Pessoa() {
		
	}
	
	Pessoa(String nome, double peso){
		this.nome = nome;
		this.peso = peso;
	}
	
	double comer(double peso1, double peso2) {
		return this.peso + peso1 + peso2;
	}
	
	void comer(Comida comida) {
		if (comida != null) {
			this.peso += comida.peso;
		}
	}
	
}

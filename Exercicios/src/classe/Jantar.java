package classe;

public class Jantar {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("Kennedy", 90);
		Comida c1 = new Comida("Arroz", 5);
		Comida c2 = new Comida("Feijão", 2);
		
		double calculo = p1.comer(c1.peso, c2.peso);
		
		System.out.println(calculo);
		
		p1.comer(c1);
		
		System.out.println(p1.peso);
		
		p1.comer(c2);

		System.out.println(p1.peso);
	
	}
}

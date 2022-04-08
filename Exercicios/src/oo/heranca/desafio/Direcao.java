package oo.heranca.desafio;

public class Direcao {

	public static void main(String[] args) {
		
		Carro c1 = new Civic();
		Carro c2 = new Ferrari();
		
		System.out.println(c1.getVelocidadeAtual());
		System.out.println(c2.getVelocidadeAtual());
		
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		
		c1.frear();
		
		c2.acelerar();
		c2.acelerar();
		
		System.out.println(c1.getVelocidadeAtual());
		System.out.println(c2.getVelocidadeAtual());
	}
}

package oo.heranca.desafio;

public class Ferrari extends Carro{

	void acelerar() {
		super.acelerar();
		super.acelerar();
		super.acelerar();
	}
	
	public Ferrari() {
		super(300);
	}
}

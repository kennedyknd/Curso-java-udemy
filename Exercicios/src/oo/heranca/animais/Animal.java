package oo.heranca.animais;

public abstract class Animal {

	private String nome;
	private int movimento = 0;
	
	
	public String respirar() {
		return "CO2";
	}
	
	public abstract String mover();
}
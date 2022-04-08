package oo.heranca.desafio;

public abstract class Carro {

	private int velocidadeAtual;
	private final int VELOCIDADE_MAXIMA;
	private int delta = 5;
	
	public int getVelocidadeAtual() {
		return velocidadeAtual;
	}

	public void setVelocidadeAtual(int velocidadeAtual) {
		this.velocidadeAtual = velocidadeAtual;
	}

	public int getDelta() {
		return delta;
	}

	public void setDelta(int delta) {
		this.delta = delta;
	}

	public int getVELOCIDADE_MAXIMA() {
		return VELOCIDADE_MAXIMA;
	}

	public Carro(int velocidadeMaxima) {
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}
	
	void acelerar() {
		if(getVelocidadeAtual() < VELOCIDADE_MAXIMA) {
			this.velocidadeAtual += getDelta();
		} else {
			this.velocidadeAtual = VELOCIDADE_MAXIMA;
		}
	}
	
	void frear() {
		if(getVelocidadeAtual() > 5) {
			this.velocidadeAtual -= 5;
		} else {
			this.velocidadeAtual = 0;
		}
	}
	
}

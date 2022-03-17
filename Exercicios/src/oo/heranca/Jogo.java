package oo.heranca;

public class Jogo {

	public static void main(String[] args) {
		
		Jogador j1 = new Heroi();
		j1.x = 10;
		j1.y = 10;

		Jogador j2 = new Monstro();
		j2.x = 10;
		j2.y = 11;
		
		j1.andar(Direcao.NORTE);
		j1.andar(Direcao.LESTE);
		j1.andar(Direcao.NORTE);
		j1.andar(Direcao.LESTE);
		
		System.out.println(j1.vida);
		System.out.println(j2.vida);
		
		j1.atacar(j2);
		
		System.out.println(j1.vida);
		System.out.println(j2.vida);
		
		System.out.println(j1.y);
	}
}

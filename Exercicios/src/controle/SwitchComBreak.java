package controle;

public class SwitchComBreak {

	public static void main(String[] args) {
		
		String conceito = "";
		int nota = 10;
		
		switch (nota) {
		case 10:
			conceito = "Nota 10, parabens";
			break;
		case 9:
			conceito = "Nota 9, ótimo";
			break;
		case 8: case 7:
			conceito = "Nota 8 ou 7, perfeito";
			break;
			
		}
		
		System.out.println(conceito);
		
	}
}

package fundamentos;

public class DesafioLogico {
	public static void main(String[] args) {
		//trabalho na terça
		//trabalho na quarta
		
		boolean trabalho1 = true;
		boolean trabalho2 = false;
		
		boolean comprouTV50 = trabalho1 && trabalho2;
		boolean comprouTV32 = trabalho1 ^ trabalho2;
		boolean comprouSorvete = trabalho1 || trabalho2;
		boolean saudavel = !comprouSorvete;
		
		System.out.println("Comprou TV de 50 ? " + comprouTV50);
		System.out.println("Comprou TV de 32 ? " + comprouTV32);
		System.out.println("Comprou sorvete ? " + comprouSorvete);
		System.out.println("Mais saudável ? " + saudavel);
				
	}
}

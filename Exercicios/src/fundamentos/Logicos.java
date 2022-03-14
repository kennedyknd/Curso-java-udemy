package fundamentos;

public class Logicos {
	public static void main(String[] args) {
		
		boolean condicao1 = true;
		boolean condicao2 = 3 > 7;
		
		System.out.println(condicao1 && condicao2); //tabela verdade E
		System.out.println(condicao1 || condicao2); //tabela verdade OU
		System.out.println(condicao1 ^ condicao2); //tabela verdade OU exclusivo
		System.out.println(!condicao1); //tabela verdade negação
		System.out.println(!!condicao1); //tabela verdade duas negações
		
	}
}

package controle;

public class SwitchSemBreak {
	
	public static void main(String[] args) {
		
		String faixa = "marrom";
		
		switch ( faixa.toLowerCase()){
		case "preta":
			System.out.println("Faixa Preta");
		case "marrom":
			System.out.println("Faixa Marrom");
		case "roxa":
			System.out.println("Faixa Roxa");
		case "verde":
			System.out.println("Faixa Verde");
			break;
		default:
			System.out.println("Nenhuma faixa");
		}
		
	}
}

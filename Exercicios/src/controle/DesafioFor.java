package controle;

public class DesafioFor {
	
	public static void main(String[] args) {
		
		String valor = "#";
		for ( int i = 1; i <= 5 ; i++) {
			System.out.println(valor);
			valor += "#";
		}
		
		//Não pode usar o laço número como contador
		
		for ( String v = "#" ; !v.equals("######") ; v += "#" ) {
			System.out.println(v);
		}
		
	}
}

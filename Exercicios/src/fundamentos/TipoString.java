package fundamentos;

public class TipoString {
	public static void main(String[] args) {
		System.out.println("Ola pessoal");
		
		String s = "Boa tarde";
		System.out.println(s.concat("!!!"));
		
		var nome = "Kennedy";
		var sobrenome = "Alves Soares";
		var idade = 26;
		var salario = 3000.8799;
		
		String frase = String.format("O senhor %s %s tem %d anos e ganha R$ %.2f", nome, sobrenome, idade, salario);
		
		// A cada % s é string - d é inteiro e f é número quebrado
		
		System.out.println(frase);
		
	}
}

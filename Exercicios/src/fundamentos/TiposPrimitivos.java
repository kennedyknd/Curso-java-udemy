package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		
		//Tipos n�meros inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 32;
		int id = 56789;
		long pontosAcumulados = 3134845223L;
		
		//Tipos num�ricos reais
		
		float salario = 11458.44F;
		double vendasAcumuladas = 2991791303.01;
		
		//Tipo booleano
		
		boolean estaDeFerias = false;
		
		//Tipo caractere
		
		char status = 'A';
		
		//Dias de empresa
		
		System.out.println("O funcion�rio possui " + anosDeEmpresa * 365 + " dias de empresa");
		
		System.out.println(numeroDeVoos / 2);
		
		System.out.println(pontosAcumulados * vendasAcumuladas);
		
		System.out.println(id + ": Ganha" + salario);
		
		System.out.println("F�rias?" + estaDeFerias);
		
		System.out.println("Status: " + status);
		
	}
}

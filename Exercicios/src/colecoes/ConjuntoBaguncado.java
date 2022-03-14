package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		HashSet conjunto = new HashSet();
		
		conjunto.add(1.2);
		conjunto.add(true);
		conjunto.add("Teste");
		conjunto.add(1);
		conjunto.add('x');
		
		System.out.println("Tamanho � " + conjunto.size());
		
		conjunto.add("Teste");
		// O conjunto n�o aceita repeti��o de elementos
		System.out.println("Tamanho � " + conjunto.size());
		
		conjunto.add("Outro");
		System.out.println("Tamanho � " + conjunto.size());
		
		System.out.println(conjunto.remove("Teste")); //True ou false
		System.out.println(conjunto.remove("Nada")); //True ou false

		System.out.println("Tamanho � " + conjunto.size());
		
		System.out.println(conjunto.contains("Teste")); //N�o cont�m porque foi removido
		
		Set nums= new HashSet();
		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums);
		System.out.println(conjunto);
		
		conjunto.addAll(nums);
		
		System.out.println(conjunto);
	}
}

package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {

	public static void main(String[] args) {
		
		//O resultado não é organizado pela ordem de nomes acrescentados
		Set<String> listaAprovados = new HashSet<String>();
		listaAprovados.add("Ana");
		listaAprovados.add("Kennedy");
		listaAprovados.add("Lucas");
		listaAprovados.add("Pedro");
		
		System.out.println(listaAprovados);
		
		for (String nomes : listaAprovados) {
			System.out.println(nomes);
		}

		//O resultado é organizado pela ordem de nomes acrescentados
		SortedSet<String> listaAprovados2 = new TreeSet<String>();
		listaAprovados2.add("Ana");
		listaAprovados2.add("Kennedy");
		listaAprovados2.add("Lucas");
		listaAprovados2.add("Pedro");
		
		System.out.println(listaAprovados2);
		
		for (String nomes : listaAprovados2) {
			System.out.println(nomes);
		}
		
		Set<Integer> nums = new HashSet<Integer>();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(4);
		
		for (int numeros : nums) {
			System.out.println(numeros);
		}
		
		
	}
}

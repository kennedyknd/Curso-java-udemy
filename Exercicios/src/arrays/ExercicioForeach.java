package arrays;

import java.util.Arrays;
import java.util.Iterator;

public class ExercicioForeach {

	public static void main(String[] args) {
		
		double[] notasAlunoA = new double[3];
		
		double totalAlunoA = 0;
		double totalAlunoB = 0;
		
		notasAlunoA[0] = 8.9;
		notasAlunoA[1] = 8;
		notasAlunoA[2] = 6.7;
		
		System.out.println(Arrays.toString(notasAlunoA));
		
		for (double nota : notasAlunoA) {
			totalAlunoA += nota;
		}
		
		System.out.println(totalAlunoA / notasAlunoA.length);
		
		double[] notasAlunoB = { 8.7, 8.0, 9 };
		
		for (double nota : notasAlunoB) {
			totalAlunoB += nota;
		}
		
		System.out.println(totalAlunoB / notasAlunoB.length);
		
	}
}

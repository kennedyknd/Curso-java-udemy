package oo.composicao;

import java.util.ArrayList;
import java.util.Objects;

public class Aluno {
	
	final String nome;
	final ArrayList<Curso> cursos = new ArrayList<>();

	public Aluno(String nome) {
		this.nome = nome;
	}
	
	void adicionarCurso(Curso curso) {
		this.cursos.add(curso);
		curso.alunos.add(this);
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", cursos=" + cursos + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(cursos, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(cursos, other.cursos) && Objects.equals(nome, other.nome);
	}
	
	
	
	
}

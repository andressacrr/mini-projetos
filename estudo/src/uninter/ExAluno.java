package uninter;

public class ExAluno {
	String nome, curso;
	Avaliacao notas;
	
	ExAluno (String nome, String curso, Avaliacao notas){
		this.nome = nome;
		this.curso = curso;
		this.notas = notas;
	}
	


public void prints2() {
	System.out.println("nome: " + nome);
	System.out.println("curso: " + curso);
	System.out.println("Media Aritimetica: " + notas.mediaA());
	System.out.println("Media Ponderada: " + notas.mediaP());
	System.out.println();
   }
}
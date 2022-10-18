package estudo;

public class aluno {
	int matricula;
	String nome;
	String cpf;
	
	//parametro nenhum, vazio
	aluno(){}

	//aqui é p ficar menos denso, fica melhor (esta ligada ao aluno b)
//	aluno(int matricula1, String nome1, String cpf1){
//		matricula = matricula1;
//		nome = nome1;
//		cpf = cpf1;
	
	//aqui estou usando o this. para poder usar o mesmo nome do objeto (ligado ao aluno b)
	aluno(int matricula, String nome, String cpf){
		this.matricula = matricula;
		this.nome = nome;
		this.cpf = cpf;
	}
		
	// instanciei só a matricula, pode ter o public ou nao
	public aluno(int matricula) {
		this.matricula = matricula;
		this.nome = "vazio";
		this.cpf = "vazio";
	
	}

	void info() {
		System.out.println("Matricula: " + matricula);
		System.out.println("Nome: " + nome);
		System.out.println("CPF: " + cpf);
		System.out.println();
	}
}

package exercicios;

import java.util.Scanner;

public class Pessoas {
		int idade;
		String nome;
		Scanner sc = new Scanner(System.in);


	public int getIdade() {
			return idade;
		}


		public void setIdade(int idade) {
			this.idade = idade;
		}


		public String getNome() {
			return nome;
		}

// mudando o nome, por um novo nome/o parametro"()" serve p mostrar oq eu vou mudar
		public void setNome(String nome) {
			this.nome = nome;
		}



Pessoas (){	
}

		public void mostra() {
			System.out.printf("Seu nome: %s", getNome() );
			System.out.println();
			System.out.printf("Sua idade: %s", getIdade());
		}

	}


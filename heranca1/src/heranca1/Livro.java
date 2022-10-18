package heranca1;

	public class Livro {
			public String autor;
			public String titulo;
			public int paginas;
			public float custoProducao;
			public float precoVenda;
			
//			public Livro(String titulo, String autor) {
//				// vai ter um codigo
//			}
			
			public Livro(String titulo, String autor) {
				this.titulo = titulo;
				this.autor = autor;
			}

			public float lucro() {
				return precoVenda - custoProducao;
			}
			
			public void imprimirTitulo() {
				System.out.println("O titulo: " + titulo);
			}
			
			public float imposto() {
				return 0.2f* lucro(); //vou levar p LivroDigital esse metodo
			}
			
			public String toString() { //p imprimir
				return titulo
					  + autor;	
			}
			
			// temos 2 metodos de imposto(), se eu quiser printar da 
			//   da classe Lucro, tenho q usar o super. 
			
	}



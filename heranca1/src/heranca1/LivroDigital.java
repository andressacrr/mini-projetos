package heranca1;

		//oq eu mudar na classe Livro, automaticamente muda aqui
     	// esse extends vai puxar os atributos da classe Livro
public class LivroDigital extends Livro{
	//esses 2 atributos é só da parte digital
	public String linkDownload;
	public int tamanho; 
	
	public LivroDigital(String titulo, String autor) {
	//esse super faz referenca a classe "mae" (Livro), entao vai puxar 
	//	o codigo do Livro(titulo, autor), e tem q ser na primeira linha
		super(titulo, autor); 	
	}
	
	public float imposto() {
	//return 0.2f * lucro() + 2; pegando o medoto imposto de la somando 2
		return super.imposto() + 2; //super pq é da classe "mae" Livro
	}
	
	public float tamanhoPorPagina() {
		return tamanho/(float)paginas;
	}
}
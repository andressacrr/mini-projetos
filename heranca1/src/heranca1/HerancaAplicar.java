package heranca1;

public class HerancaAplicar {
	public static void main(String[] args) {
		Livro l1 = new Livro("Zoe101", "Bob Esponja");
		LivroDigital l2 = new LivroDigital("Zoe101", "Bob Esponja");
		
		System.out.println(l2);
		System.out.println(l1);		
	}
}

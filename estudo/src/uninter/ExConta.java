package uninter;

public class ExConta {
	int numero;
	String titular;
	double saldo, limite;
	

	
	public ExConta(int numero, String titular, double saldo, double limite){
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
		this.limite = limite;
	}

	boolean sacar(double valor) {
		if (valor>limite || valor>saldo || valor <= 0) {
			return false;
		}
		saldo -= valor;   // saldo = saldo - valor
			return true;
	}
	
	boolean depositar(double valor) {
		if(valor <= 0) {
			return false;
		}
		saldo += valor;
			return true;
	}
	void print(){
		System.out.println("Numero: " + numero);
		System.out.println("Titular: " + titular);
		System.out.println("Saldo: " + saldo);
		System.out.println("Limite: " + limite);
		System.out.println();
		
		
	
	
		
	}
}

package uninter;

public class Avaliacao {
	//atributos
	double n1,n2,n3;

	//é p q eu possa colocar no parenteses la no outro, esse é p bene
	Avaliacao (double n1, double n2, double n3){
		this.n1 = n1;
		this.n2 = n2;
		this.n3 = n3;
	}
	
	Avaliacao (){ // esse vazio é p jao
	}
	
	//metodo
	public double mediaA() {
		return (n1+n2+n3)/3;
	}
	public double mediaP() {
		return (n1*2 + n2*3 + n3*4)/ 9; //é uma conta de matematica ponderada
	}
	
	public void prints() {
		System.out.println("media aritimetica da bene: " + mediaA());
		System.out.println("media ponderada da bene: " + mediaP());
		System.out.println();
}
	void prints1() {
		System.out.println("media aritimetica do jao: " + mediaA());
		System.out.println("media ponderada do jao: " + mediaP());
	}
}


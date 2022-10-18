package uninter;

public class ExNota {
	//atributos
	private double nota1;
	private	double nota2;
	private int falta;
//------------------------------------------------------------	
	//para poder usar dentro do parenteses
	public ExNota(double nota1, double nota2, int falta) {
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.falta = falta;
	}
//-----------------------------------------------------------
	public int getFalta() {
		return falta;
	}

	public void setFalta(int falta) {
		if(falta > 7) {
			System.out.println("Reprovado por faltas");
		}
		this.falta = falta;
	}

	void resultado() {
		double media = (nota1 + nota2)/2;
		System.out.println("Media: " + media);
		if(media <4) {
			System.out.println("Reprovado");
			System.out.println();

		}else if (media <7) {
			System.out.println("Exame");
			System.out.println();

		}else {
			System.out.println("Aprovado");
			System.out.println();

		}
	}

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		if (nota1 < 0 || nota1 > 10) {
			System.out.println("Nota invalida");
			return;
		}
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		if(nota2 < 0 || nota2 > 10) {
			System.out.println("Nota invalida");
		}
		this.nota2 = nota2;
	}

}


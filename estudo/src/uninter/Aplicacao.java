package uninter;

import javax.print.PrintService;

public class Aplicacao {
	public static void main(String[] args) {
//		
//		Avaliacao bene = new Avaliacao(7, 4, 10); //colocar nos parenteses já
//		bene.prints();
//		
//		//aqui eu vou ter q colocar em baixo os atributos, sem utilizar o this
//		Avaliacao jao = new Avaliacao();
//			jao.n1 = 1;
//			jao.n2 = 2;
//			jao.n3 = 9;
//	
//			jao.prints1();
//	}
//----------------------------------------------------------------------------------
	
//		ExAluno a1 = new ExAluno("Robin", "computacao", new Avaliacao(9,10,3));
//		ExAluno a2 = new ExAluno("Zoe", "fisica", new Avaliacao(6,3,2));
//		
//		a1.prints2();
//		a2.prints2();
		
//------------------------------------------------------------------------------------
		/*
		ExConta c = new ExConta(30989, "Andressa Rodrigues", 2000, 500);
		
		c.print();
		
		c.sacar(200);
		c.depositar(500);
		c.print();
		*/
//------------------------------------------------------------------------------------
			ExNota n1 = new ExNota(9,10,5);
			n1.resultado();
			n1.setNota1(2);
			n1.resultado();
		/*	
		n1.setNota1(9);
		n1.setNota2(10);
		n1.setFalta(5);
		n1.resultado();
		
		//até aqui vai fica aprovado e aprovado
		n1.setNota1(2); // aqui eu mudei entao aqui fica de exame
		n1.setFalta(10);
		n1.resultado();
		*/
	}						

}





package visibilidade;

import java.util.ArrayList;

public class ExCofrinho {
	ArrayList<ExMoeda> moeda = new ArrayList();
	
	public double calcularTotal() {
		double total=0;
		for(ExMoeda m : moeda) {
			total += m.getValor();
		}
		return total;
	}
	
	void add(ExMoeda m) {
		moeda.add(m);

	}
}

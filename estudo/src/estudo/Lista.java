package estudo;

import java.util.HashMap;

public class Lista {
	public static void main(String[] args) {
		
	
	//arraylist <nome de classe (Integer)> nome que quero dar = instancia
	/*
		ArrayList<String> pessoas = new ArrayList();
		
		pessoas.add("Andressinha");
		pessoas.add("Bia");
		pessoas.add("tui");
		pessoas.add("safari");
		
		System.out.println(pessoas.get(1));
		System.out.println(pessoas);
		pessoas.remove(1);
		System.out.println(pessoas);

		*/
	
	//put colocar
	HashMap<String, String> capitais = new HashMap();
	capitais.put("Brasil", "Brasilia");
	capitais.put("Argentina", "Buenos Aires");
	capitais.put("EUA", "Washington");
	System.out.println(capitais);
	// vai puxar a capital do br
	System.out.println(capitais.get("Brasil"));
}

}
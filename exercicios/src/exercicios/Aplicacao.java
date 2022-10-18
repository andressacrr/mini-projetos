package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Aplicacao {
	public static void main(String[] args) {
		/*
	String nome;
	int idade;
	Scanner sc = new Scanner(System.in);
	Pessoas p = new Pessoas();
	
	System.out.println("Seu nome: ");
	nome = sc.next();
	
	System.out.println("Sua idade: ");
	idade = sc.nextInt();
	
	//mudar para pegar o nome do scanner
	p.setNome(nome);
	p.setIdade(idade);
	//mostra é o print que fiz na classe Pessoas
	p.mostra();
		*/
//------------------------------------------------------------------------		
		/*
		Product product = new Product();
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		product.name = sc.next();
		System.out.print("Price: ");
		product.price = sc.nextDouble();
		System.out.print("Quantity in stock: ");
		product.quantity = sc.nextInt();
		
		System.out.println(product); // esse product esta ligado ao toString
		System.out.println();
		
		System.out.print("Added numbers in stock: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		
		System.out.println("New stock: " + product);
		System.out.println();
		
		System.out.print("Remove numbers in stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		System.out.println("New stock: " + product);
		sc.close();
*/
//--------------------------------------------------------------------------
		//dentro do construtor Product "()"
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = sc.next();
		System.out.print("Price: ");
		double price = sc.nextDouble();
		System.out.print("Quantity in stock: ");
		int quantity = sc.nextInt();
		
		//mudou isso@@@
		Product product = new Product(name,price,quantity);
		
		System.out.println(product); // esse product esta ligado ao toString
		System.out.println();
		
		System.out.print("Added numbers in stock: ");
		quantity = sc.nextInt();
		product.addProducts(quantity);
		
		
		
	}
}

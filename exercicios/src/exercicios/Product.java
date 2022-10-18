package exercicios;

public class Product {
	public String name;
	public double price;
	public int quantity;

	public double totalValueInStock() {
		return price * quantity;
	}

	public void addProducts(int quantity) {
		this.quantity += quantity;
	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

// faz referencia ao product na hora do print, o java ja le como um print se estiver entre parenteses na frente do sout
	public String toString() { // String seria as letras, os prints aqui
		return name 
				+ ", $ " 
				+ String.format("%.2f", price)
				// + price
				+ ", " 
				+ quantity 
				+ " units, Total: $ " 
				+ String.format("%.2f", totalValueInStock());
				// + totalValueInStock();

	}
//-----------------------------------------------------------------------------
//mudou isso@@@   --- isso chama construtor (this.)
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
}

package consumer;

public class Product{

	private String name;
	private Double price;

	public Product() {
	}

	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return String.format("Product [name= %s, price= %.2f",this.getName().toUpperCase(),this.getPrice());
	}

//Consumer com reference metodos staticos e instanciado
	public static void isStaticMaior(Product p) {
		p.setPrice(p.getPrice()*1.1);
	}
	public void isIntanceMaior() {
		this.setPrice(this.getPrice()*1.1);
	}
}

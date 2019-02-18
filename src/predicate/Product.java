package predicate;

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
		return "Product [name=" + name + ", price=" + price + "]";
	}

//Predicado com reference metodo statics e instanciado
	public static boolean isStaticMaior(Product p) {
		return p.getPrice() >= 1000.0;
	}
	public boolean isIntanceMaior() {
		return getPrice() >= 1000.0;
	}
}

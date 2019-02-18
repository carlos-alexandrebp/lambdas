package predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import predicate.Product;



public class Run{
	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();

		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));
		
		
//predicado com variavel	
		Predicate<Product> a = p -> p.getPrice() >= 1000.0;
		
		
		
//predicado inline
		list.removeIf(p -> p.getPrice() >= 1000.0);

		for (Product p : list) {
			System.out.println(p);
		}
	}
}
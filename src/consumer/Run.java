package consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import consumer.Product;



public class Run{
	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();

		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));
		
		
//consumer com variavel	
		Consumer<Product> a = p -> p.setPrice(p.getPrice()*1.1);
		
		
		
//cosumer inline
		list.forEach(p -> p.setPrice(p.getPrice()*1.1));

		list.forEach(System.out:: println);
			
		
	}
}
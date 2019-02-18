package predicate;

import java.util.function.Predicate;

public class ComInterface implements Predicate<Product>{

@Override
	public boolean test(Product p) {
		return p.getPrice() >= 1000.0;
	}

}
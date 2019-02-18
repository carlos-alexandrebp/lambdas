package consumer;
import java.util.function.Consumer;

public class ComInterface implements Consumer<Product>{


@Override
	public void accept(Product t) {
		t.setPrice(t.getPrice()*1.1);
	}

}
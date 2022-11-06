package salestracker.salesbackend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import salestracker.salesbackend.model.Products;
import salestracker.salesbackend.repository.ProductRepository;

@SpringBootApplication
public class SalesBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(SalesBackendApplication.class, args);
	}

//	@Autowired
//	private ProductRepository productRepository;

//	@Override
//	public void run(String... args) throws Exception {
//		Products product = new Products();
//		product.setName("Harley Bike");
//		product.setManufacturer("Harley-Davidson");
//		product.setStyle("German");
//		product.setPurchasePrice(4900.00);
//		product.setSalePrice(5000.00);
//		product.setQuantity(60);
//		product.setCommissionPercent(61);
//		productRepository.save(product);
//	}
}

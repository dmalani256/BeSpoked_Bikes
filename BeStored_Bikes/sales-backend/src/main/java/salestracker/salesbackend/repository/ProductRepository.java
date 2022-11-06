package salestracker.salesbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import salestracker.salesbackend.model.Products;

public interface ProductRepository extends JpaRepository<Products, Integer> {
    // all crud database
}

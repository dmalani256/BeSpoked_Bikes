package salestracker.salesbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import salestracker.salesbackend.model.Sales;

public interface SalesRepository extends JpaRepository<Sales, Integer> {
}

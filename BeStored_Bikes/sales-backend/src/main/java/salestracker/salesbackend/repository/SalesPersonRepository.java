package salestracker.salesbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import salestracker.salesbackend.model.SalesPerson;

public interface SalesPersonRepository extends JpaRepository<SalesPerson, Integer> {
}

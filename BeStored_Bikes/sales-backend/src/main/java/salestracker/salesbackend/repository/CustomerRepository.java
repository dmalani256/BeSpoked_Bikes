package salestracker.salesbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import salestracker.salesbackend.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}

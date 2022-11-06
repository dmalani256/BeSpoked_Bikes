package salestracker.salesbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import salestracker.salesbackend.model.Discount;

public interface DiscountRepository extends JpaRepository<Discount, Integer> {
}

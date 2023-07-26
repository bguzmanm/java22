package cl.awakelab.java22.model.persistence.repository;

import cl.awakelab.java22.model.persistence.entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<CustomerEntity, Integer> {
}

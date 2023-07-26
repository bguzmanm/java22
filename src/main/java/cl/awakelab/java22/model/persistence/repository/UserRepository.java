package cl.awakelab.java22.model.persistence.repository;

import cl.awakelab.java22.model.persistence.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, String> {
}

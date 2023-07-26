package cl.awakelab.java22.model.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="customer")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CustomerEntity {
  @Id
  @Column(name = "customer_id")
  private int id;
  private String firstName;
  private String lastName;
  private String email;
  //TODO: reemplazar por entidad
  private int addressId;
  private boolean active;

}

package cl.awakelab.java22.model.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CustomerDTO {
  private int id;
  private String firstName;
  private String lastName;
  private String email;
  //TODO: reemplazar por entidad
  private int addressId;
  private boolean active;
}

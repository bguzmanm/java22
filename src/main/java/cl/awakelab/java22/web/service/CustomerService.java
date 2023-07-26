package cl.awakelab.java22.web.service;

import cl.awakelab.java22.model.domain.dto.CustomerDTO;

import java.util.List;
import java.util.Optional;

public interface CustomerService {
  Optional<List<CustomerDTO>> findAll();
  Optional<CustomerDTO> findOne(int id);
  Optional<CustomerDTO> create(CustomerDTO customerDTO);
  Optional<CustomerDTO> update(CustomerDTO customerDTO);
  void delete(int id);

}

package cl.awakelab.java22.model.domain.service;

import cl.awakelab.java22.model.domain.dto.CustomerDTO;
import cl.awakelab.java22.model.persistence.mapping.CustomerMapper;
import cl.awakelab.java22.model.persistence.repository.CustomerRepository;
import cl.awakelab.java22.web.service.CustomerService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService {

  private final CustomerRepository repository;
  private final CustomerMapper mapper;

  public CustomerServiceImpl(CustomerRepository repository, CustomerMapper mapper) {
    this.repository = repository;
    this.mapper = mapper;
  }

  @Override
  public Optional<List<CustomerDTO>> findAll() {
    return Optional.of(mapper.toCustomerDTO(repository.findAll()));
  }

  @Override
  public Optional<CustomerDTO> findOne(int id) {
    return repository.findById(id).map(mapper::toCustomerDTO);
  }

  @Override
  public Optional<CustomerDTO> create(CustomerDTO customerDTO) {
    return Optional.of(
            mapper.toCustomerDTO(
              repository.save(
                      mapper.toCustomerEntity(customerDTO)
              )
            )
    );
  }

  @Override
  public Optional<CustomerDTO> update(CustomerDTO customerDTO) {
    return Optional.of(
            mapper.toCustomerDTO(
                    repository.save(
                            mapper.toCustomerEntity(customerDTO)
                    )
            )
    );
  }

  @Override
  public void delete(int id) {
    repository.deleteById(id);
  }
}

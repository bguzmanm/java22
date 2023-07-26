package cl.awakelab.java22.model.persistence.mapping;

import cl.awakelab.java22.model.domain.dto.CustomerDTO;
import cl.awakelab.java22.model.persistence.entity.CustomerEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CustomerMapper {

  @Mappings({})
  CustomerDTO toCustomerDTO(CustomerEntity customerEntity);
  List<CustomerDTO> toCustomerDTO(List<CustomerEntity> customerEntities);
  @InheritInverseConfiguration
  CustomerEntity toCustomerEntity(CustomerDTO customerDTO);
}

package cl.awakelab.java22.web.controller;

import cl.awakelab.java22.model.domain.dto.CustomerDTO;
import cl.awakelab.java22.web.service.CustomerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/customer")
public class CustomerRestController {
  private final CustomerService service;

  public CustomerRestController(CustomerService service) {
    this.service = service;
  }

  @GetMapping("/all")
  public ResponseEntity<List<CustomerDTO>> findAll(){
    return service.findAll()
            .map(customer -> new ResponseEntity<>(customer, HttpStatus.OK))
            .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
  }
}

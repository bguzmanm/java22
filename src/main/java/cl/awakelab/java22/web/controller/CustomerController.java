package cl.awakelab.java22.web.controller;

import cl.awakelab.java22.web.service.CustomerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {
  private final CustomerService service;
  public CustomerController(CustomerService service) {
    this.service = service;
  }

  @GetMapping
  public String findAll(Model model){
    model.addAttribute("customers", service.findAll());
    return "customersList";
  }
}

package be.frederikcollignon.order.api;

import be.frederikcollignon.order.service.CustomerService;
import be.frederikcollignon.order.service.dto.request.CreateCustomerDTO;
import be.frederikcollignon.order.service.dto.response.CustomerDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/customers", produces = "application/json")
public class CustomerController {

    //    private CustomerService customerService;
//
//    @Autowired
//    public CustomerController(CustomerService customerService) {
//        this.customerService = customerService;
//    }
//
    @PostMapping(consumes = "application/json")
    public String createCustomer(@RequestBody CreateCustomerDTO createCustomerDTO) {
        //return customerService.createCustomer(createCustomerDTO);
        System.out.println(createCustomerDTO);
        return "succes";
    }
}

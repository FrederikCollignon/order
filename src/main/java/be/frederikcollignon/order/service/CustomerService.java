package be.frederikcollignon.order.service;

import be.frederikcollignon.order.domain.entity.Customer;
import be.frederikcollignon.order.domain.repository.CustomerRepository;
import be.frederikcollignon.order.service.dto.request.CreateCustomerDTO;
import be.frederikcollignon.order.service.dto.response.CustomerDTO;
import be.frederikcollignon.order.service.mapper.CustomerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class CustomerService {

//    private CustomerRepository customerRepository;
//    private CustomerMapper customerMapper;
//
//    @Autowired
//    public CustomerService(CustomerRepository customerRepository, CustomerMapper customerMapper) {
//        this.customerRepository = customerRepository;
//        this.customerMapper = customerMapper;
//    }

    public String createCustomer(CreateCustomerDTO createCustomerDTO) {
        System.out.println(createCustomerDTO);
        return "succes1";

//        Customer customer = customerMapper.fromDto(createCustomerDTO);
//        Customer createdCustomer = customerRepository.save(customer);
//        return customerMapper.toDto(createdCustomer);
    }
}

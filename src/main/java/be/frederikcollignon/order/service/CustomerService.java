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

    private CustomerRepository customerRepository;
    private CustomerMapper customerMapper;

    @Autowired
    public CustomerService(CustomerMapper customerMapper, CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
        this.customerMapper = customerMapper;
    }

    public String createCustomer(CreateCustomerDTO createCustomerDTO) {
        Customer customer = customerMapper.fromDto(createCustomerDTO);
        Customer createdCustomer = customerRepository.save(customer);
        System.out.println(createdCustomer);
        return "succes3";


//        return customerMapper.toDto(createdCustomer);
    }
}

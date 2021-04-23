package be.frederikcollignon.order.domain.repository;

import be.frederikcollignon.order.domain.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}

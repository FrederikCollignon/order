package be.frederikcollignon.order.domain.repository;

import be.frederikcollignon.order.domain.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Integer> {
}

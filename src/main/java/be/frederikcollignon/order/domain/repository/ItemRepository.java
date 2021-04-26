package be.frederikcollignon.order.domain.repository;

import be.frederikcollignon.order.domain.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Integer> {
}

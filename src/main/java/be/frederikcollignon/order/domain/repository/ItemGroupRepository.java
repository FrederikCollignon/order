package be.frederikcollignon.order.domain.repository;

import be.frederikcollignon.order.domain.entity.ItemGroup;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemGroupRepository extends JpaRepository<ItemGroup, Integer> {
}

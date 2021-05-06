package be.frederikcollignon.order.service;

import be.frederikcollignon.order.domain.entity.ItemGroup;
import be.frederikcollignon.order.service.dto.request.CreateItemGroupDTO;
import be.frederikcollignon.order.service.mapper.ItemGroupMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class OrderService {

    private final ItemGroupMapper itemGroupMapper;

    @Autowired
    public OrderService(ItemGroupMapper itemGroupMapper) {
        this.itemGroupMapper = itemGroupMapper;
    }

    public String getString() {
        return "something";
    }

    public String createItemGroup(CreateItemGroupDTO createItemGroupDTO) {
        ItemGroup itemGroup = itemGroupMapper.fromDto(createItemGroupDTO);
        System.out.println(itemGroup);
        return "createItemGroup works";
    }

//    public ItemDTO addItem(AddItemDTO addItemDTO) {
//        Item item = itemMapper.fromDto(addItemDTO);
//        Item addedItem = itemRepository.save(item);
//        return itemMapper.toDto(addedItem);
//    }
}

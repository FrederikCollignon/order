package be.frederikcollignon.order.service;

import be.frederikcollignon.order.domain.entity.Item;
import be.frederikcollignon.order.domain.repository.ItemRepository;
import be.frederikcollignon.order.service.dto.request.AddItemDTO;
import be.frederikcollignon.order.service.dto.response.ItemDTO;
import be.frederikcollignon.order.service.mapper.ItemMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class ItemService {

    private ItemRepository itemRepository;
    private ItemMapper itemMapper;

    @Autowired
    public ItemService(ItemRepository itemRepository, ItemMapper itemMapper) {
        this.itemRepository = itemRepository;
        this.itemMapper = itemMapper;
    }

    public ItemDTO addItem(AddItemDTO addItemDTO) {
        Item item = itemMapper.fromDto(addItemDTO);
        Item addedItem = itemRepository.save(item);
        return itemMapper.toDto(addedItem);
    }
}

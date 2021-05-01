package be.frederikcollignon.order.api;

import be.frederikcollignon.order.service.ItemService;
import be.frederikcollignon.order.service.dto.request.AddItemDTO;
import be.frederikcollignon.order.service.dto.response.ItemDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/items", produces = "application/json")
public class ItemController {

    private final ItemService itemService;

    @Autowired
    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @PostMapping(consumes = "application/json")
    public ItemDTO addItem(@RequestBody AddItemDTO addItemDTO) {
        return itemService.addItem(addItemDTO);
    }

}

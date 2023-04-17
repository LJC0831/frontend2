package org.ljc.galley.backend.controller;

import java.util.List;

import org.ljc.galley.backend.entity.Item;
import org.ljc.galley.backend.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemController {

    @Autowired
    ItemRepository itemRepository;

    @GetMapping("/api/items")
    public List<Item> getItems(){
        List<Item> items = itemRepository.findAll();


        return items;
    }
    
}

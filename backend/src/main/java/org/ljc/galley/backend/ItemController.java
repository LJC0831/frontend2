package org.ljc.galley.backend;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemController {
    @GetMapping("/api/items")
    public List<String> getItems(){
        List<String> items = new ArrayList<>();
        items.add("1번 상품");
        items.add("2번 상품");
        items.add("3번 상품");
        items.add("4번 상품");
        items.add("5번 상품");
        items.add("6번 상품");

        return items;
    }
    
}

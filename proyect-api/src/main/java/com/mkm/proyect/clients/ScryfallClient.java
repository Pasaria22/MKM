package com.mkm.proyect.clients;

import com.mkm.proyect.dtos.CardDto;
import com.mkm.proyect.responses.ScryfallListResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(name = "scryfall-client", url = "${scryfall.url}")
public interface ScryfallClient {

    @GetMapping("/cards/search?q=c:white+cmc=1")
    ScryfallListResponse searchList();

    @GetMapping("/cards/search?q=name:\"{name}\"")
    ScryfallListResponse searchByName(@PathVariable("name") String name);

}

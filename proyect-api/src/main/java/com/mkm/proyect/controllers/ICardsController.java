package com.mkm.proyect.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.IOException;

public interface ICardsController {

    @GetMapping("/products/list")
    void getCardsByName(@RequestParam String name) throws IOException;
}

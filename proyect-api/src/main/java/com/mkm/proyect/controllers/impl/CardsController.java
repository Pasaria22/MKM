package com.mkm.proyect.controllers.impl;

import com.mkm.proyect.controllers.ICardsController;
import com.mkm.proyect.services.ICardsService;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class CardsController implements ICardsController {

    private final ICardsService productsService;

    public CardsController(ICardsService productsService) {
        this.productsService = productsService;
    }

    @Override
    public void getCardsByName(String name) throws IOException {
        productsService.getCardsByName(name);
    }
}

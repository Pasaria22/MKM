package com.mkm.proyect.services.impl;

import com.mkm.proyect.clients.ScryfallClient;
import com.mkm.proyect.dtos.CardDto;
import com.mkm.proyect.responses.ScryfallListResponse;
import com.mkm.proyect.services.ICardsService;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Log4j2
@Service
public class CardsService implements ICardsService {

    private final ScryfallClient scryfallClient;

    public CardsService(ScryfallClient scryfallClient) {
        this.scryfallClient = scryfallClient;
    }

    @Override
    public void getCardsByName(String name) throws IOException {
        ScryfallListResponse response = scryfallClient.searchByName(name);
        log.info(response);
    }

}

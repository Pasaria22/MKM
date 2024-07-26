package com.mkm.proyect.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.mkm.proyect.dtos.CardDto;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class ScryfallListResponse {

    private String object;

    @JsonProperty("task_id")
    private boolean hasMore;

    @JsonProperty("next_page")
    private String nextPage;

    @JsonProperty("total_cards")
    private Integer totalCards;

    private List<CardDto> data;



}

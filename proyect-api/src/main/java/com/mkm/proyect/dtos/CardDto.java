package com.mkm.proyect.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.mkm.proyect.enums.ColorEnum;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class CardDto {

    private String object;
    private String id;

    @JsonProperty("oracle_id")
    private String oracleId;

    @JsonProperty("cardmarket_id")
    private Integer cardmarketId;

    private String name;
    private String lang;

    @JsonProperty("released_at")
    private String releaseDate;

    private String uri;

    @JsonProperty("scryfall_uri")
    private String scryfallUri;

    @JsonProperty("image_uris")
    private ImageTypeDto imageUris;

    @JsonProperty("mana_cost")
    private String manaCost;

    private Integer cmc;

    @JsonProperty("type_line")
    private String typeLine;

    @JsonProperty("oracle_text")
    private String oracleText;

    private String power;

    private String toughness;

    private List<ColorEnum> colors;

    private LegalitiesDto legalities;

    private List<String> games;

    private boolean foil;

    private boolean nonfoil;

    private boolean promo;

    private boolean reprint;

    private boolean variation;

    private boolean digital;

    private boolean booster;

    @JsonProperty("set_id")
    private String setId;

    private String set;

    @JsonProperty("set_name")
    private String setName;

    @JsonProperty("set_type")
    private String setType;

    private String rarity;

    private String artist;

    private String frame;

}

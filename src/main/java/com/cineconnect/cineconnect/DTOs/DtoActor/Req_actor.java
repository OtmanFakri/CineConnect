package com.cineconnect.cineconnect.DTOs.DtoActor;


import com.cineconnect.cineconnect.DTOs.DtoFilm.FilmDto;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import org.jetbrains.annotations.NotNull;

import java.util.List;

@Getter
@Setter
public class Req_actor {

    @JsonProperty("name")
    @NotNull
    private String name;
    @JsonProperty("films")
    @NotNull
    private List<FilmDto> films;
}

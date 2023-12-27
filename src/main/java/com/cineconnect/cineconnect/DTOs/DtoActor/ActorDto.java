package com.cineconnect.cineconnect.DTOs.DtoActor;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ActorDto {
    private Long id;
    private String name;
    private int filmCount;


    public ActorDto(Long id, String name, int filmCount) {
        this.id = id;
        this.name = name;
        this.filmCount = filmCount;
    }
}

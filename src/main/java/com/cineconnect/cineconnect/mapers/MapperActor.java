package com.cineconnect.cineconnect.mapers;

import com.cineconnect.cineconnect.DTOs.DtoActor.ActorDto;
import com.cineconnect.cineconnect.model.Actor;

public class MapperActor {

    public static ActorDto convertToDTO(Actor actor) {
        int filmCount = actor.getFilms().size();
        return new ActorDto(actor.getId(), actor.getName(), filmCount);
    }
}

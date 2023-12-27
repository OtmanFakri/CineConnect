package com.cineconnect.cineconnect.mapers;

import com.cineconnect.cineconnect.DTOs.DtoActor.ActorDto;
import com.cineconnect.cineconnect.DTOs.DTOFilmsByActorId;
import com.cineconnect.cineconnect.model.Actor;

import java.util.Set;
import java.util.stream.Collectors;

public class MapperFilmsByActorId {

    public static DTOFilmsByActorId convertToDTO(Actor actor) {
        Set<DTOFilmsByActorId.FilmDetails> filmDetails = actor.getFilms().stream()
                .map(film ->
                        new DTOFilmsByActorId.FilmDetails(
                                film.getId(),
                                film.getName(),
                                film.getMovieSaga()
                        )
                )
                .collect(Collectors.toSet());

        ActorDto actorDto = new ActorDto(actor.getId(), actor.getName(), filmDetails.size());
        return new DTOFilmsByActorId(actorDto, filmDetails);
    }
}


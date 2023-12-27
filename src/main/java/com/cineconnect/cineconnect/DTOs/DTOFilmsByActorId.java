package com.cineconnect.cineconnect.DTOs;

import com.cineconnect.cineconnect.DTOs.DtoActor.ActorDto;
import com.cineconnect.cineconnect.model.MovieSaga;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Set;

public class DTOFilmsByActorId {

    @JsonProperty("actor")
    private ActorDto actor;

    @JsonProperty("films")
    private Set<FilmDetails> films;

    // Constructors, getters, setters, etc.

    public DTOFilmsByActorId(ActorDto actor, Set<FilmDetails> films) {
        this.actor = actor;
        this.films = films;
    }

    // Inner class for film details
    public static class FilmDetails {
        @JsonProperty("id")
        private Long id;
        @JsonProperty("name")
        private String name;
        @JsonProperty("movieSaga")
        private MovieSaga movieSaga;

        public FilmDetails(Long id, String name, MovieSaga movieSaga) {
            this.id = id;
            this.name = name;
            this.movieSaga = movieSaga;
        }


    }

}

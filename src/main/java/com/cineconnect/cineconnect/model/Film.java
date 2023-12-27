package com.cineconnect.cineconnect.model;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.cineconnect.cineconnect.model.*;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.jetbrains.annotations.NotNull;


@Getter
@Setter
@Entity
public class Film {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToMany(fetch = FetchType.LAZY,
            cascade = {
                    CascadeType.PERSIST,
                    CascadeType.MERGE
            })
    @JoinTable(name = "FilmActor",
            joinColumns = @JoinColumn(name = "filmId", nullable = false),
            inverseJoinColumns = @JoinColumn(name = "actorId", nullable = false))
    @NotNull
    @JsonIgnore
    private Set<Actor> actors = new HashSet<>();

    private String name;

    @ManyToMany
    @JoinTable(name = "DirectedBy", joinColumns = @JoinColumn(name = "filmId", nullable = false), inverseJoinColumns = @JoinColumn(name = "directorId", nullable = false))
    @NotNull
    @JsonIgnore
    private Set<Director> directors= new HashSet<>();
    @ManyToOne(optional = false)
    @JoinColumn(name = "movieSagaId", nullable = false)
    @NotNull
    private MovieSaga movieSaga;

}
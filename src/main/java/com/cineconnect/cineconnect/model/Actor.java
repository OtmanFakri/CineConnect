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
public class Actor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String name;
    @ManyToMany(fetch = FetchType.LAZY,
            cascade = {
                    CascadeType.PERSIST,
                    CascadeType.MERGE
            }
            ,mappedBy = "actors")
    @NotNull
    private Set<Film> films = new HashSet<>();

}
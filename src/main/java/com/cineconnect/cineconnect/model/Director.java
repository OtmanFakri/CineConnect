package com.cineconnect.cineconnect.model;

import java.util.List;
import jakarta.persistence.*;
import com.cineconnect.cineconnect.model.*;
import lombok.Getter;
import lombok.Setter;
import org.jetbrains.annotations.NotNull;

@Getter
@Setter
@Entity
public class Director {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @ManyToMany(mappedBy = "directors")
    @NotNull
    private List<Film> films;

}
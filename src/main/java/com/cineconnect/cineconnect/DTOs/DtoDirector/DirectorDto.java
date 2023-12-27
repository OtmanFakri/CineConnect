package com.cineconnect.cineconnect.DTOs.DtoDirector;


import com.cineconnect.cineconnect.DTOs.DtoFilm.FilmDto;
import com.cineconnect.cineconnect.model.Director;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
public class DirectorDto {

    private Long id;
    private String name;
    private List<FilmDto> films;  // Using FilmDto to represent films associated with the director

    // Default constructor
    public DirectorDto() {}

    // Copy constructor to convert Entity to DTO
    public DirectorDto(Director director) {
        this.id = director.getId();
        this.name = director.getName();

        // Convert list of Film entities to list of FilmDto
        if (director.getFilms() != null) {
            this.films = director.getFilms().stream().
                    map(FilmDto::new).collect(Collectors.toList());
        }
    }

    // Convert DTO back to entity if needed
    public Director toEntity() {
        com.cineconnect.cineconnect.model.Director director = new com.cineconnect.cineconnect.model.Director();
        director.setId(this.id);
        director.setName(this.name);

        // Convert list of FilmDto to list of Film entities if needed
        // For simplicity, let's assume we're not converting back here.
        // If needed, you can add logic to convert FilmDto back to Film entity.

        return director;
    }
}


package com.cineconnect.cineconnect.DTOs.DtoFilm;

import com.cineconnect.cineconnect.model.Film;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.jetbrains.annotations.NotNull;

@Getter
@Setter
@ToString
public class FilmDto {

    @NotNull
    private Long id;

    @NotNull
    private String name;
    @NotNull
    private Long movieSagaId;  // Assuming you want to represent the movieSagaId for some use cases

    // Other DTO fields can be added as needed based on your requirements.

    // Constructor
    public FilmDto() {}

    // Copy constructor
    public FilmDto(Film film) {
        this.id = film.getId();
        this.name = film.getName();
        if (film.getMovieSaga() != null) {
            this.movieSagaId = film.getMovieSaga().getId();
        }
        // You can copy other fields as needed.
    }

    // Convert DTO back to entity if needed
    public Film toEntity() {
        Film film = new Film();
        film.setId(this.id);
        film.setName(this.name);
        // Set other fields if needed.
        return film;
    }
}

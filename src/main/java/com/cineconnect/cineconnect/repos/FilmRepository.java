package com.cineconnect.cineconnect.repos;

import com.cineconnect.cineconnect.model.Director;
import com.cineconnect.cineconnect.model.Film;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmRepository extends JpaRepository<Film, Long> {
}

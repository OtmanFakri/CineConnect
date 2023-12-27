package com.cineconnect.cineconnect.repos;

import com.cineconnect.cineconnect.model.Director;
import com.cineconnect.cineconnect.model.MovieSaga;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DirectorRepository extends JpaRepository<Director, Long> {
}


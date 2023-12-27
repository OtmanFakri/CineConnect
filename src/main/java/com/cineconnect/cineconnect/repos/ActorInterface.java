package com.cineconnect.cineconnect.repos;

import com.cineconnect.cineconnect.model.Actor;
import com.cineconnect.cineconnect.model.Film;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActorInterface extends JpaRepository<Actor, Long> {
}


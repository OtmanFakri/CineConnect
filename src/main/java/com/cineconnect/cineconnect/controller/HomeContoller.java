package com.cineconnect.cineconnect.controller;

import com.cineconnect.cineconnect.DTOs.DtoActor.ActorDto;
import com.cineconnect.cineconnect.DTOs.DTOFilmsByActorId;
import com.cineconnect.cineconnect.DTOs.DtoActor.Req_actor;
import com.cineconnect.cineconnect.service.ActorService;
import com.cineconnect.cineconnect.util.ConsoleFormatter;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class HomeContoller {


    private final ActorService actorService;

    @Autowired
    public HomeContoller(ActorService actorService) {
        this.actorService = actorService;
    }


    @GetMapping("/")
    public String index() {
        return "Hello World!";
    }


    @GetMapping("/actors")
    public ResponseEntity<List<ActorDto>> actors() {
        List<ActorDto> actors = actorService.getAllActors();
        return ResponseEntity.ok(actors);
    }

    @GetMapping(value = "{actorId}/films", produces = "application/json")
    public ResponseEntity<DTOFilmsByActorId> getFilmByActorId(@PathVariable Long actorId) {
        System.out.println("actorId = " + actorId);
        DTOFilmsByActorId dto = actorService.getFilmsByActorId(actorId);
        return ResponseEntity.ok(dto);
    }

    @PostMapping(value = "/actors", produces = "application/json")
    public Req_actor createActor(@RequestBody @Valid Req_actor actorDto) {
        ConsoleFormatter.printSuccess(actorDto.getFilms().toString());
        //ActorDto actor = actorService.createActor(actorDto);
        return actorDto;
    }


}

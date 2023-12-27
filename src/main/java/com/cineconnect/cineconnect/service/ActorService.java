package com.cineconnect.cineconnect.service;


import com.cineconnect.cineconnect.DTOs.DtoActor.ActorDto;
import com.cineconnect.cineconnect.DTOs.DTOFilmsByActorId;
import com.cineconnect.cineconnect.DTOs.DtoActor.Req_actor;
import com.cineconnect.cineconnect.mapers.MapperActor;
import com.cineconnect.cineconnect.mapers.MapperFilmsByActorId;
import com.cineconnect.cineconnect.model.Actor;
import com.cineconnect.cineconnect.repos.ActorInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ActorService {

    private final ActorInterface actorInterface;
    @Autowired
    public ActorService(ActorInterface actorInterface) {
        this.actorInterface = actorInterface;
    }

    //Methode to Get all Actors
    public List<ActorDto> getAllActors(){
        List<Actor> actors = actorInterface.findAll();
        return actors.stream()
                .map(MapperActor::convertToDTO)
                .collect(Collectors.toList());
    }

    //Methode to Get all Films by Actor ID
    public DTOFilmsByActorId getFilmsByActorId(Long actorId){
        Optional<Actor> optionalActor = actorInterface.findById(actorId);
        if(optionalActor.isPresent()){
            Actor actor = optionalActor.get();
            System.out.println(actor.getFilms());
            return MapperFilmsByActorId.convertToDTO(actor);
        }else {
            throw new RuntimeException("Actor not found with ID: " + actorId);
        }
    }

    public ActorDto createActor(Req_actor actorDto) {
        final Actor actor = new Actor();
        mapToEntity(actorDto, actor);
        return MapperActor.convertToDTO(actorInterface.save(actor));
    }


    private Actor mapToEntity(final Req_actor actorDTO, final Actor actor) {
        actor.setName(actorDTO.getName());
        return actor;
    }

}

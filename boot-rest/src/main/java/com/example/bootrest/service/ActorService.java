package com.example.bootrest.service;

import com.example.bootrest.entity.Actor;

import java.util.Optional;

public interface ActorService {

    Actor createActor (Actor actor);

    Optional<Actor> getActorById(int actorId);

    void deleteActorById(int actorId);

}

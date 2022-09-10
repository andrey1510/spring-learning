package com.example.bootrest.service;

import com.example.bootrest.entity.Actor;
import com.example.bootrest.repository.ActorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ActorServiceImpl implements ActorService {

    @Autowired
    private ActorRepository actorRepository;

    @Override
    public Actor createActor (Actor actor) {
        return actorRepository.save(actor);
    }

    @Override
    public Optional<Actor> getActorById(int actorId) {
        return actorRepository.findById(actorId);
    }

    @Override
    public void deleteActorById(int actorId) {
        actorRepository.deleteById(actorId);
    }



}

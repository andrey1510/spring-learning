package com.example.bootrest.controller;

import com.example.bootrest.entity.Actor;
import com.example.bootrest.service.ActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/actor2/")
public class ActorController {

    private ActorService actorService;

    @Autowired
    public ActorController(ActorService actorService) {
        this.actorService = actorService;
    }

    @GetMapping("{actor_id}")
    public Optional<Actor> getActorById(@PathVariable("actor_id") int actorId) {
        return actorService.getActorById(actorId);
    }

    @PostMapping
    public Actor createActor(@RequestBody Actor actor) {
        return actorService.createActor(actor);
    }

    @DeleteMapping("{actor_id}")
    void deleteActorById(@PathVariable("actor_id") int actorId) {
        actorService.deleteActorById(actorId);
    }

}

package com.eventsystem.api.controller;

import com.eventsystem.api.domain.event.Event;
import com.eventsystem.api.domain.event.EventDTO;
import com.eventsystem.api.services.EventService;
import com.sun.jdi.event.EventSet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/event")
public class EventController {

    @Autowired
    private EventService eventService;

    @PostMapping
    public ResponseEntity<Event> create(@RequestBody EventDTO body){

        Event newEvent = this.eventService.createEvent(body);
        return ResponseEntity.ok(newEvent);
    }
}

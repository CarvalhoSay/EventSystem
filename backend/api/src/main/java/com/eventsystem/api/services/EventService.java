package com.eventsystem.api.services;

import com.eventsystem.api.domain.event.Event;
import com.eventsystem.api.domain.event.EventDTO;
import com.eventsystem.api.repositories.EventRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.Date;

@Service
public class EventService {

    @Autowired
    EventRepositories eventRepositories;

    public Event createEvent(EventDTO data){


        Event newEvent = new Event();
        newEvent.setRemote(false);

       newEvent.setTitle(data.title());
       newEvent.setDescription(data.description());
       newEvent.setEventUrl(data.eventUrl());
       newEvent.setDate(new Date(data.date()));
       newEvent.setImgUrl(data.imgUrl());
       newEvent.setRemote(data.remote());


       return eventRepositories.save(newEvent);

    }

}

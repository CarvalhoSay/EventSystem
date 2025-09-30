package com.eventsystem.api.repositories;

import com.eventsystem.api.domain.event.Event;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface EventRepositories extends JpaRepository<Event, UUID> {


}

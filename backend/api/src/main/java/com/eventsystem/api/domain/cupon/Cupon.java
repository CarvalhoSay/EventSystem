package com.eventsystem.api.domain.cupon;

import com.eventsystem.api.domain.event.Event;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.UUID;

@Table (name = "cupon")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Cupon {

    @Id
    @GeneratedValue
    private UUID id;

    private Integer discount;
    private Date valid;

    @ManyToOne
    @JoinColumn(name = "event_id")
    private Event event;

}

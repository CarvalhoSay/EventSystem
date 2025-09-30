package com.eventsystem.api.repositories;

import com.eventsystem.api.domain.cupon.Cupon;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CuponRepositories extends JpaRepository<Cupon, UUID> {

    
}

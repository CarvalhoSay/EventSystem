package com.eventsystem.api.domain.event;

import org.springframework.web.multipart.MultipartFile;

import java.util.Date;

public record EventDTO(String title, String description, Long date, String city, String state, Boolean remote, String eventUrl, String imgUrl){
}

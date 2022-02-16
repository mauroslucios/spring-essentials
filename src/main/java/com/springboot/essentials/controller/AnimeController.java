package com.springboot.essentials.controller;

import com.springboot.essentials.domain.Anime;
import com.springboot.essentials.util.DateUtil;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping(value="/api/v1")
@Log4j2
@RequiredArgsConstructor
public class AnimeController {

    @Autowired
    private final DateUtil dateUtil;

    @GetMapping("/anime")
    public List<Anime> list(){
        log.info(dateUtil.formatLocalDateTimeToDatabaseStyle(LocalDateTime.now()));
        return List.of(new Anime("Goku"), new Anime("Hakusho"));
    }
}
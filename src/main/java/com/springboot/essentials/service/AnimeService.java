package com.springboot.essentials.service;

import com.springboot.essentials.repository.AnimeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor

public class AnimeService {

    private AnimeRepository animeRepository;

    public List<Anime> listAll(){
        return animeRepository.findAll();
    }
}

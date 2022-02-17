package com.springboot.essentials.service;

import com.springboot.essentials.domain.Anime;
import com.springboot.essentials.dto.AnimeDTO;
import com.springboot.essentials.repository.AnimeRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AnimeService {

    private final AnimeRepository animeRepository;

    public List<AnimeDTO> listAll(){
        List<Anime> animes = animeRepository.findAll();
        return AnimeDTO.converter(animes);
    }
}

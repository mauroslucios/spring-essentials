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

    public Anime findById(Long id){
        return animeRepository.findById(id).get();
    }

    public Anime insertAnime(AnimeDTO animeDTO){
        return animeRepository.save(Anime.builder().name(animeDTO.getName()).build());
    }

    public void deleteById(Long id){
        animeRepository.deleteById(id);
    }

    public void putAnimeById(AnimeDTO animeDTO){
        Anime savedAnime = findById(animeDTO.getId());
        Anime anime = Anime.builder()
                .id(savedAnime.getId())
                .name(animeDTO.getName())
                .build();
         animeRepository.save(anime);
    }
}

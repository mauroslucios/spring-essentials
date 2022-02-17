package com.springboot.essentials.dto;

import com.springboot.essentials.domain.Anime;
import lombok.Getter;

import java.util.List;
import java.util.stream.Collectors;

@Getter
public class AnimeDTO {

    private Long id;
    private String name;

    public AnimeDTO(Anime anime){
        this.name = anime.getName();
        this.id = anime.getId();
    }

    public static List<AnimeDTO> converter(List<Anime> animes){
        return animes.stream().map(AnimeDTO::new).collect(Collectors.toList());
    }
}

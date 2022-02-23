package com.springboot.essentials.dto;

import com.springboot.essentials.domain.Anime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@Data
@AllArgsConstructor
@NoArgsConstructor(force = true)
public class AnimeDTO {

    private Long id;
    private String name;

    public AnimeDTO(Anime anime){
        this.id = anime.getId();
        this.name = anime.getName();
    }

    public static List<AnimeDTO> converter(List<Anime> animes){
        return animes.stream().map(AnimeDTO::new).collect(Collectors.toList());
    }
}

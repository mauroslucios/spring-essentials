package com.springboot.essentials.controller;

import com.springboot.essentials.domain.Anime;
import com.springboot.essentials.dto.AnimeDTO;
import com.springboot.essentials.service.AnimeService;
import com.springboot.essentials.util.DateUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value="/api/v1")
@Log4j2
@Api(value="API REST Anime")
@CrossOrigin(origins="*")
public class AnimeController {

    private final DateUtil dateUtil;
    private final AnimeService animeService;

    @GetMapping(value ="/animes", produces="application/json")
    @ApiOperation(value="Retorna uma lista de animes")
    public List<AnimeDTO> list(){
        log.info(dateUtil.formatLocalDateTimeToDatabaseStyle(LocalDateTime.now()));
        return animeService.listAll();
    }

    @GetMapping(value="/animes/{id}", produces="application/json")
    @ApiOperation(value="Busca um único anime")
    public Anime findById(@PathVariable(value="id") Long id){
        return animeService.findById(id);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(value="/animes", produces="application/json")
    @ApiOperation(value="Salva um anime no banco")
    public Anime insertAnime(@RequestBody Anime anime){
        return animeService.insertAnime(anime);
    }

}

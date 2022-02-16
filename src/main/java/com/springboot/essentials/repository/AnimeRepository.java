package com.springboot.essentials.repository;

import com.springboot.essentials.domain.Anime;
import org.springframework.data.jpa.repository.JpaRepository;

public class AnimeRepository extends JpaRepository<Anime, Long> {
}

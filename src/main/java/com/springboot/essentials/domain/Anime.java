package com.springboot.essentials.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Entity
@Table(name="tb_anime")
@Data
@AllArgsConstructor
@NoArgsConstructor(force = true)
@Builder
public class Anime {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;


}

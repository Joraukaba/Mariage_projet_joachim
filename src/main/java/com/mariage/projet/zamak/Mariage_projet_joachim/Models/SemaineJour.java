package com.mariage.projet.zamak.Mariage_projet_joachim.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
public class SemaineJour {

    @Id
    @GeneratedValue
    private Integer id;

    private String description;

   @OneToMany(mappedBy = "semaineJour")
    private List<DetailMariage> detailMariageList;
}

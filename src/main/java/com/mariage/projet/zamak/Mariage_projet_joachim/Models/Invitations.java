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
public class Invitations {

    @Id
    @GeneratedValue
    private Integer id;

    @ManyToOne()
    @JoinColumn(name = "id_invite")
    private InviteMariage inviteMariage;

    private String codemariage;

    private String codeInvitation;

    private boolean validiteInvitation;
}

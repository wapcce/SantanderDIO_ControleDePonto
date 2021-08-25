package com.dio.SantanderDIO_ControleDePonto.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class Localidade {
    @Id
    private long id;
    @ManyToOne //um nivel de acesso pode ter varias localidades
    private NivelAcesso nivelAcesso;//isso é uma FK no bd
    private String descricao;
}

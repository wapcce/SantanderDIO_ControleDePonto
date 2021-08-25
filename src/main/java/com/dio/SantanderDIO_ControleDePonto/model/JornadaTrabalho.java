package com.dio.SantanderDIO_ControleDePonto.model;

import lombok.*;
import org.hibernate.envers.Audited;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder //ajuda a fazer teste de software e tb com dto
@Entity
@Audited //para fazer auditoria a tabela pode ser a tabela toda que é aqui ou só um campo que é
// colocado no campo
public class JornadaTrabalho {
    @Id
    @GeneratedValue
    private long id;
    private String descricao;
}

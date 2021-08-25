package com.dio.SantanderDIO_ControleDePonto.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class Movimentacao {

    @AllArgsConstructor
    @NoArgsConstructor
    @EqualsAndHashCode
    @Embeddable //para embutir a classe anônima abaixo, Serializable para conseguir transportar
    //dados pela rede, modifica de bytes para bits e vice versa
    public class MovimentacaoId implements Serializable{
        private long idMovimento; //pk
        private long idUsuario; //pk
        //são pk compostas
    }
    @Id

    @EmbeddedId // e com isso terminamos de conseguir relacionar um pk composta
    private MovimentacaoId id;
    private LocalDateTime dataEntrada;
    private LocalDateTime dataSaida;
    private BigDecimal periodo;
    @ManyToOne
    private Ocorrencia ocorrencia;
    @ManyToOne
    private Calendario calendario;
}

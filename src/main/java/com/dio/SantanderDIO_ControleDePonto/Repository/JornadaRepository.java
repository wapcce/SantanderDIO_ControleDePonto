package com.dio.SantanderDIO_ControleDePonto.Repository;

import com.dio.SantanderDIO_ControleDePonto.model.JornadaTrabalho;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JornadaRepository extends JpaRepository<JornadaTrabalho, Long> {
}

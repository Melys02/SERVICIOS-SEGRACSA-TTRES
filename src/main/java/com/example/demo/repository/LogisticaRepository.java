package com.example.demo.repository;

import com.example.demo.model.Logistica;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository

public interface LogisticaRepository extends JpaRepository<Logistica, Integer> {
    //Actualizar estadoEnvio por logistica
    @Transactional
    @Modifying
    @Query(value = "UPDATE logistica SET estadoEnvio=:estadoEnvio WHERE idlogistica=:idlogistica",
      nativeQuery = true)
    void actualizarEstadoLogistica(@Param("estadoEnvio") String estadoEnvio,
                                   @Param("idlogistica") String idlogistica);

}

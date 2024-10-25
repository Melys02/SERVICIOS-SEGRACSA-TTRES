package com.example.demo.repository;

import com.example.demo.model.Empaque;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmpaqueRepository extends JpaRepository<Empaque,Integer> {
    List<Empaque> findByPedidoId(Integer pedidoId);

   }

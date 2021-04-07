package com.project.cuadernoDeCampo.repository;

import com.project.cuadernoDeCampo.model.Parcela;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ParcelaRepository extends CrudRepository<Parcela, Integer> {

    List<Parcela> findAll();

    Parcela findById(int id);

    Parcela save(Parcela parcela);

    void deleteById(int id);

    @Query("SELECT p FROM Parcela p WHERE p.nombre_parcela like :name%")
    List<Parcela> findByCustomName(String name);
}

package com.project.cuadernoDeCampo.repository;

import com.project.cuadernoDeCampo.model.Lluvia;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LluviaRepository extends CrudRepository<Lluvia, Integer> {

    List<Lluvia> findAll();

    Lluvia findById(int id);

    Lluvia save(Lluvia parcela);

    void deleteById(int id);

    @Query("SELECT l FROM Lluvia l WHERE l.nombre like :name%")
    List<Lluvia> findByCustomName(String name);

}

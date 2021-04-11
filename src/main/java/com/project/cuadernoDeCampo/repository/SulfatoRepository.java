package com.project.cuadernoDeCampo.repository;

import com.project.cuadernoDeCampo.model.Sulfato;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SulfatoRepository extends CrudRepository<Sulfato, Integer> {

    List<Sulfato> findAll();

    Sulfato findById(int id);

    Sulfato save(Sulfato parcela);

    void deleteById(int id);

    @Query("SELECT s FROM Sulfato s WHERE s.nombre_sulfato like :name%")
    List<Sulfato> findByCustomName(String name);
}

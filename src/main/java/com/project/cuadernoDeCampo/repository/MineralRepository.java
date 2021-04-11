package com.project.cuadernoDeCampo.repository;

import com.project.cuadernoDeCampo.model.Mineral;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MineralRepository extends CrudRepository<Mineral, Integer> {

    List<Mineral> findAll();

    Mineral findById(int id);

    Mineral save(Mineral parcela);

    void deleteById(int id);

    @Query("SELECT m FROM Mineral m WHERE m.nombre like :name%")
    List<Mineral> findByCustomName(String name);
}

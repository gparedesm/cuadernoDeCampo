package com.project.cuadernoDeCampo.service;

import com.project.cuadernoDeCampo.model.Mineral;
import com.project.cuadernoDeCampo.repository.MineralRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MineralService {

    private Logger LOG = LoggerFactory.getLogger(MineralService.class);

    private MineralRepository mineralRepository;

    @Autowired
    public void setProductRepository(MineralRepository productRepository) {
        this.mineralRepository = productRepository;
    }

    public Mineral getMineralId(int id){
        return mineralRepository.findById(id);
    }

    public List<Mineral> getAllMinerales(){
        return mineralRepository.findAll();
    }

    public List<Mineral> getMineralLikeName(String name){
        return mineralRepository.findByCustomName(name);
    }

    public Mineral saveMineral(Mineral mineral){
        return mineralRepository.save(mineral);
    }

    public void deleteMineralId(int id){
        mineralRepository.deleteById(id);
    }

}

package com.project.cuadernoDeCampo.service;

import com.project.cuadernoDeCampo.model.Sulfato;
import com.project.cuadernoDeCampo.repository.SulfatoRepository;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class SulfatoService {

    private Logger LOG = LoggerFactory.getLogger(SulfatoService.class);

    private SulfatoRepository sulfatoRepository;

    @Autowired
    public void setProductRepository(SulfatoRepository productRepository) {
        this.sulfatoRepository = productRepository;
    }

    public List<Sulfato> getAllSulfatos(){
        LOG.info("Getting ALL Sulfatos");
        return sulfatoRepository.findAll();
    }

    public Sulfato getSulfato(int id){
        return sulfatoRepository.findById(id);
    }

    public List<Sulfato> getSulfatoLikeName(String name){
        LOG.info("Get sulfatos named like: " + name + "*");
        return sulfatoRepository.findByCustomName(name);
    }

    public Sulfato saveSulfato(Sulfato sulfato){
        LOG.info("Save Sulfato: " + sulfato.toString());
        return sulfatoRepository.save(sulfato);
    }

    public void deleteSulfatoId(int id){
        LOG.info("Sulfato id: " + id + " deleted");
        sulfatoRepository.deleteById(id);
    }
}

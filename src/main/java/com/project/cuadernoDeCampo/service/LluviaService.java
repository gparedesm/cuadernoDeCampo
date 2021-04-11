package com.project.cuadernoDeCampo.service;

import com.project.cuadernoDeCampo.model.Lluvia;
import com.project.cuadernoDeCampo.repository.LluviaRepository;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class LluviaService {

    private Logger LOG = LoggerFactory.getLogger(LluviaService.class);

    private LluviaRepository lluviaRepository;

    @Autowired
    public void setProductRepository(LluviaRepository productRepository) {
        this.lluviaRepository = productRepository;
    }

    public Lluvia getLluvia(int id) {
        LOG.info("Getting Lluvia with given id:" + id);
        return lluviaRepository.findById(id);
    }

    public List<Lluvia> getAllLluvias(){
        return lluviaRepository.findAll();
    }

    public List<Lluvia> getLluviasLikeName(String name){
        return lluviaRepository.findByCustomName(name);
    }

    public Lluvia saveLluvia(Lluvia lluvia){
        return lluviaRepository.save(lluvia);
    }

    public void deleteLluviaId(int id){
        lluviaRepository.deleteById(id);
    }
}

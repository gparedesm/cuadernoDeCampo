package com.project.cuadernoDeCampo.service;

import com.project.cuadernoDeCampo.model.Parcela;
import com.project.cuadernoDeCampo.repository.ParcelaRepository;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class ParcelaService {

    private Logger LOG = LoggerFactory.getLogger(ParcelaService.class);

    private ParcelaRepository parcelaRepository;

    @Autowired
    public void setProductRepository(ParcelaRepository productRepository) {
        this.parcelaRepository = productRepository;
    }

    public Parcela getParcela(int id) {
        LOG.info("Getting the parcela with given id:" + id);
        return parcelaRepository.findById(id);
    }

    public List<Parcela> getAllParcelas(){
        LOG.info("Getting ALL Parcelas");
        return parcelaRepository.findAll();
    }

    public List<Parcela> getParcelasLikeName(String name){
        LOG.info("Get parcelas named like: " + name + "*");
        return parcelaRepository.findByCustomName(name);
    }

    public Parcela saveParcela(Parcela parcela){
        LOG.info("Save Parcela: " + parcela.toString());
        return parcelaRepository.save(parcela);
    }

    public void deleteParcelaId(int id){
        LOG.info("Parcela id: " + id + " deleted");
        parcelaRepository.deleteById(id);
    }
}

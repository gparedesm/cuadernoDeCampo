package com.project.cuadernoDeCampo.controller;

import com.project.cuadernoDeCampo.repository.ParcelaRepository;
import com.project.cuadernoDeCampo.service.ParcelaService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.project.cuadernoDeCampo.model.Parcela;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api")
public class ParcelaController {

    @Autowired
    private ParcelaService parcela_service;
    Logger logger = LoggerFactory.getLogger(ParcelaController.class);


    @GetMapping("/parcelas")
    public List<Parcela> findAll(){
        logger.info("msg");
        logger.debug("debuf msg");
        return parcela_service.getAllParcelas();
    }

    @GetMapping("/parcelas/{id_parcela}")
    public Parcela getParcelas(@PathVariable int id_parcela){
        return parcela_service.getParcela(id_parcela);
    }

    @GetMapping("/parcelas/name/{name}")
    public List<Parcela> getParcelasName(@PathVariable String name){
        return parcela_service.getParcelasLikeName(name);
    }
    
    @PostMapping(value="/parcelas")
    public Parcela addParcela(@RequestBody Parcela parcela) {
        return parcela_service.saveParcela(parcela);
    }

    @PutMapping(value="/parcelas")
    public Parcela updateParcela(@RequestBody Parcela parcela) {
        return parcela_service.saveParcela(parcela);
    }

    @DeleteMapping(value="/parcelas/{id_parcela}")
    public String deleteParcela(@PathVariable int id_parcela){
        parcela_service.deleteParcelaId(id_parcela);
        return "Parcela " + id_parcela + " deleted.";
    }
}

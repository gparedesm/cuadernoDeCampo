package com.project.cuadernoDeCampo.controller;

import com.project.cuadernoDeCampo.model.Lluvia;
import com.project.cuadernoDeCampo.service.LluviaService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class LluviaController {

    @Autowired
    private LluviaService lluvia_service;
    Logger logger = LoggerFactory.getLogger(LluviaController.class);


    @GetMapping("/lluvia")
    public List<Lluvia> findAll(){
        return lluvia_service.getAllLluvias();
    }

    @GetMapping("/lluvia/{id_lluvia}")
    public Lluvia getLluvia(@PathVariable int id_lluvia){
        return lluvia_service.getLluvia(id_lluvia);
    }

    @GetMapping("/lluvia/name/{name}")
    public List<Lluvia> getLluviaName(@PathVariable String name){
        return lluvia_service.getLluviasLikeName(name);
    }

    @PostMapping(value="/lluvia")
    public Lluvia addLluvia(@RequestBody Lluvia parcela) {
        return lluvia_service.saveLluvia(parcela);
    }

    @PutMapping(value="/lluvia")
    public Lluvia updatelluvia(@RequestBody Lluvia lluvia) {
        return lluvia_service.saveLluvia(lluvia);
    }

    @DeleteMapping(value="/lluvia/{id_lluvia}")
    public String deleteLluvia(@PathVariable int id_lluvia){
        lluvia_service.deleteLluviaId(id_lluvia);
        return "Parcela " + id_lluvia + " deleted.";
    }
}

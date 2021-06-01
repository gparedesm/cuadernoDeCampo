package com.project.cuadernoDeCampo.controller;

import com.project.cuadernoDeCampo.service.SulfatoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.project.cuadernoDeCampo.model.Sulfato;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api")
public class SulfatoController {

    @Autowired
    private SulfatoService sulfato_service;
    Logger logger = LoggerFactory.getLogger(SulfatoController.class);


    @GetMapping("/sulfatos")
    public List<Sulfato> findAll(){
        return sulfato_service.getAllSulfatos();
    }

    @GetMapping("/sulfato/{id_sulfato}")
    public Sulfato getSulfato(@PathVariable int id_sulfato){
        return sulfato_service.getSulfato(id_sulfato);
    }

    @GetMapping("/sulfatos/name/{name}")
    public List<Sulfato> getSulfatoName(@PathVariable String name){
        return sulfato_service.getSulfatoLikeName(name);
    }

    @PostMapping(value="/sulfatos")
    public Sulfato addSulfato(@RequestBody Sulfato sulfato) {
        return sulfato_service.saveSulfato(sulfato);
    }

    @PutMapping(value="/sulfatos")
    public Sulfato updateSulfato(@RequestBody Sulfato sulfato) {
        return sulfato_service.saveSulfato(sulfato);
    }

    @DeleteMapping(value="/sulfatos/{id_sulfato}")
    public String deleteSulfato(@PathVariable int id_sulfato){
        sulfato_service.deleteSulfatoId(id_sulfato);
        return "Sulfato " + id_sulfato + " deleted.";
    }

}

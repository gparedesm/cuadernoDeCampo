package com.project.cuadernoDeCampo.controller;

import com.project.cuadernoDeCampo.model.Mineral;
import com.project.cuadernoDeCampo.service.MineralService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MineralController {

    @Autowired
    private MineralService mineralService;
    Logger logger = LoggerFactory.getLogger(MineralController.class);

    @GetMapping("/mineral")
    public List<Mineral> findAll(){
        return mineralService.getAllMinerales();
    }

    @GetMapping("/mineral/{id_mineral}")
    public Mineral getMineral(@PathVariable int id_mineral){
        return mineralService.getMineralId(id_mineral);
    }

    @GetMapping("/mineral/name/{name}")
    public List<Mineral> getMineralName(@PathVariable String name){
        return mineralService.getMineralLikeName(name);
    }

    @PostMapping("/mineral")
    public Mineral addMineral(@RequestBody Mineral mineral){
        return mineralService.saveMineral(mineral);
    }

    @PutMapping("/mineral")
    public Mineral updateMineral(@RequestBody Mineral mineral){
        return mineralService.saveMineral(mineral);
    }

    @DeleteMapping("/mineral")
    public String deleteMineral(@PathVariable int id_mineral){
        mineralService.deleteMineralId(id_mineral);
        return "Mineral " + id_mineral + " deleted.";
    }

}

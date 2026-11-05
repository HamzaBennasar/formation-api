package be.bennasar.formationapi.controller;

import be.bennasar.formationapi.entity.Formation;
import be.bennasar.formationapi.service.FormationService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/formations")
public class FormationController {
    private final FormationService formationService;

    public FormationController(FormationService formationService){
        this.formationService = formationService;
    }

    @GetMapping
    public List<Formation> findAll(){
        return formationService.findAll();
    }

    @GetMapping("/{id}")
    public Formation findById(@PathVariable Long id){
        return formationService.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Formation create(@RequestBody Formation formation){
        return formationService.create(formation);
    }





}

package com.burakkolay.project.controller;

import com.burakkolay.project.model.dto.CountryDTO;
import com.burakkolay.project.model.entity.Country;
import com.burakkolay.project.service.CountryService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/countries")
@AllArgsConstructor
public class CountryController {
    private final CountryService service;


    @GetMapping
    public List<Country> getAll(){
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Country getById(@PathVariable Long id){
        return service.getById(id);
    }

    @PostMapping
    public Country add(@RequestBody CountryDTO countryDTO){
        return service.add(countryDTO);
    }

    @PutMapping("/{id}")
    public Country update(@PathVariable Long id,@RequestBody CountryDTO countryDTO){
        return service.update(id,countryDTO);
    }

}

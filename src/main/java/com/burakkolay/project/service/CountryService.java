package com.burakkolay.project.service;

import com.burakkolay.project.model.dto.CountryDTO;
import com.burakkolay.project.model.entity.Country;
import com.burakkolay.project.model.mapper.CountryMapperImpl;
import com.burakkolay.project.repository.CountryRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CountryService {
    private final CountryRepository repository;
    private final CountryMapperImpl mapper;


    public List<Country> getAll(){
        return repository.findAll();
    }

    public Country getById(Long id){
        return repository.findById(id).orElseThrow();
    }

    public Country add(CountryDTO countryDTO){
        Country country = mapper.toCountry(countryDTO);
        return repository.save(country);
    }
    public Country update(Long id, CountryDTO countryDTO){
        Country countryRepo = repository.findById(id).orElseThrow();
        countryRepo.setPresident(mapper.toCountry(countryDTO).getPresident());
        return repository.save(countryRepo);
    }
}

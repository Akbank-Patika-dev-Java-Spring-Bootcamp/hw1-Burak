package com.burakkolay.project.repository;

import com.burakkolay.project.model.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CountryRepository extends JpaRepository<Country, Long> {


}

package com.burakkolay.project.model.mapper;

import com.burakkolay.project.model.dto.CountryDTO;
import com.burakkolay.project.model.entity.Country;
import org.mapstruct.Mapper;

@Mapper
public interface CountryMapper {
    CountryDTO toCountryDTO(Country country);
    Country toCountry(CountryDTO countryDTO);
}

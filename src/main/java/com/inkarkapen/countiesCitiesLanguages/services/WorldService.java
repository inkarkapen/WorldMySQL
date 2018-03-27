package com.inkarkapen.countiesCitiesLanguages.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.inkarkapen.countiesCitiesLanguages.models.Country;
import com.inkarkapen.countiesCitiesLanguages.repositories.CityRepository;
import com.inkarkapen.countiesCitiesLanguages.repositories.CountryRepository;
import com.inkarkapen.countiesCitiesLanguages.repositories.LanguageRepository;

@Service
public class WorldService {
	private static CountryRepository countryRepository;
	private static CityRepository cityRepository;
	private static LanguageRepository languageRepository;
    public WorldService(CountryRepository countryRepository, CityRepository cityRepository, LanguageRepository languageRepository) {
    	this.countryRepository = countryRepository;
    	this.cityRepository = cityRepository;
    	this.languageRepository = languageRepository;
    }
    public static List<Country> findAllCounties() {
		return countryRepository.findAllCountries();
    }
    public static List<Object[]> findCountiesByLanguage(String lang){
    		return countryRepository.findCountriesByLanguage(lang);
    }
    public static List<Object[]> findCitiesNumByCountry(){
    		return countryRepository.findCitiesNumByCountry();
    }
    public static List<Object[]> findCitiesByCountry(String country_name) {
		return cityRepository.findCitiesByCountry(country_name);
	}

	public static List<Object[]> findCountriesByLanguageAbovePercentage(Double threshold) {
		return languageRepository.findCountriesByLanguageAbovePercentage(threshold);
	}

	public static List<Object[]> findCountriesWithSABelow501andPopOver100000() {
		return countryRepository.findCountriesWithSABelow501andPopOver100000();
	}

	public static List<Object[]> findCountriesWithConstitutionalMonarchySAAbove200LEAbove75() {
		return countryRepository.findCountriesWithConstitutionalMonarchySAAbove200LEAbove75();
	}

	public static List<Object[]> findBACitiesWithPopOver500000() {
		return cityRepository.findBACitiesWithPopOver500000();
	}

	public static List<Object[]> findCountriesCountByRegion() {
		return countryRepository.findCountriesCountByRegion();
	}
}

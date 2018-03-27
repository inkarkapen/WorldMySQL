package com.inkarkapen.countiesCitiesLanguages.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.inkarkapen.countiesCitiesLanguages.models.Country;
import com.inkarkapen.countiesCitiesLanguages.models.Language;

@Repository
public interface CountryRepository extends CrudRepository<Language, Long>{
	@Query("SELECT c FROM Country c")
	List<Country> findAllCountries();
	
	@Query("SELECT c.name, l.language, l.percentage FROM Country c JOIN c.languages l WHERE l.language = ?1")
	List<Object[]> findCountriesByLanguage(String lang);
	
	@Query("SELECT c.name, COUNT(c.name) FROM Country c JOIN c.cities GROUP BY c.name")
	List<Object[]> findCitiesNumByCountry();
	
	@Query("SELECT c.name, c.surface_area, c.population FROM Country c WHERE c.surface_area < 501 AND c.population > 100000")
	List<Object[]> findCountriesWithSABelow501andPopOver100000();

	@Query("SELECT c.name, c.government_form, c.surface_area, c.life_expectancy FROM Country c WHERE c.government_form = 'Constitutional Monarchy' AND c.surface_area > 200 AND c.life_expectancy > 75")
	List<Object[]> findCountriesWithConstitutionalMonarchySAAbove200LEAbove75();

	@Query("SELECT c.region, COUNT(c.name) FROM Country c GROUP BY c.region ORDER BY COUNT(c.name) DESC")
	List<Object[]> findCountriesCountByRegion();
}
package com.inkarkapen.countiesCitiesLanguages.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.inkarkapen.countiesCitiesLanguages.models.City;

@Repository
public interface CityRepository extends CrudRepository<City, Long>{
	@Query("SELECT city.name, city.population FROM City city JOIN city.country country WHERE country.name = ?1 AND city.population > 500000 ORDER BY city.population DESC")
	List<Object[]> findCitiesByCountry(String country_name);

	@Query("SELECT country.name, city.name, city.district, city.population FROM City city JOIN city.country country WHERE city.district = 'Buenos Aires'")
	List<Object[]> findBACitiesWithPopOver500000();
}
package com.inkarkapen.countiesCitiesLanguages.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.inkarkapen.countiesCitiesLanguages.models.Language;

@Repository
public interface LanguageRepository extends CrudRepository<Language, Long>{
	@Query("SELECT c.name, l.language, l.percentage FROM Language l JOIN l.country c WHERE l.percentage > ?1 ORDER BY l.percentage DESC")
	List<Object[]> findCountriesByLanguageAbovePercentage(Double threshold);
}

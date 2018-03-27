package com.inkarkapen.countiesCitiesLanguages.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inkarkapen.countiesCitiesLanguages.services.WorldService;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String index(Model model) {
	//What query would you run to get all the countries that speak Slovene?
	//Your query should return the name of the country, language, and language percentage.
		
		//List<Object[]> table = WorldService.findCountiesByLanguage("Slovene");
		
		
	//What query would you run to display the total number of cities for each country?
	//Your query should return the name of the country and the total number of cities.
		//List<Object[]> table = WorldService.findCitiesNumByCountry();
		
//	    What query would you run to get all the cities in Mexico with a population of greater than 500,000? Your query should arrange the result by population in descending order.
//		String country_name = "Mexico";
//		List<Object[]> table = WorldService.findCitiesByCountry(country_name);

//	    What query would you run to get all languages in each country with a percentage greater than 89%? Your query should arrange the result by percentage in descending order.
//		Double threshold = 89.0;
//		List<Object[]> table = WorldService.findCountriesByLanguageAbovePercentage(threshold);

//	    What query would you run to get all the countries with Surface Area below 501 and Population greater than 100,000?
//		List<Object[]> table = WorldService.findCountriesWithSABelow501andPopOver100000();
		
//	    What query would you run to get countries with only Constitutional Monarchy with a surface area of more than 200 and a life expectancy greater than 75 years?
//		List<Object[]> table = WorldService.findCountriesWithConstitutionalMonarchySAAbove200LEAbove75();
		
//	    What query would you run to get all the cities of Argentina inside the Buenos Aires district and have the population greater than 500, 000? The query should return the Country Name, City Name, District, and Population.
//		List<Object[]> table = WorldService.findBACitiesWithPopOver500000();
		
//	    What query would you run to summarize the number of countries in each region? The query should display the name of the region and the number of countries. Also, the query should arrange the result by the number of countries in descending order.
		List<Object[]> table = WorldService.findCountriesCountByRegion();

		
//		List<Country> countries = ApiService.findAllCounties();
//		System.out.println(countries);	
		

		
//		System.out.print(table);
//		for(Object[] row : table) {
//			String rowString = "";
//			for(int i=0;i<row.length;i++) {
//				rowString += row[i] + ",";
//			}
//			System.out.println(rowString);
//		}
		model.addAttribute("table", table);
		return "index.jsp";
	}
	
}

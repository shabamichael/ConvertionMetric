package com.metric.conversion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.conversions.conversionService;

@RestController
@RequestMapping(ConversionMetricController.BASE_URL)
public class ConversionMetricController {
	
	@Autowired
	private ConversionMetricService con_serv;
	
	public static final String BASE_URL = "/conversions";
	@RequestMapping("/")
	public String home() {
		return "<h2>Welcome to conversion Restful API </h2>";
	}
	
	@RequestMapping("/ktoc/{kelvin}")
	public String KelvinToCelsius(@PathVariable double kelvin) {
				return "The result:- " + con_serv.convertKelvinToCelsius(kelvin);
	
	}

	@RequestMapping("/ctok/{celsius}")
	public String CelsiusToKelvin(@PathVariable double celsius) {
				return "The result:- " + con_serv.convertCelsiusToKelvin(celsius);
		
	}
	@RequestMapping("/mtok/{miles}")
	public String MilesToKilometers(@PathVariable double miles) {
				return "The result:- " + con_serv.convertMilesToKilometers(miles);
	}
	@RequestMapping("/ktom/{kilometers}")
	public String KilometersToMiles(@PathVariable double kilometers) {
				return "The result:- " +con_serv.convertKilometersToMiles(kilometers);
	}
	@RequestMapping("/ptok/{pounds}")
	public String PoundsToKilograms(@PathVariable double pounds) {
				return "The result:- " + con_serv.convertPoundsToKilograms(pounds);
	}
	@RequestMapping("/ktop/{kilograms}")
	public String KilogramsToPounds(@PathVariable double kilograms) {
			return "The result:- " + con_serv.convertKilogramsToPounds(kilograms);
	}

}

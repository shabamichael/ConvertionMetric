package com.metric.conversion;

import org.springframework.stereotype.Service;

@Service
public class ConversionMetricService {

	public double convertKelvinToCelsius(double kelvin) {
		return kelvin - 273.15;
}
public double convertCelsiusToKelvin(double celsius) {
return celsius + 273.15;
}

public double convertMilesToKilometers(double miles){
return miles * 1.6;

}
public double convertKilometersToMiles (double kilometers){
return kilometers * 0.62;
}
public double convertPoundsToKilograms(double pounds) {
return pounds * 0.45 ;
}
public double convertKilogramsToPounds(double kilograms) {
return kilograms * 2.20462262;
}
}



package com.metric.conversion;

public class conversions {
	private double kelvin;
	private double  celsius;
	private double miles;
	private double kilometer;
	
	
	
	/**
	 * 
	 */
	public conversions() {
	}
	/**
	 * @param kelvin
	 * @param celsius
	 * @param miles
	 * @param kilometer
	 */
	public conversions(double kelvin, double celsius, double miles, double kilometer) {
		super();
		this.kelvin = kelvin;
		this.celsius = celsius;
		this.miles = miles;
		this.kilometer = kilometer;
	}
	public double getKelvin() {
		return kelvin;
	}
	public void setKelvin(double kelvin) {
		this.kelvin = kelvin;
	}
	public double getCelsius() {
		return celsius;
	}
	public void setCelsius(double celsius) {
		this.celsius = celsius;
	}
	public double getMiles() {
		return miles;
	}
	public void setMiles(double miles) {
		this.miles = miles;
	}
	public double getKilometer() {
		return kilometer;
	}
	public void setKilometer(double kilometer) {
		this.kilometer = kilometer;
	}
	
	

}

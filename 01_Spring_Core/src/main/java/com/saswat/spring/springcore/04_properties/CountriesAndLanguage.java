package com.saswat.spring.springcore.properties;

import java.util.Properties;

public class CountriesAndLanguage {
	private Properties countryAndLanguage;

	public Properties getCountryAndLanguage() {
		return countryAndLanguage;
	}

	public void setCountryAndLanguage(Properties countryAndLanguage) {
		this.countryAndLanguage = countryAndLanguage;
	}

	@Override
	public String toString() {
		return "CountriesAndLanguage [countryAndLanguage=" + countryAndLanguage + "]";
	}
}

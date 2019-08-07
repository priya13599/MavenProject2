package com.nucleus;

import java.util.List;

public class Address {
private String city;
private String country;
private List<String> landmarks;


public List<String> getLandmarks() {
	return landmarks;
}
public void setLandmarks(List<String> landmarks) {
	this.landmarks = landmarks;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}

}

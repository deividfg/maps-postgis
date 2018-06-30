package com.example.demo.entity;


public class Point {
	
	private Double lat;
	private Double lng;
	
	
	public Point() {
		super();
	}
	
	public Point(Double lat, Double lng) {
		this();
		this.lat = lat;
		this.lng = lng;
	}
	
	public Double getLat() {
		return lat;
	}
	public void setLat(Double lat) {
		this.lat = lat;
	}
	public Double getLng() {
		return lng;
	}
	public void setLng(Double lng) {
		this.lng = lng;
	}
}

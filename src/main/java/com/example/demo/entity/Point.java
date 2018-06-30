package com.example.demo.entity;


public class Point {
	
	private String geo;
	private Double lat;
	private Double lon;
	
	
	public Point() {
		super();
	}
	
	public Point(String geo, Double lat, Double lon) {
		this();
		this.geo = geo;
		this.lat = lat;
		this.lon = lon;
	}
	
	
	public String getGeo() {
		return geo;
	}
	public void setGeo(String geo) {
		this.geo = geo;
	}
	public Double getLat() {
		return lat;
	}
	public void setLat(Double lat) {
		this.lat = lat;
	}
	public Double getLon() {
		return lon;
	}
	public void setLon(Double lon) {
		this.lon = lon;
	}
}

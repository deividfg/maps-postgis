package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Point;
import com.example.demo.service.PointRepository;

@RestController
public class PointController {

	@Autowired
	PointRepository pointRepository;
	
    @GetMapping
    @CrossOrigin
    @RequestMapping("/pointing")
    public List<Point> pointing(@RequestParam (value="fonte", defaultValue="indios") String fonte) {
    	if (fonte == null || fonte.equals("") || fonte.equals("null")) 
    		return new ArrayList<Point>();
    	return pointRepository.findAll(fonte);
    }
    
    @GetMapping
    @CrossOrigin
    @RequestMapping("/insert")
    public void insert(@RequestParam (value="fonte", defaultValue="indios") String fonte,
    				   @RequestParam (value="lat") String lat,
    				   @RequestParam (value="lng") String lng) {
    	pointRepository.insert(fonte, lat, lng);
    }
}
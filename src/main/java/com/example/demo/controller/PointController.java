package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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
    public List<Point> pointing() {
    	return pointRepository.findAll();
    }
}
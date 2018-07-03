package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Point;


@Repository
public class PointRepository extends JdbcDaoSupport {
 
    private static final String SCHEMA = "univali";
	@Autowired 
    DataSource dataSource;
 
    @PostConstruct
    private void initialize(){
        setDataSource(dataSource);
    }
    
    public List<Point> findAll(String fonte) {
    	String sql = "SELECT * FROM " + SCHEMA + "." + fonte;
    	System.out.println("Finding...  " + sql);
    	List<Map<String, Object>> rows = getJdbcTemplate().queryForList(sql);
    	
    	List<Point> result = new ArrayList<Point>();
		for(Map<String, Object> row:rows){
			Point p = new Point((Double) row.get("lat"), (Double) row.get("lon"));
			result.add(p);
		}

    	return result;
    }
    
    
}

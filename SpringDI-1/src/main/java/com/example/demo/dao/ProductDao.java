package com.example.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Product;

@Repository
public class ProductDao implements Dao{
	
    @Autowired
    private JdbcTemplate jdbcTemplate;
    
    public List<Product> findAll(){
    	
    	return jdbcTemplate.query("SELECT * FROM products ",
                new BeanPropertyRowMapper<Product>(Product.class));
    }
}
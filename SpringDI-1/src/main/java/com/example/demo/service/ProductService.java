package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.Dao;
import com.example.demo.entity.Product;

@Service
public class ProductService implements Services{
	@Autowired
	private Dao Dao;
	
	public List<Product> findAll(){
		return Dao.findAll();
	}
}
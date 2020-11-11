package com.example.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.rm.LastIdInsertRowMapper;
import com.example.test.util.Querrey;
import com.example.test.util.karlelements;

@RestController
@RequestMapping("testcontrol")
public class TestController {
	
	@Autowired
    JdbcTemplate jdbcTemplate;
	
	@GetMapping(value = "/hello")//@RequestBody @Valid
//	@RequestMapping(value="/products", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public String hello() {
		//List<karlelements> users =  jdbcTemplate.query(Querrey.myquery, new LastIdInsertRowMapper());
		return "Hello";
	}
	

	@GetMapping(value = "/get")//@RequestBody @Valid
//	@RequestMapping(value="/products", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity Item() {
		List<karlelements> users =  jdbcTemplate.query(Querrey.myquery, new LastIdInsertRowMapper());
		return new ResponseEntity<>(users,HttpStatus.OK);
	}
	
}

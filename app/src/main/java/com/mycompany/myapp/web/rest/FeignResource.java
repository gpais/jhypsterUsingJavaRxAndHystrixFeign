package com.mycompany.myapp.web.rest;

import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codahale.metrics.annotation.Timed;
import com.mycompany.myapp.client.car.api.ApiApiClient;
import com.mycompany.myapp.client.car.model.Car;
import com.mycompany.myapp.web.rest.vm.LoggerVM;

import ch.qos.logback.classic.LoggerContext;

@RestController
@RequestMapping("/api")
public class FeignResource {
	
	@Autowired
	private ApiApiClient client;
	


    @GetMapping("/getCars")
    @Timed
    public List<Car> getList() {
    	return client.getAllCarsUsingGET().toBlocking().single();
    }

}

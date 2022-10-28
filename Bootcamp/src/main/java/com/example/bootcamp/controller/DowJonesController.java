package com.example.bootcamp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.bootcamp.domain.DowJones;
import com.example.bootcamp.entity.DowJonesEntity;
import com.example.bootcamp.service.DowJonesService;

@RestController
public class DowJonesController {
	@Autowired
	DowJonesService dowJonesService;

	@GetMapping("/dowJone/{stock}")
	public DowJonesEntity getDowJonesByStock(@PathVariable("stock") String stock) {
		return dowJonesService.getDowJonesByStock(stock);
	}

	@PostMapping("/dowJones")
	public String saveDowJones(@RequestBody DowJones d) {
		return dowJonesService.saveDowJones(d);
	}
}

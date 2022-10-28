package com.example.bootcamp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.bootcamp.converter.DowJonesConverter;
import com.example.bootcamp.domain.DowJones;
import com.example.bootcamp.entity.DowJonesEntity;
import com.example.bootcamp.repository.DowJonesRepository;

@Component
public class DowJonesService {
	@Autowired
	DowJonesRepository dowJonesRepository;

	@Autowired
	DowJonesConverter dowJonesConverter;

	public DowJonesEntity getDowJonesByStock(String stock) {

		DowJonesEntity entity = dowJonesRepository.selectStock(stock);
		return entity;

	}

	public String saveDowJones(DowJones d) {

		DowJonesEntity entity = dowJonesConverter.ObjectToEntity(d);
		try {
			dowJonesRepository.save(entity);
			return "successfully saved the record";
		} catch (Exception e) {
			return "unable to save the record";
		}

	}

}

package com.example.bootcamp.converter;

import org.springframework.stereotype.Component;

import com.example.bootcamp.domain.DowJones;
import com.example.bootcamp.entity.DowJonesEntity;

@Component
public class DowJonesConverter {

	public DowJonesEntity ObjectToEntity(DowJones d) {
		DowJonesEntity entity = new DowJonesEntity();
		entity.setClose(d.getClose());
		entity.setDate(d.getDate());
		entity.setDaysToNextDividend(d.getDaysToNextDividend());
		entity.setHigh(d.getHigh());
		entity.setLow(d.getLow());
		entity.setNextWeeksClose(d.getNextWeeksClose());
		entity.setNextWeeksOpen(d.getNextWeeksOpen());
		entity.setOpen(d.getOpen());
		entity.setPercentChangeNextWeeksPrice(d.getPercentChangeNextWeeksPrice());
		entity.setPercentChangePrice(d.getPercentChangePrice());
		entity.setPercentChangeVolumeOverLastWk(d.getPercentChangeVolumeOverLastWk());
		entity.setPercentReturnNextDividend(d.getPercentReturnNextDividend());
		entity.setPreviousWeeksVolume(d.getPreviousWeeksVolume());
		entity.setQuarter(d.getQuarter());
		entity.setStock(d.getStock());
		entity.setVolume(d.getVolume());

		return entity;
	}

}

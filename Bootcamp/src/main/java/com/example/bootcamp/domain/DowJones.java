package com.example.bootcamp.domain;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Component
@Getter
@Setter
public class DowJones {
	String quarter;
	String stock;
	String date;
	String open;
	String high;
	String low;
	String close;
	String volume;
	String percentChangePrice;
	String percentChangeVolumeOverLastWk;
	String previousWeeksVolume;
	String nextWeeksOpen;
	String nextWeeksClose;
	String percentChangeNextWeeksPrice;
	String daysToNextDividend;
	String percentReturnNextDividend;
}

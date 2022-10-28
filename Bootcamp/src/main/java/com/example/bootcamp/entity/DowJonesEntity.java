package com.example.bootcamp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Getter;
import lombok.Setter;

@Entity
// @Data
// @AllArgsConstructor
// @NoArgsConstructor
@Getter
@Setter
@JsonInclude(Include.NON_NULL)
public class DowJonesEntity {

	@Column(name = "QUARTER")
	private String quarter;
	@Id
	@Column(name = "STOCK")
	private String stock;
	@Column(name = "DATE")
	private String date;
	@Column(name = "OPEN")
	private String open;
	@Column(name = "HIGH")
	private String high;
	@Column(name = "LOW")
	private String low;
	@Column(name = "CLOSE")
	private String close;
	@Column(name = "VOLUME")
	private String volume;
	@Column(name = "PERCENTCHANGEPRICE")
	private String percentChangePrice;
	@Column(name = "PERCENTCHANGEVOLUMEOVERLASTWK")
	private String percentChangeVolumeOverLastWk;
	@Column(name = "PREVIOUSWEEKSVOLUME")
	private String previousWeeksVolume;
	@Column(name = "NEXTWEEKSOPEN")
	private String nextWeeksOpen;
	@Column(name = "NEXTWEEKSCLOSE")
	private String nextWeeksClose;
	@Column(name = "PERCENTCHANGENEXTWEEKSPRICE")
	private String percentChangeNextWeeksPrice;
	@Column(name = "DAYSTONEXTDIVIDEND")
	private String daysToNextDividend;
	@Column(name = "PERCENTRETURNNEXTDIVIDEND")
	private String percentReturnNextDividend;
	public DowJonesEntity() {
	}

}

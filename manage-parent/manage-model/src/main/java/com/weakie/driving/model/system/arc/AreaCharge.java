package com.weakie.driving.model.system.arc;

import java.util.List;

public class AreaCharge {

	private String city;
	private String chargeNotes;
	private List<Price> prices;
	
	public AreaCharge() {
		super();
	}
	public AreaCharge(String city, String chargeNotes, List<Price> prices) {
		super();
		this.city = city;
		this.chargeNotes = chargeNotes;
		this.prices = prices;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getChargeNotes() {
		return chargeNotes;
	}
	public void setChargeNotes(String chargeNotes) {
		this.chargeNotes = chargeNotes;
	}
	public List<Price> getPrices() {
		return prices;
	}
	public void setPrices(List<Price> prices) {
		this.prices = prices;
	}
	
	@Override
	public String toString() {
		return "AreaCharge [city=" + city + ", chargeNotes=" + chargeNotes + ", prices=" + prices + "]";
	}
	
	
}

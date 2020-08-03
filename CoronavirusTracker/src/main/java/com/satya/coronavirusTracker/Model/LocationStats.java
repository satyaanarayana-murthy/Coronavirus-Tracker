package com.satya.coronavirusTracker.Model;

public class LocationStats {
	
	private String state;
	private String country;
	private int LatestCases;
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getLatestCases() {
		return LatestCases;
	}
	public void setLatestCases(int latestCases) {
		LatestCases = latestCases;
	}
	@Override
	public String toString() {
		return "LocationStats [state=" + state + ", country=" + country + ", LatestCases=" + LatestCases + "]";
	}

	
}
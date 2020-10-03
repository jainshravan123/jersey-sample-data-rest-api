package com.shravan.jain.jersey_sample_data_rest_api.bean;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Engineer {
	
	private int id;
	private String name;
	private String type;
	private int rank;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	
}

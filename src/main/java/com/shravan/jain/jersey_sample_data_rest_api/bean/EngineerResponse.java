package com.shravan.jain.jersey_sample_data_rest_api.bean;

import java.util.LinkedHashSet;

public class EngineerResponse {
	int page;
	int totalPages;
	int totalRecords;
	LinkedHashSet<Engineer> engineers;
	
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getTotalPages() {
		return totalPages;
	}
	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}
	public int getTotalRecords() {
		return totalRecords;
	}
	public void setTotalRecords(int totalRecords) {
		this.totalRecords = totalRecords;
	}
	public LinkedHashSet<Engineer> getEngineers() {
		return engineers;
	}
	public void setEngineers(LinkedHashSet<Engineer> engineers) {
		this.engineers = engineers;
	}
	
}

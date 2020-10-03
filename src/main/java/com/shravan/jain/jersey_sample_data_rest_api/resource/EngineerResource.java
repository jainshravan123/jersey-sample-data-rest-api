package com.shravan.jain.jersey_sample_data_rest_api.resource;

import com.shravan.jain.jersey_sample_data_rest_api.bean.EngineerResponse;
import com.shravan.jain.jersey_sample_data_rest_api.dao.EngineerDAO;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

@Path("engineers")
public class EngineerResource {
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public EngineerResponse getAllEngineers(@QueryParam("page") int page) {
		EngineerDAO engineerDao = new EngineerDAO();
		
		EngineerResponse engineerResponse = new EngineerResponse();
		engineerResponse.setPage(page);
		engineerResponse.setTotalPages(13);
		engineerResponse.setTotalRecords(125);
		engineerResponse.setEngineers(engineerDao.getAllEngineers(page));
		return engineerResponse;
	}
	
}

package com.shravan.jain.jersey_sample_data_rest_api.dao;

import java.util.LinkedHashSet;

import com.shravan.jain.jersey_sample_data_rest_api.bean.Engineer;
import com.shravan.jain.jersey_sample_data_rest_api.utilities.Utility;

public class EngineerDAO {
	public LinkedHashSet<Engineer> getAllEngineers(int page) {
		
		Utility utility = new Utility();
		
		if (page == 0) {
			return utility.generateSampleDataForEngineers(125);
		} else if (page >= 1 && page <= 13) {
			return utility.generateSampleDataForEngineers(10, page);
		} else {
			return utility.generateSampleDataForEngineers(0, page);
		}
	}
}

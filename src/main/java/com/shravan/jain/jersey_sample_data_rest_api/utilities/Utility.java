package com.shravan.jain.jersey_sample_data_rest_api.utilities;

import java.util.LinkedHashSet;
import java.util.Random;

import com.shravan.jain.jersey_sample_data_rest_api.bean.Engineer;

public class Utility {
	public LinkedHashSet<Engineer> generateSampleDataForEngineers(int numberOfRecords, int page) {
		LinkedHashSet<Engineer> engineers = new LinkedHashSet<Engineer>();
		if (numberOfRecords != 0) {
			int totalNumberOfRecords = numberOfRecords;
			if (page == 13) {
				totalNumberOfRecords -= 5;
			}
			int id = 100 + ((page-1) * 10);
			for (int i = 0; i < totalNumberOfRecords; i++) {
				Engineer engineer = new Engineer();
				engineer.setId(++id);
				engineer.setName(getRandomName(i));
				engineer.setType(getRandomEgineeringType());
				engineer.setRank(getRandomNumberInRange(50, 100));
				engineers.add(engineer);	
			}
		}
		return engineers;
	}
	
	public LinkedHashSet<Engineer> generateSampleDataForEngineers(int numberOfRecords) {
		LinkedHashSet<Engineer> engineers = new LinkedHashSet<Engineer>();
		int id = 100;
		for (int i = 0; i < numberOfRecords; i++) {
			Engineer engineer = new Engineer();
			engineer.setId(++id);
			engineer.setName(getRandomName(i));
			engineer.setType(getRandomEgineeringType());
			engineer.setRank(getRandomNumberInRange(50, 100));
			engineers.add(engineer);	
		}
		return engineers;
	}
	
	private static int getRandomNumberInRange(int min, int max) {
		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
	}
	
	private static String getRandomEgineeringType() {
		String engineeringTypes[] = {"Mechanical Engineer", "Software Engineer", "Civil Engineer", "Electrical Engineer", "Electronics Engineer"}; 
		return engineeringTypes[new Random().nextInt(engineeringTypes.length)];
	}
	
	private static String getRandomName(int index) {
		String names[] = { 
				"Shravan Jain", "Vineet Nagool", "Bhanu Prakash", "Kunal Vedak", "Priyaj Kumar", "Himanshu Tomer", "Sudesh Saxena", "Sachin Kumar", "Rajeev Kumar", "Prashant Farkya", 
				"Prateek Mittal", "Vivek Sinha", "Mike One", "Mike Two", "Mike Three", "Mike Four", "Mike Five", "Mike Eight",   "Connor",
				                                                                                                                 "Andrew",
				                                                                                                                 "Evan",
				                                                                                                                 "Lane",
				                                                                                                                 "Lamar",
				                                                                                                                 "Cairo",
				                                                                                                                 "Cameron",
				                                                                                                                 "Raphael",
				                                                                                                                 "Hector",
				                                                                                                                 "Steven",
				                                                                                                                 "Felix",
				                                                                                                                 "Derek",
				                                                                                                                 "Phelan",
				                                                                                                                 "Dennis",
				                                                                                                                 "Jack",
				                                                                                                                 "Quamar",
				                                                                                                                 "Odysseus",
				                                                                                                                 "Dale",
				                                                                                                                 "Amal",
				                                                                                                                 "Silas",
				                                                                                                                 "Davis",
				                                                                                                                 "Joshua",
				                                                                                                                 "Ezekiel",
				                                                                                                                 "Chandler",
				                                                                                                                 "Quamar",
				                                                                                                                 "Coby",
				                                                                                                                 "Drew",
				                                                                                                                 "Trevor",
				                                                                                                                 "Oleg",
				                                                                                                                 "Sawyer",
				                                                                                                                 "Arthur",
				                                                                                                                 "Murphy",
				                                                                                                                 "Erich",
				                                                                                                                 "Herman",
				                                                                                                                 "Tanek",
				                                                                                                                 "Sebastian",
				                                                                                                                 "Cruz",
				                                                                                                                 "Barry",
				                                                                                                                 "Travis",
				                                                                                                                 "Andrew",
				                                                                                                                 "Zahir",
				                                                                                                                 "Ian",
				                                                                                                                 "Troy",
				                                                                                                                 "Nolan",
				                                                                                                                 "Alvin",
				                                                                                                                 "Nash",
				                                                                                                                 "Lane",
				                                                                                                                 "Dale",
				                                                                                                                 "Felix",
				                                                                                                                 "Kaseem",
				                                                                                                                 "Igor",
				                                                                                                                 "Quentin",
				                                                                                                                 "Zahir",
				                                                                                                                 "Adrian",
				                                                                                                                 "Reed",
				                                                                                                                 "Stone",
				                                                                                                                 "Ezekiel",
				                                                                                                                 "Tanek",
				                                                                                                                 "Orson",
				                                                                                                                 "Alvin",
				                                                                                                                 "Hayes",
				                                                                                                                 "Barrett",
				                                                                                                                 "Lewis",
				                                                                                                                 "Kyle",
				                                                                                                                 "Ezekiel",
				                                                                                                                 "Neil",
				                                                                                                                 "Bernard",
				                                                                                                                 "Ross",
				                                                                                                                 "Bruno",
				                                                                                                                 "Raphael",
				                                                                                                                 "Norman",
				                                                                                                                 "Oliver",
				                                                                                                                 "Wylie",
				                                                                                                                 "Nehru",
				                                                                                                                 "Elmo",
				                                                                                                                 "Christian",
				                                                                                                                 "Nicholas",
				                                                                                                                 "Nathaniel",
				                                                                                                                 "John",
				                                                                                                                 "Hoyt",
				                                                                                                                 "Graham",
				                                                                                                                 "Raja",
				                                                                                                                 "Bernard",
				                                                                                                                 "Micah",
				                                                                                                                 "Yardley",
				                                                                                                                 "Ishmael",
				                                                                                                                 "Dale",
				                                                                                                                 "Dante",
				                                                                                                                 "Graiden",
				                                                                                                                 "Wesley",
				                                                                                                                 "Cyrus",
				                                                                                                                 "Richard",
				                                                                                                                 "Flynn",
				                                                                                                                 "Ethan",
				                                                                                                                 "Walter",
				                                                                                                                 "Erich",
				                                                                                                                 "Kieran",
				                                                                                                                 "Shad",
				                                                                                                                 "Keaton",
				                                                                                                                 "Forrest",
				                                                                                                                 "James",
				                                                                                                                 "Kelly",
				                                                                                                                 "Ram",
				                                                                                                                 "Shain",
				                                                                                                                 "Vijay",
				                                                                                                                 "Sachin Yadav",
				                                                                                                                 "Ravi Kumar",
				                                                                                                                 "Akash Chandra",
				                                                                                                                 "PVS",
				                                                                                                                 "Chethand D",
				                                                                                                                 "Chethan P",
				                                                                                                                 "Raj Kumar",
				                                                                                                                 "Paras Jain",
				                                                                                                                 "Lokesh Kumar",
				                                                                                                                 "Mukesh Singh"
				}; 
		return names[index];
	}
	
}


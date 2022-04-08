package com.datagrokr.mediaapi.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.datagrokr.mediaapi.localdatabase.MessageDatabase;
import com.datagrokr.mediaapi.model.Profile;

public class ProfileService {

	private static Map<Long, Profile> profiles = MessageDatabase.getProfiles();
	
	public ProfileService() {
		profiles.put(1L, new Profile("sammed","sankonatti", "single"));
		profiles.put(2L, new Profile("shreyank","jain", "committed"));
	}
	
	public List<Profile> getAllProfiles(){
		return new ArrayList<Profile>(profiles.values());
	}
	
}

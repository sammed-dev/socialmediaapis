package com.datagrokr.mediaapi.resources;

import java.util.List;

import com.datagrokr.mediaapi.model.Profile;
import com.datagrokr.mediaapi.services.ProfileService;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("profiles")
public class ProfileResource {

	ProfileService profileService = new ProfileService();
	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/all")
	public List<Profile> getAllProfiles(){
		return profileService.getAllProfiles();
	}
	
	//similarly other API : (as same as Messages API's)
	
}

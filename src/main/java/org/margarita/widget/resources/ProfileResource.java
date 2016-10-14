package org.margarita.widget.resources;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.margarita.widget.service.TweetService;

import com.google.gson.Gson;

@Path("profile")

public class ProfileResource {

	private TweetService tweetService; 
	
	public ProfileResource(){
		tweetService = new TweetService();
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String getProfile(){
		//TODO - Check addition of user profile as a variable.
		//Return tweets as JSON object.
		Gson gson = new Gson();
		String tweetsJson = gson.toJson(tweetService.getTweets("march1307"));
		return tweetsJson;
	}

}

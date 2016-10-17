package org.margarita.widget.resources;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.margarita.widget.service.TweetService;

import com.google.gson.Gson;

@Path("/profile")

public class ProfileResource {

	private TweetService tweetService; 
	
	public ProfileResource(){
		tweetService = new TweetService();
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String getProfile(){
		System.out.println("Request obtained");
		//TODO - Check addition of user profile as a variable.
		//Prepares entity.
		Gson gson = new Gson();
		String tweetsJson = gson.toJson(tweetService.getTweets("march1307"));
		
		return tweetsJson;
	}

	@GET
	@Path("/{userName}")
	@Produces(MediaType.APPLICATION_JSON)
	public String getProfile(@PathParam("userName") String userName){
		System.out.println("Request obtained");
		//TODO - Check addition of user profile as a variable.
		Gson gson = new Gson();
		String tweetsJson = gson.toJson(tweetService.getTweets(userName));
		return tweetsJson;
	}
}

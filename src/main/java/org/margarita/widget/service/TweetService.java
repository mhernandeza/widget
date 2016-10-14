package org.margarita.widget.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.margarita.widget.model.Tweet;

public class TweetService {
	
	private List<Tweet> tweets = new ArrayList<>();;
	
	public TweetService(){
		
	}

	public List<Tweet> getTweets(String screen_name){	
		//Mock tweets for now.
		//TODO - replace for code that interacts with Twitter's API.
		tweets.clear();
		//Tweet tweet1 = new Tweet(1, new Date(), "test tweet one", "Margarita Hernandez", "profile url 1", screen_name);
		//Tweet tweet2 = new Tweet(1, new Date(), "test tweet two", "Margarita Hernandez", "profile url 2", screen_name);
		//tweets.add(tweet1);
		//tweets.add(tweet2);
		return tweets;
	}
	
}

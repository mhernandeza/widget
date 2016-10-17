package org.margarita.widget.service;

import java.util.ArrayList;
import java.util.List;

import twitter4j.Status;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

import org.margarita.widget.model.Tweet;

public class TweetService {
	
	private List<Tweet> tweets = new ArrayList<>();;
	
	public TweetService(){
		
	}

	//TODO - Add way of storing information, contact Twitter's API every 5 requests.
	public List<Tweet> getTweets(String screen_name){	
		tweets.clear();
		
		ConfigurationBuilder cb = new ConfigurationBuilder();
		cb.setDebugEnabled(true)
			.setOAuthConsumerKey("Y5MXQR80ypLHYZhCr1tngfquF")
			.setOAuthConsumerSecret("5ZwfMNw4j51I0amhvQBTAyd2cFVExxEsN5L567nUOwwiWi2tHx")
			.setOAuthAccessToken("29823961-pzOUdLOerGQTTjxYP6IFNY47v3Q3eBzCWHNPPBaPt")
			.setOAuthAccessTokenSecret("yT11MkJDKUfegm6W5NxY1jpkMbLFLQAj52XQ8kbdgP6Fn");
		
		TwitterFactory tf = new TwitterFactory(cb.build());
		twitter4j.Twitter twitter = tf.getInstance();
		try {
			List<Status> status = twitter.getUserTimeline(screen_name);
			//Get text.
			for(Status s : status){
				Tweet tweet = new Tweet(s.getId(), s.getCreatedAt(), s.getText(), s.getUser().getName(), s.getUser().getOriginalProfileImageURL(), screen_name);
				tweets.add(tweet);
				
			}
			
		} catch (TwitterException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return tweets;
	}
	
}

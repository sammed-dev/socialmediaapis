package com.datagrokr.mediaapi.localdatabase;

import java.util.HashMap;
import java.util.Map;

import com.datagrokr.mediaapi.model.Message;
import com.datagrokr.mediaapi.model.Profile;

public class MessageDatabase {

	private static Map<Long, Message> messages = new HashMap<>();
	private static Map<Long, Profile> profiles = new HashMap<>();
	
	public static Map<Long, Message> getMessages(){
		return messages;
	}
	
	public static Map<Long, Profile> getProfiles(){
		return profiles;
	}
}

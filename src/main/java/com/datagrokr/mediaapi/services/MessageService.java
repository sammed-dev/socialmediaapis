package com.datagrokr.mediaapi.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.datagrokr.mediaapi.localdatabase.MessageDatabase;
import com.datagrokr.mediaapi.model.Message;

public class MessageService {
	
	private static Map<Long, Message> messages = MessageDatabase.getMessages();
	
	
	public MessageService() {
		messages.put(1L, new Message(1L,"Hey there", "sammed"));
		messages.put(2L, new Message(2L,"Jax is good", "shreyank"));
	}
	
	
	//to return list of messages:
		public List<Message> getAllMessages(){
			return new ArrayList<Message>(messages.values());
		}
		
//		//to return single message:
//		public Message getMessage(Long id) {
//			return messages.get(id);
//		}
//		
//		//post a message
//		public Message addMessage(Message message) {
//			message.setId(messages.size()+1);
//			messages.put(message.getId(), message);
//			return message;
//		}
//		
//		//update a message
//		public Message updateMessage(Message message) {
//			if(message.getId() <0)
//				return null;
//			messages.put(message.getId(), message);
//			return message;
//		}
//		
//		//post a message
//		public void deleteMessage(Long id) {
//			messages.remove(id);
//		}

}

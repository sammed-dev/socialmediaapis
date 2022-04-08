package com.datagrokr.mediaapi.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.datagrokr.mediaapi.localdatabase.MessageDatabase;
import com.datagrokr.mediaapi.model.Message;

public class MessageService {
	
	private static Map<Long, Message> messages = MessageDatabase.getMessages();
	
	
	public MessageService() {
		messages.put(1L, new Message(1L,"first", "sammed"));
		messages.put(2L, new Message(2L,"second", "shreyank"));
		messages.put(3L, new Message(1L,"third", "sammed"));
		messages.put(4L, new Message(2L,"forth", "shreyank"));
		messages.put(5L, new Message(1L,"fifth", "sammed"));
		messages.put(6L, new Message(2L,"sixth", "shreyank"));
	}
	
	
	//to return list of messages:
		public List<Message> getAllMessages(){
			return new ArrayList<Message>(messages.values());
		}
		
		
		public List<Message> getAllMessagesByAuthor(String author){
			List<Message> messages_authors = new ArrayList<Message>(messages.values());
			List<Message> results = new ArrayList<Message>();
			
			for(Message message : messages_authors) {
				if(message.getAuthor().equals(author))
					results.add(message);
			}
			return results;
		}
		
		public List<Message> getMessagesPaginate(Long start, Long size){
			List<Message> result = new ArrayList<Message>();
			
			for(int i=0;i<size;i++) {
				result.add(messages.get(i));
			}
			return result;
		}
		
//		//to return single message:
		public Message getMessage(Long id) {
			return messages.get(id);
		}
//		
//		//post a message
		public Message addMessage(Message message) {
			message.setId(messages.size()+1L);
			messages.put(message.getId(), message);
			return message;
		}
//		
//		//update a message
		public Message updateMessage(Message message) {
			if(message.getId() <0)
				return null;
			message.setMessage(message.getMessage());
			message.setAuthor(message.getAuthor());
			messages.put(message.getId(), message);
			return message;
		}
//		
//		//post a message
		public void deleteMessage(Long id) {
			messages.remove(id);
		}

}

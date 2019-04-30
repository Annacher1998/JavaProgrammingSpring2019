package day07;

public class PreAndPost2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int messages = 10;
		messages++;
		++messages;
		
		System.out.println("meesages:"+ messages);
		
		int readMessages = --messages;
		System.out.println("readMessages:"+readMessages);
		
		
		System.out.println("message :"+ messages);
		int unreadMessages = readMessages--;
		System.out.println("unreadMessages:"+ unreadMessages);
	System.out.println("readMessages: "+ readMessages);
	
	int totalMessages = unreadMessages++ - readMessages--;//1
	System.out.println("unreadmessages :"+ unreadMessages);//12
	System.out.println("readMessages:"+ readMessages);//9
	System.out.println("totalMessages: "+ totalMessages);// 1
	 
	int count = 20;
	  int count2 = 10;
	  int totalCount= ++count+ --count2;
	  System.out.println("count: "+ count);//21
	  System.out.println("count2: "+ count2);//9
	System.out.println("totalCount: "+ totalCount);//30
	
 int myCount = count++ + ++count;
 System.out.println("my count: "+ myCount);
	
	System.out.println("count:"+ count);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	

}

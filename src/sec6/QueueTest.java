package sec6;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Message> messageQueue = new LinkedList<Message>();
		
		messageQueue.offer(new Message("sendMail", "HongGilDong"));
		messageQueue.offer(new Message("sendSMS", "ShinYongGwon"));
		messageQueue.offer(new Message("sendKakaotalk", "HongDuKe"));
		
		while(!messageQueue.isEmpty()) {
			Message message = messageQueue.poll();
			switch (message.command) {
				case "sendMail": 
					System.out.println("Sending an e-mail to" + message.to);
					break;
				
				case "sendSMS": 
					System.out.println("Sending an SMS to" + message.to);
					break;
					
				case "sendKakaotalk": 
					System.out.println("Sending an Kakaotalk to" + message.to);
					break;
			}
		}
	}
}
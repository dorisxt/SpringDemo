/**
 * 
 */
package doris.practice.springIocPractice.handler;

import java.util.Date;

import org.springframework.stereotype.Service;

/**
 * @author xingting
 *
 */
@Service
public class AmqMessageHandler {
	
	
	public void handleMessage(MessageVo message){
		System.out.println("-----------------receive message("+new Date()+"):"+message.getMessage()+"---------------------");
	}

}

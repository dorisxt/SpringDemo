/**
 * 
 */
package doris.practice.springIocPractice.Listener;

import java.io.Serializable;

import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.ObjectMessage;
import javax.jms.TextMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import doris.practice.springIocPractice.handler.AmqMessageHandler;
import doris.practice.springIocPractice.handler.MessageVo;

/**
 * @author xingting
 *
 */
@Component
public class AmqMessageListener implements MessageListener{
	
	@Autowired
	private AmqMessageHandler amqMessageHandler;
	
	public void onMessage(Message message) {
		try {
			if ((message instanceof TextMessage)) {
				String text = ((TextMessage) message).getText();
				MessageVo messageVO = new MessageVo();
				messageVO.setMessage(text);
				this.amqMessageHandler.handleMessage(messageVO);
			} else if ((message instanceof ObjectMessage)) {
				Serializable objMsg = ((ObjectMessage) message).getObject();
				MessageVo messageVO = (MessageVo) objMsg;
				this.amqMessageHandler.handleMessage(messageVO);
			}
		} catch (Throwable e) {
			e.printStackTrace();
		}
		
	}

}

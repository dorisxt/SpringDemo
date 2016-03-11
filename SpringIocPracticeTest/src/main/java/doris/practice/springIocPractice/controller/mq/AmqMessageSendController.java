/**
 * 
 */
package doris.practice.springIocPractice.controller.mq;

import javax.jms.DeliveryMode;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import doris.practice.springIocPractice.handler.MessageVo;

/**
 * @author xingting
 *
 */
@Controller
@RequestMapping("/amqMessage")
public class AmqMessageSendController {
	
	@Autowired
	private JmsTemplate jmsQueueTemplate;
	
	@Value("${activemq.queueName}")
	private String quenueName;
	
	@RequestMapping(value="/send",  method = RequestMethod.POST)
	@ResponseBody
	public String messageSend(@RequestParam String msg){
		final MessageVo messageVo = new MessageVo();
		messageVo.setMessage(msg);
		this.jmsQueueTemplate.send("quenue_test", new MessageCreator() {
			public Message createMessage(Session session) throws JMSException {
				Message message = session.createObjectMessage(messageVo);
					message.setJMSDeliveryMode(DeliveryMode.PERSISTENT);
				message.setJMSPriority(4);
				return message;
			}
		});
		return "success";
	}

}

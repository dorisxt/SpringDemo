package doris.practice.springIocPractice.handler;

import java.io.Serializable;

public class MessageVo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Serializable message;

	public Serializable getMessage() {
		return message;
	}

	public void setMessage(Serializable message) {
		this.message = message;
	}
}

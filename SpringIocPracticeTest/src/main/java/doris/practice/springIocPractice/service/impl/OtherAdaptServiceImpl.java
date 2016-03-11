/**
 * 
 */
package doris.practice.springIocPractice.service.impl;

import org.springframework.stereotype.Service;

/**
 * @author doris
 *
 */
@Service
public class OtherAdaptServiceImpl extends AdapteServiceImpl{

	@Override
	public void sayHello() {
		// TODO Auto-generated method stub
		System.out.println("OtherAdaptServiceImpl");
	}

}

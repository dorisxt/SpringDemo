/**
 * 
 */
package doris.practice.springIocPractice.service.impl;

import org.springframework.stereotype.Service;

import doris.practice.springIocPractice.service.IAdapteService;

/**
 * @author doris
 *
 */
@Service
public class AdapteServiceImpl implements IAdapteService{

	@Override
	public void sayHello() {
		// TODO Auto-generated method stub
		System.out.println("default");
		
	}

}

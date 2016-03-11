package doris.practice.springIocPractice.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import doris.practice.springIocPractice.service.LoginService;
import doris.practice.springIocPractice.service.impl.AdapteServiceImpl;

 
/**
 * @author xingting
 *
 */
@Controller
@RequestMapping("/login")
public class LoginController {
    
    @Autowired
    private LoginService loginService;
    
    @RequestMapping(value = "/doLoingin", method = RequestMethod.POST)
//    @ResponseBody
    public String login(@RequestParam String userName, @RequestParam String password ) throws Exception{
        HashMap<String,String> configMap = new HashMap<String,String>();
        configMap.put("hd", "doris.practice.springIocPractice.service.impl.HdAdapteServiceImpl");
        configMap.put("other", "doris.practice.springIocPractice.service.impl.OtherAdaptServiceImpl");
        Class classObj = Class.forName((String)configMap.get("hd"));
        AdapteServiceImpl service = (AdapteServiceImpl)classObj.newInstance();
        	service.sayHello();
        	 Class classObj2 = Class.forName((String)configMap.get("other"));
             AdapteServiceImpl service2 = (AdapteServiceImpl)classObj2.newInstance();
             	service2.sayHello();
        loginService.login();
    	return "mq_sender";
    }
    
    @RequestMapping(value = "/signon", method = RequestMethod.GET)
//    @ResponseBody
    public String signon(){
        System.out.println("doris netty test success!");
//        return "doris netty test success!";
        return "login";
    }
    

}

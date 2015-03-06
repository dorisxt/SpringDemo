/*
 * 项目名:      农夫山泉小瓶水系统
 * 文件名:      LoginController.java
 * 类名:        LoginController
 *
 * 版权声明:
 *      本系统的所有内容，包括源码、页面设计，文字、图像以及其他任何信息，
 *      如未经特殊说明，其版权均属农夫山泉股份有限公司所有。
 *
 *      Copyright (c) 2013 农夫山泉股份有限公司
 *      版权所有
 */
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
 * 类名:		LoginController
 * 描述:		TODO
 * @author 	tingxing
 *
 */
@Controller
@RequestMapping("/login")
public class LoginController {
    
    @Autowired
    private LoginService loginService;
    
    @RequestMapping(value = "/doLoingin", method = RequestMethod.POST)
    @ResponseBody
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
    	return loginService.login();
    }
    
    @RequestMapping(value = "/signon", method = RequestMethod.GET)
//    @ResponseBody
    public String signon(){
        System.out.println("doris netty test success!");
//        return "doris netty test success!";
        return "login";
    }
    

}

/*
 * 项目名:      农夫山泉小瓶水系统
 * 文件名:      SingonService.java
 * 类名:        SingonService
 *
 * 版权声明:
 *      本系统的所有内容，包括源码、页面设计，文字、图像以及其他任何信息，
 *      如未经特殊说明，其版权均属农夫山泉股份有限公司所有。
 *
 *      Copyright (c) 2013 农夫山泉股份有限公司
 *      版权所有
 */
package doris.practice.springIocPractice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 类名:		SingonService
 * 描述:		TODO
 * @author 	tingxing
 *
 */
@Service
public class SingonService {
    
    @Autowired
    private LoginService loginService;
    
    public String signon(){
        return loginService.signon();
    }
    
    public String login(){
        return "siginonService.login";
    }

}

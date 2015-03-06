/*
 * ��Ŀ��:      ũ��ɽȪСƿˮϵͳ
 * �ļ���:      SingonService.java
 * ����:        SingonService
 *
 * ��Ȩ����:
 *      ��ϵͳ���������ݣ�����Դ�롢ҳ����ƣ����֡�ͼ���Լ������κ���Ϣ��
 *      ��δ������˵�������Ȩ����ũ��ɽȪ�ɷ����޹�˾���С�
 *
 *      Copyright (c) 2013 ũ��ɽȪ�ɷ����޹�˾
 *      ��Ȩ����
 */
package doris.practice.springIocPractice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ����:		SingonService
 * ����:		TODO
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

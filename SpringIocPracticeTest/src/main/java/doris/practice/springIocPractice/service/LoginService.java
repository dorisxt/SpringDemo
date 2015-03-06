/*
 * ��Ŀ��:      ũ��ɽȪСƿˮϵͳ
 * �ļ���:      LoginService.java
 * ����:        LoginService
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
 * ����:		LoginService
 * ����:		TODO
 * @author 	tingxing
 *
 */
@Service
public class LoginService {

    @Autowired
    private SingonService  signonService;
    
    public String login(){
        return signonService.login();
    }
    public String signon(){
        return "LoginService.signon";
    }
}

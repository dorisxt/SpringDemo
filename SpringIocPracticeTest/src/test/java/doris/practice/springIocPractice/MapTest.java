/*
 * ��Ŀ��:      ũ��ɽȪСƿˮϵͳ
 * �ļ���:      MapTest.java
 * ����:        MapTest
 *
 * ��Ȩ����:
 *      ��ϵͳ���������ݣ�����Դ�롢ҳ����ƣ����֡�ͼ���Լ������κ���Ϣ��
 *      ��δ������˵�������Ȩ����ũ��ɽȪ�ɷ����޹�˾���С�
 *
 *      Copyright (c) 2013 ũ��ɽȪ�ɷ����޹�˾
 *      ��Ȩ����
 */
package doris.practice.springIocPractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * ����:		MapTest
 * ����:		TODO
 * @author 	tingxing
 *
 */
public class MapTest {
    
    public static void main(String args[]){
        Map<String, String> maptest = new HashMap<String, String>();
        maptest.put("1", "2");
        maptest.put("3", "5");
        maptest.put("4", "6");
        Set<Map.Entry<String,String>> sets= maptest.entrySet();
        System.out.println(sets);
    }

}

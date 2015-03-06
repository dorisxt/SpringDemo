/*
 * 项目名:      农夫山泉小瓶水系统
 * 文件名:      MapTest.java
 * 类名:        MapTest
 *
 * 版权声明:
 *      本系统的所有内容，包括源码、页面设计，文字、图像以及其他任何信息，
 *      如未经特殊说明，其版权均属农夫山泉股份有限公司所有。
 *
 *      Copyright (c) 2013 农夫山泉股份有限公司
 *      版权所有
 */
package doris.practice.springIocPractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 类名:		MapTest
 * 描述:		TODO
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

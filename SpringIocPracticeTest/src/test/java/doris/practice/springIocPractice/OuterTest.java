/*
 * 项目名:      农夫山泉小瓶水系统
 * 文件名:      OuterTest.java
 * 类名:        OuterTest
 *
 * 版权声明:
 *      本系统的所有内容，包括源码、页面设计，文字、图像以及其他任何信息，
 *      如未经特殊说明，其版权均属农夫山泉股份有限公司所有。
 *
 *      Copyright (c) 2013 农夫山泉股份有限公司
 *      版权所有
 */
package doris.practice.springIocPractice;

import java.lang.reflect.Field;
import java.util.Properties;


/**
 * 类名:		InnerTest
 * 描述:		内部类测试
 * @author 	tingxing
 *
 */
public class OuterTest {
    private String out = "out";

    public class FirstInner {
        private String fisrt = "first";

        /**
         * @return 返回变量fisrt的值
         */
        public String getFisrt() {
            return fisrt;
        }

        /**
         * @param fisrt 设置fisrt的值
         */
        public void setFisrt(String fisrt) {
            this.fisrt = fisrt;
        }

        public class SecondInner {
            private String second = "second";

            /**
             * @return 返回变量second的值
             */
            public String getSecond() {
                return second;
            }

            /**
             * @param second 设置second的值
             */
            public void setSecond(String second) {
                this.second = second;
            }

            public class ThirdInner {
                private String third = "third";

                /**
                 * @return 返回变量third的值
                 */
                public String getThird() {
                    return third;
                }
                
                public void printParentField(){
                    System.out.println(second);
                }

                /**
                 * @param third 设置third的值
                 */
                public void setThird(String third) {
                    this.third = third;
                }
            }
        }

    }

    /**
     * @return 返回变量out的值
     */
    public String getOut() {
        return out;
    }

    /**
     * @param out 设置out的值
     */
    public void setOut(String out) {
        this.out = out;
    }

    public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
        OuterTest outer = new OuterTest();
        FirstInner first = outer.new FirstInner();
        FirstInner.SecondInner second = first.new SecondInner();
        FirstInner.SecondInner.ThirdInner third = second.new ThirdInner();
        
        Field outField = first.getClass().getDeclaredField("this$0");
        Object object = outField.get(first);
        object = (OuterTest)object;
        System.out.println(object instanceof OuterTest);
        third.printParentField();
        System.out.println(third.getClass().getClassLoader());
        Properties pp = System.getProperties();
        System.out.println(pp);
    }

}

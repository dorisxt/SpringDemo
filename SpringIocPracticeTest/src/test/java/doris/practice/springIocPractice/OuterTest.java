/*
 * ��Ŀ��:      ũ��ɽȪСƿˮϵͳ
 * �ļ���:      OuterTest.java
 * ����:        OuterTest
 *
 * ��Ȩ����:
 *      ��ϵͳ���������ݣ�����Դ�롢ҳ����ƣ����֡�ͼ���Լ������κ���Ϣ��
 *      ��δ������˵�������Ȩ����ũ��ɽȪ�ɷ����޹�˾���С�
 *
 *      Copyright (c) 2013 ũ��ɽȪ�ɷ����޹�˾
 *      ��Ȩ����
 */
package doris.practice.springIocPractice;

import java.lang.reflect.Field;
import java.util.Properties;


/**
 * ����:		InnerTest
 * ����:		�ڲ������
 * @author 	tingxing
 *
 */
public class OuterTest {
    private String out = "out";

    public class FirstInner {
        private String fisrt = "first";

        /**
         * @return ���ر���fisrt��ֵ
         */
        public String getFisrt() {
            return fisrt;
        }

        /**
         * @param fisrt ����fisrt��ֵ
         */
        public void setFisrt(String fisrt) {
            this.fisrt = fisrt;
        }

        public class SecondInner {
            private String second = "second";

            /**
             * @return ���ر���second��ֵ
             */
            public String getSecond() {
                return second;
            }

            /**
             * @param second ����second��ֵ
             */
            public void setSecond(String second) {
                this.second = second;
            }

            public class ThirdInner {
                private String third = "third";

                /**
                 * @return ���ر���third��ֵ
                 */
                public String getThird() {
                    return third;
                }
                
                public void printParentField(){
                    System.out.println(second);
                }

                /**
                 * @param third ����third��ֵ
                 */
                public void setThird(String third) {
                    this.third = third;
                }
            }
        }

    }

    /**
     * @return ���ر���out��ֵ
     */
    public String getOut() {
        return out;
    }

    /**
     * @param out ����out��ֵ
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

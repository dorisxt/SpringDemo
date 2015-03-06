/*
 * 项目名:      农夫山泉小瓶水系统
 * 文件名:      ThreadTest.java
 * 类名:        ThreadTest
 *
 * 版权声明:
 *      本系统的所有内容，包括源码、页面设计，文字、图像以及其他任何信息，
 *      如未经特殊说明，其版权均属农夫山泉股份有限公司所有。
 *
 *      Copyright (c) 2013 农夫山泉股份有限公司
 *      版权所有
 */
package doris.practice.springIocPractice;

/**
 * 类名:		ThreadTest
 * 描述:		TODO
 * @author 	tingxing
 *
 */

class ShareData {
    public static String szData = "";
}

public class ThreadTest extends Thread {

    private String    nameh;

    private ShareData oShare;

    public ThreadTest(String name, ShareData shareData) {
        this.nameh = name;
        this.oShare = shareData;
    }
    

    /**
     * @return 返回变量nameh的值
     */
    public String getNameh() {
        return nameh;
    }


    /**
     * @param nameh 设置nameh的值
     */
    public void setNameh(String nameh) {
        this.nameh = nameh;
    }


    /* (non-Javadoc)
     * @see java.lang.Runnable#run()
     */
    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            if (this.getNameh().equals("Thread1")) {
                // 锁定oShare共享对象  
//                synchronized (oShare) {
                    oShare.szData = "这是第 1 个线程";
                    // 为了演示产生的问题，这里设置一次睡眠  
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {}
                    // 输出结果  
                    System.out.println(this.getNameh() + ":" + oShare.szData);
//                }
            } else if (this.getNameh().equals("Thread2")) {
                // 锁定共享对象  
//                synchronized (oShare) {
                    oShare.szData = "这是第2个线程";
                    // 为了演示产生的问题，这里设置一次睡眠  
                    try {
                        Thread.sleep(10000);
                    } catch (InterruptedException e) {}
                    // 输出结果  
                    System.out.println(this.getNameh() + ":" + oShare.szData);
//                }
            }
        }
    }
}

class ThreadMain {
    public static void main(String argv[]) {
        ShareData oShare = new ShareData();
        ThreadTest th = new ThreadTest("Thread1", oShare);
        ThreadTest th1 = new ThreadTest("Thread2", oShare);
        // 调用start()方法执行一个新的线程  
        th.start();
        th1.start();
    }
}

/*
 * ��Ŀ��:      ũ��ɽȪСƿˮϵͳ
 * �ļ���:      ThreadTest.java
 * ����:        ThreadTest
 *
 * ��Ȩ����:
 *      ��ϵͳ���������ݣ�����Դ�롢ҳ����ƣ����֡�ͼ���Լ������κ���Ϣ��
 *      ��δ������˵�������Ȩ����ũ��ɽȪ�ɷ����޹�˾���С�
 *
 *      Copyright (c) 2013 ũ��ɽȪ�ɷ����޹�˾
 *      ��Ȩ����
 */
package doris.practice.springIocPractice;

/**
 * ����:		ThreadTest
 * ����:		TODO
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
     * @return ���ر���nameh��ֵ
     */
    public String getNameh() {
        return nameh;
    }


    /**
     * @param nameh ����nameh��ֵ
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
                // ����oShare�������  
//                synchronized (oShare) {
                    oShare.szData = "���ǵ� 1 ���߳�";
                    // Ϊ����ʾ���������⣬��������һ��˯��  
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {}
                    // ������  
                    System.out.println(this.getNameh() + ":" + oShare.szData);
//                }
            } else if (this.getNameh().equals("Thread2")) {
                // �����������  
//                synchronized (oShare) {
                    oShare.szData = "���ǵ�2���߳�";
                    // Ϊ����ʾ���������⣬��������һ��˯��  
                    try {
                        Thread.sleep(10000);
                    } catch (InterruptedException e) {}
                    // ������  
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
        // ����start()����ִ��һ���µ��߳�  
        th.start();
        th1.start();
    }
}

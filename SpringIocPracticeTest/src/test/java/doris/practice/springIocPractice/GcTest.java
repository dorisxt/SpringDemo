/**
 * 
 */
package doris.practice.springIocPractice;

/**
 * @author doris
 *
 */
public class GcTest {
	
	
	public static void main(String[] args){
		System.out.println("gc test");
		int _1MB = 1024*1024;
		byte[] allocation1,allocation2,allocation3,allocation4,allocation5,allocation6,allocation7,allocation8;
		allocation1 = new byte[_1MB/4];
		allocation2 = new byte[_1MB/4];
		allocation3 = new byte[_1MB*4];
//		allocation4 = new byte[_1MB*4];
		allocation3 = null;
		allocation4 = new byte[_1MB*4];
		
		/*����������GC��full gc��*/
/* 		allocation1 = new byte[_1MB*2];
 		allocation2 = new byte[_1MB*2];
 		allocation3 = new byte[_1MB*2];
 		allocation1 = null;
 		//����allocation4�����ڴ����ʱ��������������Eden��8M���������ڴ���䣬�����һ��GC��GCʱ����
 		//allocation2,allocation3������ڴ��survivor�Ŀռ������������������������£�HandlePromotionFailure=true�������������������
 		allocation4 = new byte[_1MB*2];
 	    allocation5 = new byte[_1MB*2];
 		allocation6 = new byte[_1MB*2];
		//allocation4=nullʱ�������GC��allocation4���ڴ�ᱻ����
 		allocation4 = null;
 		allocation5 = null;
 		allocation6 = null;
 		allocation7 = new byte[_1MB*2];
*/	}

}

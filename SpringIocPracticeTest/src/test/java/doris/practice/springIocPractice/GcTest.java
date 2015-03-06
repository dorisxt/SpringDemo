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
		
		/*测试老生代GC（full gc）*/
/* 		allocation1 = new byte[_1MB*2];
 		allocation2 = new byte[_1MB*2];
 		allocation3 = new byte[_1MB*2];
 		allocation1 = null;
 		//当对allocation4进行内存分配时，发现新生代中Eden（8M）区不够内存分配，则进行一次GC，GC时发现
 		//allocation2,allocation3对象的内存比survivor的空间大，在允许老生代担保的情况下（HandlePromotionFailure=true），则存入老生代区域
 		allocation4 = new byte[_1MB*2];
 	    allocation5 = new byte[_1MB*2];
 		allocation6 = new byte[_1MB*2];
		//allocation4=null时，则进行GC后，allocation4的内存会被回收
 		allocation4 = null;
 		allocation5 = null;
 		allocation6 = null;
 		allocation7 = new byte[_1MB*2];
*/	}

}

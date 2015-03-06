/**
 * 
 */
package doris.practice.springIocPractice.service;


/**
 * @author doris
 *
 */
public class OomTest {
	
	static class OomObject{
		
		public OomObject(){
			System.out.println("test");
		}
	}
//	
	public static void main(String args[]){
		/*List<OomObject> list = new ArrayList<OomObject>();
		 System.out.println("test");
		while(true){
		list.add(new OomObject());
		}*/
		new OomObject();
//		OomTest oo = new OomTest();
		System.gc();
	
	}

}

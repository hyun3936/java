package Chap_09;

public class Test01 {
	public static void main(String[] args) {
		Object obj1 = new Object();
		Object obj2 = new Object();
		Object obj3 = new Object();
		
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		System.out.println(obj3.hashCode());
		
		System.out.println(obj1.getClass());
		System.out.println(obj2.getClass());
		System.out.println(obj3.getClass());
		
		System.out.println(obj1.toString());  // toString

		System.out.println(obj1); 	// toString 자동호출 : println이 string이라 ...
	    // 위에 두개 결과가 같음.
		
	
		
		
		System.out.println(Integer.toHexString(obj1.hashCode()));
		
		
		
		MyObject obj4 = new MyObject();
		System.out.println(obj4.toString());
		
		if(obj1.equals(obj2))
			System.out.println("같다");
		else 
			System.out.println("다르다");
		if (obj1 == obj2)
			System.out.println("같다");
	
		
		
		
	}
	
}
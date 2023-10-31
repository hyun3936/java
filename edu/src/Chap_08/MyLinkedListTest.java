package Chap_08;

public class MyLinkedListTest {
	public static void main(String[] args) {
		MyLinkedList myList = new MyLinkedList();
		myList.print();
		
		myList.add("JAVA");
		myList.add("JSP");
		myList.add("Servlet");
		myList.add("Python");
		myList.add("Spring");
		myList.print();
		
		
		
		System.out.println("-".repeat(40));
		
		MyLinkedList2 myList2 = new MyLinkedList2();		
		myList2.print();
		
		myList2.add("JAVA1");
		myList2.add("JSP1");
		myList2.add("Servlet");
		myList2.add("Python");
		myList2.add("Spring");
		
		myList2.add("Java", "C++");
		myList2.add("Servlet", "C#");
		
		myList2.print();
		
	}

}

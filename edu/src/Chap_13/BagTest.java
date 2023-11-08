package Chap_13;

// 제네릭 : 데이터 타입을 매개변수로 지정하는 것
// 타입매개변수 :  실행 시 인자로 전달하는 타입을 변수의 타입으로 지정하는 것
// 일반적으로 타입 매개변수의 이름은 T,V 처럼 알파벳 대문자 한 글자로 표현

class Bag<T> { // 제네릭 클래스, <T>는 타입인자	
	private T thing;

	public Bag(T thing) {
		 this.thing = thing;
	 }

	public T getThing() {
		return thing;
	} // 제네릭 클래스 Bag이 다음처럼 선언되었다면 Bag은 객체 생성 시 어떤 타입 인자도 받을수 있음.
	
	
	
	public void setThing(T thing) {
		this.thing = thing;
	}

	void showType() {
		System.out.println("T의 타입은 " + thing.getClass().getName());
	}
}


class Book {
}

class PencilCase {
}

class Notebook {
}


public class BagTest {
	public static void main(String[] args) {
		Bag<Book> bag = new Bag<>(new Book());
		Bag<PencilCase> bag2 = new Bag<>(new PencilCase());
		Bag<Notebook> bag3 = new Bag<>(new Notebook());

		bag.showType();
		bag2.showType();
		bag3.showType();
		
		// bag = bag2; // 에러   Bag<book> != Bag<pencil> 
		
	}

}
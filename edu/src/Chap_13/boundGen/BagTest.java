package Chap_13.boundGen; // 타입 제한


class Bag <T extends Solid>{ // bag 내용을 solid로만 제한
	private T thing;
	
	public Bag(T thing) {
		this.thing = thing;
	}

	public T getThing() {
		return thing;
	}

	public void setThing(T thing) {
		this.thing = thing;
	}
	

	void showType() {
		System.out.println("T의 타입은 " + thing.getClass().getName());
	}
}

class Solid {}
class Liquid {}

class Book extends Solid{}
class PensilCase extends Solid{}
class Notebook extends Solid{}

class Water extends Solid{}
class Coffee extends Solid{}

public class BagTest {

	public static void main(String[] args) {
		
		Bag<Book> bag = new Bag<>(new Book());
		Bag<PensilCase> bag2 = new Bag<>(new PensilCase());
		Bag<Notebook> bag3 = new Bag<>(new Notebook());
		
		Bag<Water> bag4 = new Bag<>(new Water()); // 오류 발생
		Bag<Coffee> bag5 = new Bag<>(new Coffee()); // 오류 발생
	}
}
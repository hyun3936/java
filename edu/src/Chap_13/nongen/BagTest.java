package Chap_13.nongen;

// 제네릭의 장점 테스트      Chap_13_BagTest 와 비교
// 1. 제네릭은 불필요한 타입 변경을 없애준다
// 2. 제네릭은 엄격한 타입 검사를 통해 안정성을 높여준다.


class Bag {
	private Object thing;

	public Bag(Object thing) {
		this.thing = thing;
	}

	public Object getThing() {
		return thing;
	}

	public void setThing(Object thing) {
		this.thing = thing;
	}

	void showType() {
		System.out.println("T의 타입은 " + thing.getClass().getName());
	}
}

class Book {}
class PencilCase {}
class Notebook {}

public class BagTest {

	public static void main(String[] args) {
		Bag bag = new Bag(new Book());
		Bag bag2 = new Bag(new PencilCase());
		Bag bag3 = new Bag(new Notebook());

		Book book = (Book) bag.getThing();  // (Book)은 type casting
		PencilCase pc = (PencilCase) bag2.getThing();
		Notebook nb = (Notebook) bag3.getThing();

		bag = bag2; // 여기가 공부하는 포인트. 앞에는 에러떳는데 여긴 안남. 이유는 모두가 타입이 Bag로 같기때문.
		// 제네릭은 엄격한 타입 검사를 통해 안정성을 높여준다.
	}
}
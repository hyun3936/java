package Chap_13.wildCard; // 와일드 카드


class Bag <T extends Solid>{
	private T thing;
	private String owner;
	
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
	
	public String getOwner() {
		return owner;
	}
	
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	
	boolean isSameOwner(Bag<T>obj) {  // 여기서 <T> 대신에 <?>가 들어가면 와일드 카드
		if(this.owner.equals(obj.getOwner()))
			return true;
		return false;
	}
	
}

class Solid {}
class Liquid {}

class Book extends Solid{}
class PensilCase extends Solid{}
class Notebook extends Solid{}

class Water extends Solid{}
class Coffee extends Solid{}

public class BagClass {

	public static void main(String[] args) {
		
		Bag<Book> bag = new Bag<>(new Book());
		Bag<PensilCase> bag2 = new Bag<>(new PensilCase());
		Bag<Notebook> bag3 = new Bag<>(new Notebook());
		
		bag.showType();
		bag2.showType();
		bag3.showType();
		
		bag.setOwner("홍길동");
		bag2.setOwner("홍길동");
		
		
	}
}
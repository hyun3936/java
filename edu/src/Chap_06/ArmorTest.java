package Chap_06;

public class ArmorTest {
	
	public void dowork() {
		Armor suit1 = new Armor();
		Armor suit2 = new Armor();
		Armor suit3 = new Armor();
		
		suit1.setName("mark6");
		suit1.setHeight(180);
		
		suit2.setName("mark16");
		suit2.setHeight(220);
		
		suit3.setName("mark38");
		suit3.setHeight(200);
		
		System.out.println(suit1.getName() + " : " + suit1.getHeight());
		System.out.println(suit2.getName() + " : " + suit2.getHeight());
		System.out.println(suit3.getName() + " : " + suit3.getHeight());
	}
	
	public static void main(String[] args) {
	//	dowork(); 
		// 위에 걸 가져오기 위해서 참조변수 선언 
		ArmorTest at = new ArmorTest();
		at.dowork();
	}
}

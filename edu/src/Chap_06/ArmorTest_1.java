package Chap_06;

public class ArmorTest_1 {
	public static void main(String[] args) {
		Armor suit1 = new Armor();
		Armor suit2 = new Armor();
		Armor suit3 = new Armor();
		
		suit1.setName("mark6");
		suit1.setHeight(111);
		
		suit2.setName("mark16");
		suit2.setHeight(222);
		
		
		suit3.setName("mark36");
		suit3.setHeight(333);
		
		System.out.println(suit1.getName() + " : " + suit1.getHeight());
		System.out.println(suit2.getName() + " : " + suit2.getHeight());
		System.out.println(suit3.getName() + " : " + suit3.getHeight());
				
	}

}

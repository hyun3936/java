package StarCraft;

public class Unit {
	
	
private long health;

public Unit(Long health) {
	this.health = health;
}


public long getHealth() {
	return health;
}

public void setHealth(long health) {
	this.health = health;
	System.out.println("Health" + health);
	if(health < 0L) {
		System.out.println("사망하셨습니다.");
	}
}



public void attack() {
	System.out.println("공격합니다.");
}







}

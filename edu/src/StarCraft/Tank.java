package StarCraft;

public class Tank extends Unit{
	public Tank() {
		super(100L);
	}

	@Overrideeed
	public void attack() {
		 super.attack();
		 System.out.println("포를 쏩니다.");
	}
}

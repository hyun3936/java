package StarCraft;

public class Marine extends Unit{
	
	public Marine {
		super(50L);
	}
	
	@Override
	public void attack() {
		// TODO Auto-generated method stub
		super.attack();
		System.out.println("총을 쏩니다.");
	}
	
	
	
	
	
	
	public void attack() {
		System.out.println("공격합니다.");
	}

}

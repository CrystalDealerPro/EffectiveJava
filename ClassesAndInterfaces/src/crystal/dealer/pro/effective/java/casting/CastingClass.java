package crystal.dealer.pro.effective.java.casting;

public class CastingClass implements CastingInterface {

	private int num;
	private String name;
		
	public CastingClass(int num, String name) {
		super();
		this.num = num;
		this.name = name;
	}
	
	public int getNum() {
		return num;
	}
	
	public String getName() {
		return name;
	}

	@Override
	public void castingAction() {
		System.out.println("Casting class CASTING ACTION.");
		
	}
	
	
	
}

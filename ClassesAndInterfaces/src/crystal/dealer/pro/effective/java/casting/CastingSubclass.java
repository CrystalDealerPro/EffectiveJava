package crystal.dealer.pro.effective.java.casting;

public class CastingSubclass extends CastingClass{

	public CastingSubclass(int num, String name) {
		super(num, name);
	}

	
	@Override
	public void castingAction() {
		System.out.println("CastingSubclass CASTING ACTION.");
		
	}
}

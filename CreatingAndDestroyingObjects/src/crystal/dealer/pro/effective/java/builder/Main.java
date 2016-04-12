package crystal.dealer.pro.effective.java.builder;

public class Main {

	public static void main(String[] args) {

		BuilderInitializedObject object = new BuilderInitializedObject.Builder(
				10, 43).calories(10).carbohydrate(67).fat(219).sodium(32)
				.build();

		System.out.println(object.toString());
		
	}
}

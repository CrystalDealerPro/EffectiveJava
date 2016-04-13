package crystal.dealer.pro.effective.java.builder;

public class Main {

	public static void main(String[] args) {

		IBuilder<NutritionFacts> nutrBuilder =  new NutritionFacts.Builder(10, 20)
		.calories(42)
		.carbohydrate(43)
		.fat(2134)
		.sodium(432);
		
		IBuilder<PackageFacts> packBuilder = new PackageFacts.Builder()
		.setHeight(321)
		.setType("Bottle")
		.setWeight(342)
		.setWidth(12);
		
		Product p = Factory.buildProduct(nutrBuilder, packBuilder);
		
	}
}

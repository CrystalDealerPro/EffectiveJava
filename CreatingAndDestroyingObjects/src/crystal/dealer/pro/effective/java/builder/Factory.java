package crystal.dealer.pro.effective.java.builder;

public class Factory {

	public static Product buildProduct(IBuilder<? extends NutritionFacts> nutrBuilder, IBuilder<? extends PackageFacts> packBuilder){
		NutritionFacts nutr = nutrBuilder
		.build();
		
		PackageFacts pack = packBuilder
		.build();
		
		return new Product(pack, nutr);
	}

}

package crystal.dealer.pro.effective.java.builder;

public class Product {

	private final PackageFacts packing;
	
	private final NutritionFacts nutrition;
	
	public Product(PackageFacts p, NutritionFacts n){
		this.packing = p;
		this.nutrition = n;
	}

	public PackageFacts getPacking() {
		return packing;
	}

	public NutritionFacts getNutrition() {
		return nutrition;
	}
	
	
}

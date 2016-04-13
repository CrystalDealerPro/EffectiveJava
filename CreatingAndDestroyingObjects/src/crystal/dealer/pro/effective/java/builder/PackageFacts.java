package crystal.dealer.pro.effective.java.builder;

public class PackageFacts {

	private final String type;
	private final int weight;
	private final int height;
	private final int width;
	
	public static class Builder implements IBuilder<PackageFacts>{

		private String type;
		private int weight;
		private int height;
		private int width;
		
		@Override
		public PackageFacts build() {
			return new PackageFacts(this);
		}

		public Builder setType(String type) {
			this.type = type;
			return this;
		}

		public Builder setWeight(int weight) {
			this.weight = weight;
			return this;
		}

		public Builder setHeight(int height) {
			this.height = height;
			return this;
		}

		public Builder setWidth(int width) {
			this.width = width;
			return this;
		}
		
	}
	
	private PackageFacts(Builder builder){
		this.height = builder.height;
		this.width = builder.width;
		this.weight = builder.weight;
		this.type = builder.type;
	}
	
	public String getType() {
		return type;
	}
	public int getWeight() {
		return weight;
	}
	public int getHeight() {
		return height;
	}
	public int getWidth() {
		return width;
	}
	
	
}

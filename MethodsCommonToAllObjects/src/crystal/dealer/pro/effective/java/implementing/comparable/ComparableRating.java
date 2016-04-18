package crystal.dealer.pro.effective.java.implementing.comparable;

public class ComparableRating implements Comparable<ComparableRating>{

	private int rating1;
	private int rating2;
	private double rating3;
	private String name;
	
	public ComparableRating(int rating1, int rating2, double rating3,
			String name) {
		super();
		this.rating1 = rating1;
		this.rating2 = rating2;
		this.rating3 = rating3;
		this.name = name;
	}

	@Override
	public int compareTo(ComparableRating o) {
		return Double.compare(rating1 + rating2 + rating3, o.rating1 + o.rating2 + o.rating3);
	}

	public int getRating1() {
		return rating1;
	}

	public int getRating2() {
		return rating2;
	}

	public double getRating3() {
		return rating3;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "ComparableRating [rating1=" + rating1 + ", rating2=" + rating2
				+ ", rating3=" + rating3 + ", name=" + name + ", ratings sum=" + (rating1 + rating2 + rating3) + "]";
	}
	
}

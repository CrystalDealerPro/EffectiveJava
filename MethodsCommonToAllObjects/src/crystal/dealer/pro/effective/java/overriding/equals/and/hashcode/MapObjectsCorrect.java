package crystal.dealer.pro.effective.java.overriding.equals.and.hashcode;

import java.util.Date;

public class MapObjectsCorrect {

	private int num1;
	private String name1;
	private Date date1;
	
	
	public MapObjectsCorrect(int num1, String name1, Date date1) {
		super();
		this.num1 = num1;
		this.name1 = name1;
		this.date1 = date1;
	}
	public int getNum1() {
		return num1;
	}
	public String getName1() {
		return name1;
	}
	public Date getDate1() {
		return date1;
	}
	
	@Override
	public String toString() {
		return "MapObjectsCorrect [num1=" + num1 + ", name1=" + name1
				+ ", date1=" + date1 + "]";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + num1;
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MapObjectsCorrect other = (MapObjectsCorrect) obj;
		if (num1 != other.num1)
			return false;
		return true;
	}
	
	
	
	
}

package crystal.dealer.pro.effective.java.singleton;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Enum singleton - solves the serialization problem automatically.
 * Probably the best approach to make singletons.
 * 
 * @author CrystalDealerPro
 *
 */
public enum Enum {

	INSTANCE;
	
	private int number;
	private String name;
	private Date data;
	private BigDecimal decimal;
	private Double d;
	
	private Enum(){
		System.out.println("CREATING INSTANCE OF Enum enum.");
	}
	
	public void printHashCode(){
		System.out.println(this.hashCode());
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public BigDecimal getDecimal() {
		return decimal;
	}

	public void setDecimal(BigDecimal decimal) {
		this.decimal = decimal;
	}

	public Double getD() {
		return d;
	}

	public void setD(Double d) {
		this.d = d;
	}
	
	public String toFiledString(){
		return "Enum [number=" + number + ", name="
				+ name + ", data=" + data + ", decimal=" + decimal + ", d=" + d
				+ "]";
	}
}

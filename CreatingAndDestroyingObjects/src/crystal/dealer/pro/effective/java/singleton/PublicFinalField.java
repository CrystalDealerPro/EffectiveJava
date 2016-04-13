package crystal.dealer.pro.effective.java.singleton;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Singleton with public static final field approach without serialization.
 * @author CrystalDealerPro
 *
 */
public class PublicFinalField {

	public static final PublicFinalField INSTANCE = new PublicFinalField();
	
	private int number;
	private String name;
	private Date data;
	private BigDecimal decimal;
	private Double d;
	
	@Override
	public String toString() {
		return "PublicFinalField [number=" + number + ", name=" + name
				+ ", data=" + data + ", decimal=" + decimal + ", d=" + d + "]";
	}

	private PublicFinalField() {
		System.out.println("CREATING AN INSTANCE OF PublicFinalField class.");
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
	
	
}

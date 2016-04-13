package crystal.dealer.pro.effective.java.singleton;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Singleton with factory method approach without serialization.
 * @author CrystalDealerPro
 *
 */
public class FactoryMethod {

	private static final FactoryMethod INSTANCE = new FactoryMethod();

	private int number;
	private String name;
	private Date data;
	private BigDecimal decimal;
	private Double d;
	
	private FactoryMethod() {
		System.out.println("CREATING INSTANCE OF FactoryMethod class.");
	}

	public static FactoryMethod getInstance() {
		return INSTANCE;
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

	@Override
	public String toString() {
		return "FactoryMethod [number=" + number + ", name=" + name + ", data="
				+ data + ", decimal=" + decimal + ", d=" + d + "]";
	}
	
	
}

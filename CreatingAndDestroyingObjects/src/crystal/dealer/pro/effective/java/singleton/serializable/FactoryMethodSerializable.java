package crystal.dealer.pro.effective.java.singleton.serializable;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Singleton with factory method approach with correct serialization.
 * @author CrystalDealerPro
 *
 */
public class FactoryMethodSerializable implements Serializable{

	
	private static final long serialVersionUID = 122572375199981341L;
	
	private static final FactoryMethodSerializable INSTANCE = new FactoryMethodSerializable();
	
	private int number;
	private String name;
	private Date data;
	private BigDecimal decimal;
	private Double d;

	private FactoryMethodSerializable() {
		System.out.println("CREATING INSTANCE OF FactoryMethod class.");
	}

	public static FactoryMethodSerializable getInstance() {
		return INSTANCE;
	}
	
	public void printHashCode(){
		System.out.println(this.hashCode());
	}
	
	/**
	 * Needed for serialization. Without this method serialization and deserialization would create a new instance of the class.
	 * @return Returns the single instance of the Singleton class.
	 */
	private Object readResolve() {
		return INSTANCE;
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
		return "FactoryMethodSerializable [number=" + number + ", name=" + name
				+ ", data=" + data + ", decimal=" + decimal + ", d=" + d + "]";
	}
	
	
}

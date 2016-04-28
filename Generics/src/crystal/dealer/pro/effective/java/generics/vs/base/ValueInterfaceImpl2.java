package crystal.dealer.pro.effective.java.generics.vs.base;

import java.math.BigDecimal;

public class ValueInterfaceImpl2 implements ValueInterface{

	@Override
	public BigDecimal getValue() {
		return new BigDecimal(20);
	}

	
}

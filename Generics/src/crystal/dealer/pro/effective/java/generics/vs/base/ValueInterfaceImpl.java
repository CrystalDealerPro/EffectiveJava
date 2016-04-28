package crystal.dealer.pro.effective.java.generics.vs.base;

import java.math.BigDecimal;

public class ValueInterfaceImpl implements ValueInterface {

	@Override
	public BigDecimal getValue() {
		return new BigDecimal(10);
	}

	
}

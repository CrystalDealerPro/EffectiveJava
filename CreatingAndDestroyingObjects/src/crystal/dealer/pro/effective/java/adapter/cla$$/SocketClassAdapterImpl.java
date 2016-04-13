package crystal.dealer.pro.effective.java.adapter.cla$$;

import crystal.dealer.pro.effective.java.adapter.Socket;
import crystal.dealer.pro.effective.java.adapter.SocketAdapter;
import crystal.dealer.pro.effective.java.adapter.Volt;

/**
 * Class Adapter - uses Inheritance to adapt class functionality to specified interface requirements.
 * 
 * @author CrystalDealerPro
 *
 */
public class SocketClassAdapterImpl extends Socket implements SocketAdapter{

	@Override
	public Volt get120Volt() {
		return this.getVolt();
	}

	@Override
	public Volt get12Volt() {
		Volt v = this.getVolt();
		return convertVolt(v, 10);
	}

	@Override
	public Volt get3Volt() {
		Volt v = this.getVolt();
		return convertVolt(v, 40);
	}
	
	 private Volt convertVolt(Volt v, int i) {
        return new Volt(v.getVolts()/i);
    }

	
}

package crystal.dealer.pro.effective.java.adapter.object;

import crystal.dealer.pro.effective.java.adapter.Socket;
import crystal.dealer.pro.effective.java.adapter.SocketAdapter;
import crystal.dealer.pro.effective.java.adapter.Volt;


/**
 * Object Adapter - uses composition to a adapt class functionality to specified interface requirements.
 * 
 * @author CrystalDealerPro
 *
 */
public class SocketObjectAdapterImpl implements SocketAdapter{

   //Using Composition for adapter pattern
    private Socket sock = new Socket();
     
    @Override
    public Volt get120Volt() {
        return sock.getVolt();
    }
 
    @Override
    public Volt get12Volt() {
        Volt v= sock.getVolt();
        return convertVolt(v,10);
    }
 
    @Override
    public Volt get3Volt() {
        Volt v= sock.getVolt();
        return convertVolt(v,40);
    }
     
    private Volt convertVolt(Volt v, int i) {
        return new Volt(v.getVolts()/i);
    }
}

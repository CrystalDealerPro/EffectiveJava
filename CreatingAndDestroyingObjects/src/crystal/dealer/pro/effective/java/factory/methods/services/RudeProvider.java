package crystal.dealer.pro.effective.java.factory.methods.services;

import crystal.dealer.pro.effective.java.factory.methods.Provider;
import crystal.dealer.pro.effective.java.factory.methods.Service;

public class RudeProvider implements Provider{

	private static Service instance;
	
	@Override
	public Service newService() {
		if(instance == null){
			instance = new RudeCorrectService();
		}
		return instance;
	}

	
}

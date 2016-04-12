package crystal.dealer.pro.effective.java.factory.methods.main;

import crystal.dealer.pro.effective.java.factory.methods.Service;
import crystal.dealer.pro.effective.java.factory.methods.Services;
import crystal.dealer.pro.effective.java.factory.methods.services.PoliteProvider;
import crystal.dealer.pro.effective.java.factory.methods.services.RudeProvider;

public class Main {

	public static void main(String[] args){
		
		Services.registerProvider("Rude", new RudeProvider());
		Services.registerProvider("Polite", new PoliteProvider());
		
		Services.registerDefaultProvider(new RudeProvider());
		
		Service defService = Services.newInstance();
		Service politeService = Services.newInstance("Polite");
		Service rudeService = Services.newInstance("Rude");
		
		if(defService == rudeService){
			System.out.println("Rude is default.");
		}
		System.out.println("POLITE:");
		System.out.println(politeService.getGreetingMessage());
		System.out.println(politeService.calculateFactorial(10));
		System.out.println(politeService.calculateInversed(10.0));
		
		System.out.println("RUDE:");
		System.out.println(rudeService.getGreetingMessage());
		System.out.println(rudeService.calculateFactorial(10));
		System.out.println(rudeService.calculateInversed(10.0));
		
		System.out.println("DEFAULT:");
		System.out.println(defService.getGreetingMessage());
		System.out.println(defService.calculateFactorial(10));
		System.out.println(defService.calculateInversed(10.0));
		
	}
	
}

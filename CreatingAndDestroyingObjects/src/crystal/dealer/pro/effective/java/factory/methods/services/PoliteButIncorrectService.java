package crystal.dealer.pro.effective.java.factory.methods.services;

import crystal.dealer.pro.effective.java.factory.methods.Service;

class PoliteButIncorrectService implements Service{

	@Override
	public String getGreetingMessage() {
		return "I will gladly do as You requested Sir.";
	}

	@Override
	public long calculateFactorial(int x) {
		return x*x;
	}

	@Override
	public double calculateInversed(double x) {
		return 5*x;
	}

}

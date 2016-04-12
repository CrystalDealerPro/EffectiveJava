package crystal.dealer.pro.effective.java.factory.methods.services;

import crystal.dealer.pro.effective.java.factory.methods.Service;

class RudeCorrectService implements Service {

	@Override
	public String getGreetingMessage() {
		return "Fuck off.";
	}

	@Override
	public long calculateFactorial(int x) {
		return x < 2 ? 1 : calculateFactorial(x-1)*x;
	}

	@Override
	public double calculateInversed(double x) {
		return 1.0d/x;
	}
	
}

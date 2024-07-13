package myinterface;

public class CalculatorImpl implements Calculator{

	@Override
	public int add(int a, int b) {
		return a + b;
	}

	@Override
	public int substract(int a, int b) {
		return a - b;
	}

	@Override
	public int multiply(int a, int b) {
		return a * b;
	}

	@Override
	public double divide(int a, int b) {
		return (double)a / b;
	}

	@Override
	public int modulas(int a, int b) {
		return a % b;
	}

}

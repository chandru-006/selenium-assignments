package week1.day2;

public class MyCalculator {

	public int add(int a, int b, int c) {
		int addition = a + b + c;
		return addition;
	}

	public int sub(int a, int b) {
		int subraction = a - b;
		return subraction;
	}

	public int mul(int a, int b) {
		int multiplication = a * b;
		return multiplication;
	}

	public float divide(int a, int b) {
		float division = a / b;
		return division;

	}

	public static void main(String[] args) {
		MyCalculator obj = new MyCalculator();
		System.out.println(obj.add(5, 05, 5));
		System.out.println(obj.sub(66, 50));
		System.out.println(obj.mul(5, 4));
		System.out.println(obj.divide(10, 2));
	}

}

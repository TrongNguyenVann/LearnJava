
public class Calculator {

	interface IntegerMath {
		int operate(int a, int b);
	}

	public int operateBinary(int a, int b, IntegerMath op) {
		return op.operate(a, b);
	}

	public static void main(String[] args) {
		Calculator myCal = new Calculator();
		IntegerMath add = (a, b) -> a + b;
		IntegerMath sub = (a, b) -> a - b;
		System.out.println("5 + 2 = " + myCal.operateBinary(5, 2, add));
		System.out.println("5 - 2 = " + myCal.operateBinary(5, 2, sub));
	}


}
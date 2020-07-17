
public class NumberHolder {


	public int anInt;
	public float aFloat;

	public static void main(String[] args) {
		NumberHolder numHolder = new NumberHolder();
		numHolder.anInt = 3;
		numHolder.aFloat = 2.5f;
		numHolder.display();

	}

	private void display() {
		System.out.println("anInt: " + anInt + ", aFloat: " + aFloat);
	}
}

class Constants {

	static final double PI = 3.1416;

	// Define a instance field
	float instanceField = 0.1f;

	// Define a class field
	static int staticID;

	// Static initialization
	static {
		System.out.println("Call to static initialization");
		staticID = 1;
	}

	// Instance initialization. Document said that it will be copied
	// to all constructor
	{
		System.out.println("Call to instance initialization");
	}

	// Define a constructor
	public Constants() {
		System.out.println("Call to empty constructor");
	}

	public Constants(int field) {
		System.out.println("Call to constructor with one input");
		System.out.println("Set instance field");
		instanceField = 0.2f;

	}



	public static void main(String[] args) {
		Constants firstConst = new Constants();
		Constants secondConst = new Constants(1);
	}

}

class BicycleApp {
	public static void main(String[] args) {
		MountainBike mtb = new MountainBike(1, 2, 3, 4);
		mtb.printState();

		downgradeBicycle(mtb);
		if (mtb != null) {
			mtb.printState();
		}
	}

	private static void downgradeBicycle(MountainBike bike) {
		bike.setHeight(20);
		bike = null;
	}
}
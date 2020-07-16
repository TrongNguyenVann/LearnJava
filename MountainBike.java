// Mountainbike is the subclass of Bicycle class
public class MountainBike extends Bicycle {
	// has one field
	public int seatHeight;

	// one constructor
	public MountainBike(int startHeight, int startCadence, int startSpeed, int startGear) {
		super(startCadence, startSpeed, startGear);
		seatHeight = startHeight;
	}

	public void setHeight(int newValue) {
		seatHeight = newValue;
	}

	public void printState() {
		System.out.println("Cadende: " + cadence + ", gear: " + gear + ", speed: " + speed 
			                 + " ,seat height: " + seatHeight);
	}
}
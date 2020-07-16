
public class Bicycle {


	// Bicycle has 3 fields
	public int cadence;
	public int gear;
	public int speed;

	// One constructor
	public Bicycle(int startCadence, int startSpeed, int startGear) {
		cadence = startCadence;
		speed = startSpeed;
		gear = startGear;
	}

	// Bycycle has four methods
	public void setCadence(int newValue) {
		cadence = newValue;
	}

	public void setGear(int newValue) {
		gear = newValue;
	}

	public void applyBrake(int decrement) {
		speed -= decrement;
	}

	public void speedUp(int increment) {
		speed += increment;
	}
}

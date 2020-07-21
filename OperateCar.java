
enum Direction {
	RIGHT,
	LEFT
}

interface OperateCar {
	// Constant declaration

	// Method signatures
	int turn(Direction direction,
					 double radius,
					 double startSpeed,
					 double endSpee);

	int changeLanes(Direction direction,
		              double startSpeed,
		              double endSpeed);
	int signalTurn(Direction direction,
                  boolean signalOn);
	int getRadarFront(double distanceToCar,
	                 double speedOfCar);
	int getRadarRear(double distanceToCar,
	                double speedOfCar);

}

class OperateBMW760i implements OperateCar {
	public int signalTurn(Direction direction,
                  boolean signalOn) {
       // code to turn BMW's LEFT turn indicator lights on
       // code to turn BMW's LEFT turn indicator lights off
       // code to turn BMW's RIGHT turn indicator lights on
       // code to turn BMW's RIGHT turn indicator lights off		
	}
}
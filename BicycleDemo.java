interface BicycleInterface {
  void changeGear(int newValue);

  void speedUp(int increment);

  void applyBrake(int decrement);


}

class Bicycle implements BicycleInterface {

  int speed = 0;
  int gear = 1;

  public void speedUp(int increment) {
    speed += increment;
  }

  public void applyBrake(int decrement) {
    speed -= decrement;
  }

  public void changeGear(int newValue) {
    gear = newValue;
  }

  void printStates() {
    System.out.println("Speed: " + speed + ", Gear: " + gear);
  }
}

class BicycleMain {
  public static void main(String[] args) {
    // create two different bicycle objects
    Bicycle bike1 = new Bicycle();
    Bicycle bike2 = new Bicycle();

    // Call to method
    bike1.changeGear(20);
    bike1.speedUp(15);
    bike1.applyBrake(5);

    bike2.changeGear(30);
    bike2.speedUp(20);
    bike2.applyBrake(3);

    bike1.printStates();
    bike2.printStates();
  }
}

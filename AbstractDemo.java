abstract class Vehicle{
    abstract void start();

}
abstract class Car extends Vehicle{
  
    void start() {
        System.out.println("Car is starting");
    }
}
public class AbstractDemo extends Car{
    public static void main(String[] args) {
        Car car = new  AbstractDemo();
        car.start();
    }
}
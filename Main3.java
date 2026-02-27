// Has a relationship 
class Engine{
    public void start(){
        System.out.println("Engine started");
    }

}

class Car{
       Engine engine;

    public Car(Engine engine) {
        this.engine = engine;

    }

    public void startCar(){
        engine.start();
        System.out.println("Car started");
    }
}
public class Main3{
 
 public static void main(String[] args) {
  Engine en=new Engine();
  Car car=new Car(en);
    car.startCar();

   }

}

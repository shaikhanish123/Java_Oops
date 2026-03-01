 class Engine{
    public String enginetype;
    public String enginemodel;

    public Engine(String enginetype,String enginemodel){
this.enginetype=enginetype;
this.enginemodel=enginemodel;
    }

    public void startengine(){
        System.out.println("Starting the engine...");
        System.out.println("Engine Type: " + enginetype);
        System.out.println("Engine Model: " + enginemodel);
    }
 } 
 class Car{
    public String carname;
    public String carmodel;
    Engine engine;

    public Car(String carname,String carmodel,Engine engine){
        this.carname=carname;
        this.carmodel=carmodel;
        this.engine=engine;
    }
    public void start(){
        System.out.println("Car Name: " + carname);
        System.out.println("Car Model: " + carmodel);
        this.engine.startengine();
    }
 }
 public class Loose_coupling{
    public static void main(String [] args){
        Engine engine =new Engine("V8","2022");
   Car car = new Car("BMW", "M5", engine);
    car.start();

    }
 }
 
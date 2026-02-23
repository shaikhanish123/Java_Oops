 class Animal {
    void eat(){
        System.out.println("something to eat");
    }
}
class Dog extends Animal{
    public void eat(){
System.out.println("dog is eating :");
    }
}
public class Test{
    public static void main(String[] args) {
        Dog d=new Dog();
        d.eat();
    }
}

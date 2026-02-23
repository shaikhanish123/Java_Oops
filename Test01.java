class Hierarchical {
    public void m1(){
        System.out.println("this is a hierarchical inheritancer");
    }
}
class child1 extends Hierarchical{
    public void m2(){
        System.out.println("this is child1 class");
    }
}
class child2 extends Hierarchical{
    public void m3(){
        System.out.println("this is child2 class");
    }
}
public class Test01{
    public static void main(String []args){
      
        child2 c2=new child2();
        c2.m1();
      
    }
}
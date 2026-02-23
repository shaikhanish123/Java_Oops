
 class Grandfather{
    public void m1(){
System.out.println("Grandfather's method");
    }
}
class father extends Grandfather{
    public void m2(){
System.out.println("Father's method");
    }
}
 class child extends father{
    public void m3(){
System.out.println("Child's method");
    }
 }
 public class Grandsond{
    public static void main(String []args){
        child c1=new child();
        c1.m1();
        c1.m3();
          }

 }

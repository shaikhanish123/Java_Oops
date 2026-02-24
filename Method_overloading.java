public class Method_overloading {

  public void m1(int a, int b){
    System.out.println(" this is a method 1");
  }  
  public void m2(int a, int b,int c){
    System.out.println(" this is a method 2");    
  }
  public static void main(String[] args){
    Method_overloading obj = new Method_overloading();
    obj.m1(19,10);
    obj.m2(1,2,3);

  }
}

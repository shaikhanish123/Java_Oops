interface Parent1 {
public void m1(); 
 }


interface parent2 {
public void m1();
    
} 
class child implements Parent1,parent2{
public void m1(){
    System.out.println("m1 method is implemented");
}

}
public class Main2{
    public static void main(String[]args){
        child c1=new child();
        c1.m1();
    }
}


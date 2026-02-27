 class ParentCovariant {

protected  int m1(int a){
System.out.println("this is a parent method");
return 1;
}
}

class ChildCovariant extends ParentCovariant{
@Override
public  int m1(int d){
System.out.println("this is a child method");
return 2;
  }
   }

   public class ExamCovariant {
   public static void main(String[] args) {
    ChildCovariant c=new ChildCovariant();
    c.m1(1);
    
}
    }

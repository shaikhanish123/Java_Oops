class Student {
String name;

Student(String name){
    this.name=name;
}

}
class  Teacher{
   String name;

   Teacher(String name){
       this.name=name;
   }
   public void teach(Student s1){
    System.out.println("teaching something");
   }

}
public class Main {
public static void main(String[] args){
    Student s1=new Student("shaikh");
    Teacher t1=new Teacher("shaikh");
    t1.teach(s1);

}
}
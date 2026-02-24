class Employee {
public  int id;
public String name;
public String salary;

 public  Employee(int id, String name, String salary){
    this.id=id;
    this.name=name;
    this.salary=salary;
    System.out.println("constructor data printed: "+id+" "+name+""+salary);
}
}

class Department{
    
    public String department_name;
    public String location;
    Employee employee;

    public Department(String department_name, String location , Employee employee){
       this.employee=employee;
        this.department_name = department_name;
        this.location = location;

       System.out.println("Department data printed: "+department_name+" "+location);
    }

    public void display(){
    System.out.println("employee data printed: "+employee.id+"   "+employee.name+"   "+employee.salary);
    }

}
class Main2{
    public static void main(String []args){
        Employee e1=new Employee(1,"himanshu","50000");
        Department d1=new Department("Noida","Rohit",e1);

        d1.display();

    }}
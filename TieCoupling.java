 class Department {
    public String departmentname;

    public  Department(String departmentname)
    {
        this.departmentname = departmentname;
     
    }

   public void displayDepartmentDetails()
   {
       System.out.println("Department Name: " + departmentname);
   } 
}

 class University{
    public String universityname;

    Department department;

public University(String universityname,String departmentname)
    {
        this.universityname = universityname;
        this.department=new Department(departmentname);
    
    }

   public void displayUniversityDetails()
   {
       System.out.println("University Name: " + universityname);
       department.displayDepartmentDetails();
    
   } 
}
public class TieCoupling{
    public static void main(String[] args) {
      University university=new University("mumbai university","computer science");
      university.displayUniversityDetails();
      
      
    }
}

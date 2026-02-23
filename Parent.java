class Parent{
    float salary=45000;
}
class child extends Parent{
    int bonus=300;
    public static void main(String[] args) {
        Parent p1=new Parent();
        child c1=new child();
        System.out.println(c1.salary);
        System.out.println("child bonus is"+((child)p1).bonus);

    }

}

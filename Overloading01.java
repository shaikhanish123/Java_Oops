class Overloading01 {
    public int  m1(int a){
        System.out.println("Method with no parameters");
        return a+15;
    }
    public int m1(int a, int b){
        System.out.println("Method with two parameters: " + a + ", " + b);
        return a+b;
    }
    public static void main(String[] args){
        Overloading01 ob1 = new Overloading01();
        int result = ob1.m1(5);
        System.out.println(result);
        System.out.println(ob1.m1(5));
    }
    
}
 

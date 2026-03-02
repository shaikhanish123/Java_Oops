   interface Printable {
    public void print();
   public void display();
}
class Document implements Printable{
    public void print(){
        System.out.println("Printing the document...");
    }
    public void display(){
        System.out.println("Displaying the document...");
    }

}
public class Interface_example{
    public static void main(String [] args){
        Printable doc = new Document();
        doc.print();
        doc.display();
    }
    
}
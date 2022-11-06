package class_and_object;

public class Book {

    //properties
    String name=" low of attraction";
    int pages= 535;
    String Writer="Jojo";
    public static void main(String[] args) {
        //TODO SYNTAX= CLASSNAME ObjectName= NEW ClassName();

        Book obj= new Book();
        System.out.println("printing book name"+obj.name);
        System.out.println("printing book pages "+obj.pages);
        System.out.println("printing book writer "+obj.Writer);
    }

}

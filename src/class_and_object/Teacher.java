package class_and_object;

public class Teacher {
    String Name;
    String Dept;
    int age;
    //parameterized constructor

    public Teacher(String name, String dept, int age) {
        Name = name;
        Dept = dept;
        this.age = age;
    }

    public static void main(String[] args) {
        Teacher obj= new Teacher("Rahul", "English",1);
        System.out.println(" Name:"+obj.Name+ " Dept:"+obj.Dept+" Age:"+obj.age);
    }
}

package class_and_object;

public class DemoStudent {
    String name;
    int RollNo;
    String Section;
    //parameterize construction


    public DemoStudent(String name, int rollNo, String section) {
        this.name = name;
        RollNo = rollNo;
        Section = section;
    }

    public static void main(String[] args) {
        DemoStudent obj= new DemoStudent("RAHUL",1,"CS");
        System.out.println(" Name :"+obj.name +","+"RollNo:"+obj.RollNo +","+"Section:"+obj.Section);

        DemoStudent obj2= new DemoStudent("lucky",2,"IT");
        System.out.println("Name: "+obj2.name+","+"RollNo:"+obj2.RollNo+","+"Section: "+obj2.Section);
    }
}

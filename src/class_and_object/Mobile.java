package class_and_object;

public class Mobile {
     String Name=" Iphone";
     int ram= 64;
     String Brand="Apple";

    public static void main(String[] args) {
         Mobile obj= new Mobile();
        System.out.println(" printing mobile name "+obj.Name);
        System.out.println(" printing mobile Ram "+obj.ram);
        System.out.println(" printing mobile Brand "+obj.Brand);
    }
}

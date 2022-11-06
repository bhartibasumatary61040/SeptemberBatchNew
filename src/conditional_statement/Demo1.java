package conditional_statement;

public class Demo1 {
    public static void main(String[] args) {
        int age = 19;
        if (age < 18) {
            System.out.println("person is young");
        }
        if (age > 18) {
            System.out.println(" person is child");

        }


        int height = 4;

        if (height >= 6) {

            System.out.println("Person is very tall");
        }

        if (height < 6 && height > 5) {
            System.out.println("Person is Medium tall");
        }

        if (height < 5) {

            System.out.println("Person is very less tall");
        }
    }
}

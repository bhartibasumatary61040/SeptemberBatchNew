package variable;

public class VariableIncrDecrement {
    public static void main(String[] args) {
            int a= 33;
             int b= 11;
              int result= a%b;
        System.out.println(" module is " + result );

        a+=b;
        System.out.println(" value of a+=b is "+a);

        a++;
        System.out.println(" value of a++ is "+a);
         a--;
        System.out.println(" value of a-- is "+a);

    }
}

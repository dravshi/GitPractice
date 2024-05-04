
public class Calculator {
    public static void main(String[] args) {
        int a = 30;
        int b = 5;
        int c = add(a,b);
        System.out.println("Addition result:"+c);

        c = sub(a,b);
        System.out.println("Subtraction result:"+c);

        c = mult(a,b);
        System.out.println("Multiplication result:"+c);

        c = div(a,b);
        System.out.println("Division result:"+c);
    }
    public static int add (int a, int b) {
        return a + b;
    }

    public static int sub (int a, int b) {
        return a - b;
    }
    public static int mult (int a, int b) {
        return a * b;
    }

    public static int div (int a, int b) {
        return a / b;
    }
}

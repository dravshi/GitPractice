
public class Calculator {
    public static void main(String[] args) {
        int c = add(5,6);
        System.out.println("Addition result:"+c);

        c = sub(5,6);
        System.out.println("Subtraction result:"+c);
    }
    public static int add (int a, int b) {
        return a + b;
    }

    public static int sub (int a, int b) {
        return a - b;
    }
}

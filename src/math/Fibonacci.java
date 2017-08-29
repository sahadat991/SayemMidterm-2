package math;

public class Fibonacci {

    public static void main(String[] args) {

        int a = 0;
        int b = 1;

        for (int i = 0; i < 40; i++) {
            System.out.println(a);
            a = a + b;
            b = a - b;
        }
    }
}
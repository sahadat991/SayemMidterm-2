package math;

/**
 * Created by mrahman on 04/22/17.
 */
public class Factorial {

    public static void main(String[] args) {

        System.out.println("Factorial of 5 is: " + factorial(5));
        System.out.println("Factorial of 5 is: " + fact(5));
    }

    public static int factorial(int number) {

        if (number == 0) {
            return 1;
        }
        return number * factorial(number - 1);
    }

    public static int fact(int num) {
        int rs = 1;
        while (num != 0) {
            rs = rs * num;
            num--;
        }
        return rs;

    }
}
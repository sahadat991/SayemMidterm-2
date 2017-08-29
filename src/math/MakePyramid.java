package math;

import java.util.Scanner;

public class MakePyramid {

    public static void main(String args[]) {
        int i, space, rows = 10, k=0;
        for(i=1; i<=rows; i++)
        {
            for(space=1; space<=(rows-i); space++)
            {
                System.out.print("  ");
            }
            while(k != (2*i-1))
            {
                System.out.print("* ");
                k++;
            }
            k = 0;
            System.out.println();
        }
    }
}